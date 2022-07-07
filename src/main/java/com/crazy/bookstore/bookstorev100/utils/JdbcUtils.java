package com.crazy.bookstore.bookstorev100.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/15 14:22
 * @description //自定义的工具类
 * 数据库操作的重复抽取
 * 抽取到方法中 直接调用
 **/
public class JdbcUtils {
    private static  String diver;
    private static  String url;
    private static  String user;
    private static  String password;

    static{
        ClassLoader classLoader = JdbcUtils.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("db.properties");

        try {
            Properties pro = new Properties();
            pro.load(is);

            diver = pro.getProperty("diver");
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");

            Class.forName(diver);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws Exception{

        /*///DriverManager.registerDriver(new Driver());
        // 通过反射注册驱动 告知jvm是那个数据库的驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取 Java和数据库的链接
        //"jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&useSSL=true"
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "123456";*/


        return DriverManager.getConnection(url, user, password);

    }




    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
