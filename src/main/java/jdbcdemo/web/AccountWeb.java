package jdbcdemo.web;

import jdbcdemo.service.AccountService;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/17 18:45
 * @description //
 **/
public class AccountWeb {
    public static void main(String[] args) {
        // 创建业务层
        AccountService accountService = new AccountService();

        String s = accountService.transferMoney("tom", "jerry", 1000);
        System.out.println(s);
    }
}
