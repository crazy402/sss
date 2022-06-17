package jdbcdemo;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;
import pojo.Product;
import utils.DataSourceUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/17 11:17
 * @description //使用dbUtils
 **/
public class Jdbc06Test {
    /**
     * QueryRunner的使用
     */
    @Test
    public void insertTest() throws SQLException {
        // 创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner();

        String sql = "insert into `product` values(?,?,?,?,?)";

        int row = queryRunner.update(DataSourceUtils.getConnection(), sql, null, "元气森林", 5, 12, 2);

        DbUtils.closeQuietly(DataSourceUtils.getConnection());

    }

    @Test
    public void selectTest() {

    }

    /**
     * 查询结果集的封装对象 BeanHandler
     * 查询到的第一行数据 存到JavaBean中
     */
    @Test
    public void testBeanHandler() throws SQLException {
        // 创建QueryRunner对象  有参数的构造的方法 传递连接池的接口DataSource实现类
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());

        // 查询全表数据
        String sql = "select * from `product`";

        // queryRunner 调用query方法 实现查询数据
        Product query = queryRunner.query(sql, new BeanHandler<Product>(Product.class));

        System.out.println("query = " + query);


    }

    /**
     * 查询结果集的封装对象  BeanListHandler
     * 查询结果集的每一行存储到JavaBean中 多个对象存储到List集合中
     * BeanListHandler构造方法 传递JavaBean对象的class文件对象
     */
    @Test
    public void testBeanListHandler() throws SQLException {
        // 创建QueryRunner对象  有参数的构造的方法 传递连接池的接口DataSource实现类
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());

        // 查询全表数据
        String sql = "select * from `product`";

        List<Product> query = queryRunner.query(sql, new BeanListHandler<Product>(Product.class));

        for (Product product : query) {
            System.out.println("product = " + product);
        }

    }

    /**
     *
     * Scalarhandler实现类 适合单值查询的结果集  查询的数据只有一行一列 (聚合函数)
     */
    @Test
    public void testScalarHandler() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());

        String sql = "select count(1) from `product`";

        Object obj = queryRunner.query(sql, new ScalarHandler<>());

        System.out.println("obj = " + obj);
    }


}
