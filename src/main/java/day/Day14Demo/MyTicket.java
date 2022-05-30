package day.Day14Demo;

/**
 * @ClassName MyTicket
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 21:00
 * @Version 1.0
 **/
public class MyTicket implements Runnable {
    int ticket = 100;

    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj){
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票");
                    ticket--;
                }
            }

        }
    }
}
