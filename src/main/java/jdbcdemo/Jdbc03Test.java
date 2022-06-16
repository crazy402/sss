package jdbcdemo;

import org.junit.jupiter.api.Test;
import pojo.Product;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/15 15:20
 * @description //
 **/
public class Jdbc03Test {
    @Test
    public void findAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();

            String sql = "SELECT * FROM `product`";

            resultSet = statement.executeQuery(sql);

            List<Product> list = new ArrayList<>();

            while (resultSet.next()) {
                Product product = new Product();
                product.setPid(resultSet.getInt("pid"));
                product.setPname(resultSet.getString("pname"));
                product.setPrice(resultSet.getDouble("price"));
                product.setNum(resultSet.getInt("num"));
                product.setCid(resultSet.getInt("cid"));
                list.add(product);
            }

            for (Product product : list) {
                System.out.println("product = " + product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection, statement, resultSet);
        }


    }

    @Test
    public void addProduct() {
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcUtils.getConnection();

            String sql = "INSERT INTO `product` VALUES(?,?,?,?,?)";
            pst = connection.prepareStatement(sql);

            pst.setObject(1,null);
            pst.setObject(2,"雪碧");
            pst.setObject(3,2.50);
            pst.setObject(4,100);
            pst.setObject(5,2);

            int row = pst.executeUpdate();
            System.out.println("row = " + row);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection, pst, null);
        }
    }

    @Test
    public void selectProduct() {
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcUtils.getConnection();

            String sql = "select * from `product`";
            pst = connection.prepareStatement(sql);

            List<Product> list = new ArrayList<>();

            resultSet = pst.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setPid(resultSet.getInt("pid"));
                product.setPname(resultSet.getString("pname"));
                product.setPrice(resultSet.getDouble("price"));
                product.setNum(resultSet.getInt("num"));
                product.setCid(resultSet.getInt("cid"));

                list.add(product);

            }

            for (Product product : list) {
                System.out.println("product = " + product);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection, pst, resultSet);
        }

    }
}
