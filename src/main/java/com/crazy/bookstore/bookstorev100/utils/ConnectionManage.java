package com.crazy.bookstore.bookstorev100.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/7/7 10:26
 * @description //
 **/
public class ConnectionManage {
    private static ThreadLocal<Connection> local = new ThreadLocal<>();

    /**
     * 提交事务
     */
    public static void commitTransaction() {
        try {
            getConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 释放资源
     */
    public static void close() {
        try {
            getConnection().close();
            local.remove();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *事务回滚
     */
    public static void rollbackTransaction() {
        try {
            getConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 开启事务
     */
    public static void beginTransaction() throws SQLException {
        getConnection().setAutoCommit(false);
    }

    /**
     * 静态方法 返回数据库链接对象
     * 1： 从Local对象中，get()取出连接
     * 2： 判断连接对象，如果没有
     * 从连接池中获取连接
     * 3： 存储在Local对象中
     */
    public static Connection getConnection() throws SQLException {
        Connection conn = local.get();

        if (conn == null) {
            conn = DataSourceUtils.getConnection();
            local.set(conn);
        }
        return conn;
    }
}
