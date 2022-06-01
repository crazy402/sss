package homework.day15.Test4;

import java.math.BigDecimal;

/**
 * @ClassName Bank
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 20:24
 * @Version 1.0
 **/
public class Bank {
    private String account = "尼古拉斯赵四";
    private Double balance = 0.0;


    public Bank() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Bank(String account, Double balance) {
        this.account = account;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "account='" + account + '\'' +
                ", balance=" + balance +
                '}';
    }
}
