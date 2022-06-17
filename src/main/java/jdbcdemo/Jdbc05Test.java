package jdbcdemo;

import org.junit.jupiter.api.Test;
import utils.DataSourceUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/17 10:25
 * @description //
 **/
public class Jdbc05Test {
    @Test
    public void testDataSource() {
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = DataSourceUtils.getConnection();
            String sql = "";
            pst = connection.prepareStatement(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
