package day.Day14Demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票");
                    ticket--;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

                lock.unlock();
            }


        }
    }
}
