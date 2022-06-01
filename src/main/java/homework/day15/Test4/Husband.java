package homework.day15.Test4;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @ClassName Husband
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 20:26
 * @Version 1.0
 **/
public class Husband implements Runnable{
    private Bank bank;

    public Husband(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bank) {
                try {
                    Thread.sleep(500L);
                    bank.notify();
                    System.out.println("丈夫开始存钱,目前账号状态: 账户"+bank.getAccount()+"余额: "+bank.getBalance());
                    double random = Math.random()*10000;
                    System.out.println("本次存钱: "+random);
                    bank.setBalance(bank.getBalance() + random);
                    System.out.println("丈夫存钱结束,目前账户状态: 账户"+bank.getAccount()+"余额: "+bank.getBalance());
                    bank.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
