package com.atgugu.a_mysql01.demo01;

import com.atgugu.a_mysql01.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Jack
 * @version 1.0
 * @date 2022/6/17 18:12
 * @description
 **/
public class Test01 {

    /**
     * 使用批量处理
     * 2.105 秒
     */
    @Test
    public void insertTestBatched() throws Exception {
        long start = System.currentTimeMillis();
        Connection con = JdbcUtils.getConnection();
        String sql = "insert into product values(?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        for (int i = 0; i < 10000; i++) {
            pst.setObject(1, null);
            pst.setObject(2, "百事可乐");
            pst.setObject(3, 3.5);
            pst.setObject(4, 500);
            pst.setObject(5, 2);

            pst.addBatch();
        }
        pst.executeUpdate();

        JdbcUtils.closeStream(null, pst, con);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * 原始速度
     * 19.438 秒
     */
    @Test
    public void testInsert() throws Exception {
        long start = System.currentTimeMillis();
        Connection con = JdbcUtils.getConnection();
        String sql = "insert into product values(?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        for (int i = 0; i < 10000; i++) {
            pst.setObject(1, null);
            pst.setObject(2, "百事可乐");
            pst.setObject(3, 3.5);
            pst.setObject(4, 500);
            pst.setObject(5, 2);

            pst.executeUpdate();
        }

        JdbcUtils.closeStream(null, pst, con);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
