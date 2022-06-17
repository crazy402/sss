package com.atgugu.a_mysql01.demo01;

import com.atgugu.a_mysql01.utils.DataSourceUtils;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Jack
 * @version 1.0
 * @date 2022/6/17 19:00
 * @description
 **/
public class Test02 {

    /**
     * 查询结果集的封装对象：BeanHandler
     * 查询结果第一行数据，存储JavaBean：Product
     * BeanHandler类的构造方法，传递JavaBean对象的class文件对象
     * 查询不到数据，返回null
     */
    public void beanHandler() throws SQLException{
        QueryRunner qr = new QueryRunner();
    }

    /**
     *  QueryRunner类新增数据
     */
    @Test
    public void insertTest() throws Exception {
        QueryRunner qr = new QueryRunner();
        String sql = "insert into product values(?,?,?,?,?)";
        Connection con = DataSourceUtils.getConnection();
        //调用qr对象的方法update执行
        //SQL语句参数比较多，建议参数写在数组里面，参数>=3个
        Object[] params = {null,"柠檬茶",4,135,2};
        int row = qr.update(con, sql, params);
        System.out.println("row = " + row);
        DbUtils.closeQuietly(con);
    }
}
