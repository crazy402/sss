package jdbcdemo.Dao;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/17 18:07
 * @description //
 **/
public class AccountDao {
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 获得钱
     * @param money
     * @param username
     * @param connection
     * @return
     * @throws SQLException
     */
    public int addMoney(double money,String username, Connection connection) throws SQLException {

        String sql = "update account set money = money + ? where username = ? ";
        return queryRunner.update(connection, sql, money, username);

    }

    /**
     * 失去钱
     * @param money
     * @param username
     * @param connection
     * @return
     * @throws SQLException
     */
    public int subMoney(double money,String username, Connection connection) throws SQLException {

        String sql = "update account set money = money - ? where username = ? ";
        return queryRunner.update(connection, sql, money, username);

    }
}
