package com.atgugu.a_mysql01.utils;


import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author Jack
 * @version 1.0
 * @date 2022/6/15 10:57
 * @description
 **/
@SuppressWarnings("all")
public class JdbcUtils {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        try {
            // 获取类加载器
            ClassLoader loader = JdbcUtils.class.getClassLoader();
            // 调用流对象读取配置文件
            InputStream stream = loader.getResourceAsStream("db.properties");
            // 把读取信息存入properties集合
            Properties properties = new Properties();
            // 加载集合信息,根据key分别获取value
            properties.load(stream);
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            // 反射Driver,利用mysql实现类的静态代码块注册驱动
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     *
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, username, password);
    }

    /**
     * 关闭流
     *
     * @param con
     * @param stat
     * @param set
     */
    public static void closeStream(ResultSet set, Statement stat, Connection con) {
        if (set != null) {
            try {
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    // 完整代码编写
    /*@Test
    public void connector() throws Exception {
        // a.注册驱动程序
        // DriverManager.registerDriver(new Driver());
        // mysql驱动源码有个静态代码块执行代码就是注册,因此可以直接用反射获取驱动Driver来注册
        Class.forName("com.mysql.cj.jdbc.driver");
        // b.网络获取java和数据库连接
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "root";
        Connection connect = DriverManager.getConnection(url, username, password);
        // c.获取sql语句的执行和对象
        Statement statement = connect.createStatement();
        // d.写sql语句
        String sql = "insert into product values(null,'饼干',3.99,233,2)";
        // e.获取返回结果
        int i = statement.executeUpdate(sql);
        System.out.println("i = " + i);
        // f.释放资源
        connect.close();
        statement.close();
    }*/

}
