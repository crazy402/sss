package utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/17 10:11
 * @description 实现德鲁伊连接池的工具类
 **/
public class DataSourceUtils {
    private static DataSource dataSource;

    // 读取配置文件
    static {

        try {
            InputStream ras = DataSourceUtils.class.getClassLoader().getResourceAsStream("druid.properties");

            Properties prop = new Properties();
            prop.load(ras);
            //创建连接池接口DataSource的实现类对象
            dataSource = DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static DataSource getDataSource() {
        return dataSource;
    }


}
