package homework.day15.Test4;

/**
 * @ClassName Wife
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 20:27
 * @Version 1.0
 **/
public class Wife implements Runnable{

    private Bank bank;

    public Wife(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bank) {
                try {
                    Thread.sleep(500L);
                    bank.notify();
                    System.out.println("妻子开始取钱,目前账号状态: 账户"+bank.getAccount()+"余额: "+bank.getBalance());
                    double random = Math.random()*10000;
                    if (bank.getBalance() - random < 0) {
                        System.out.println("妻子想取" + random + "钱, 但是余额不足,请等待...");
                        bank.wait();
                    }else {
                        System.out.println("本次取钱: "+random);
                        bank.setBalance(bank.getBalance() - random);
                        System.out.println("妻子取钱结束,目前账户状态: 账户"+bank.getAccount()+"余额: "+bank.getBalance());
                        bank.wait();
                    }


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
