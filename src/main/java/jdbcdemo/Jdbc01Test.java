package jdbcdemo;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/15 10:33
 * @description // jdbc练习
 **/
public class Jdbc01Test {
    @Test
    public void insertProduct() {

        Connection connection = null;
        try {
            ///DriverManager.registerDriver(new Driver());
            // 通过反射注册驱动 告知jvm是那个数据库的驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获取 Java和数据库的链接
            //"jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&useSSL=true"
            String url = "jdbc:mysql://localhost:3306/test";
            String username = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url,username, password);

            // 获取Sql语句的执行对象  获取接口 Statement 的实现类对象
            Statement statement = connection.createStatement();

            String sql = "insert into product values(null,'饼干', 3.99, 199, 2)";

            int row = statement.executeUpdate(sql);

            if (row > 0) {
                System.out.print("插入成功");
                System.out.println("row = " + row);
            }else {
                // todo 这里可以加自定义异常
                System.out.println("失败");
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }





}
