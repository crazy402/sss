package jdbcdemo.service;

import jdbcdemo.Dao.AccountDao;
import org.apache.commons.dbutils.DbUtils;
import utils.DataSourceUtils;

import java.sql.Connection;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/17 18:32
 * @description //
 **/
public class AccountService {
    /**
     * 转账操作
     *
     * @return
     */
    public String transferMoney(String outName, String inName, double money) {
        Connection connection = null;

        String message = "转账失败";

        try {

            connection = DataSourceUtils.getConnection();

            // 开启手动事务
            connection.setAutoCommit(false);


            //业务操作
            AccountDao accountDao = new AccountDao();

            int i = accountDao.addMoney(money, inName, connection);
            int j = accountDao.subMoney(money, outName, connection);


            // 提交 事务
            DbUtils.commitAndCloseQuietly(connection);

            if (i > 0 && j > 0) {
                return "转账成功";
            }
        } catch (Exception e) {
            e.printStackTrace();

            // 回滚业务
            DbUtils.rollbackAndCloseQuietly(connection);
        }

        return message;

    }

}
