package jdbcdemo;

import org.junit.jupiter.api.Test;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/17 8:57
 * @description //
 **/
public class Jdbc04Test {
    @Test
    public void testInsert() {
        long star = System.currentTimeMillis();
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = JdbcUtils.getConnection();
            String sql = "insert into `product` values (?,?,?,?,?)";
            pst = connection.prepareStatement(sql);

            for (int i = 0; i < 10000; i++) {
                pst.setObject(1, null);
                pst.setObject(2, "百事" + i);
                pst.setObject(3, 4);
                pst.setObject(4, 3);
                pst.setObject(5, 2);

                pst.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection, pst, null);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - star);

    }

    /**
     * 批量处理
     */
    @Test
    public void testInsertBatch() {
        long star = System.currentTimeMillis();
        Connection connection = null;
        PreparedStatement pst = null;
        try {
            connection = JdbcUtils.getConnection();
            String sql = "insert into `product` values (?,?,?,?,?)";
            pst = connection.prepareStatement(sql);

            for (int i = 0; i < 10000; i++) {
                pst.setObject(1, null);
                pst.setObject(2, "百事" + i);
                pst.setObject(3, 4);
                pst.setObject(4, 3);
                pst.setObject(5, 2);

                pst.addBatch();
            }
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection, pst, null);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - star);


    }
}
