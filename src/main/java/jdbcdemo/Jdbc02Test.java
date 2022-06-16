package jdbcdemo;

import org.junit.jupiter.api.Test;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/15 14:28
 * @description //
 **/
public class Jdbc02Test {
    @Test
    public void insertProduct() throws Exception {
        Connection connection = JdbcUtils.getConnection();

        Statement statement = connection.createStatement();

        String sql = "insert into product values(null,'阔落', 3.99, 199, 2)";
        int i = statement.executeUpdate(sql);

        statement.close();
        connection.close();

    }
}
