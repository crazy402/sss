package com.atgugu.a_mysql01.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Jack
 * @version 1.0
 * @date 2022/6/17 18:27
 * @description
 **/
public class DataSourceUtils {
    private static DataSource dataSource;

    /**
     * 实现德鲁伊连接池的工具类
     * 标准接口：javax.sql.DataSource  抽象方法 Connection getConnection() 池中取出连接对象
     * 接口的实现类com.alibaba.druid.pool.DruidDataSource
     * 使用静态方法创建一次线程池
     */
    static {
        try {
            // 获取配置文件
            InputStream in =
                    DataSourceUtils.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            // 读取配置数据
            properties.load(in);
            //创建连接池接口DataSource的实现类对象
            //类名：DruidDataSourceFactory静态方法：createDataSource() 返回new DruidDataSource();
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 定义静态方法，调用DataSource接口实现类的方法
     * getConnection()返回连接对象
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
