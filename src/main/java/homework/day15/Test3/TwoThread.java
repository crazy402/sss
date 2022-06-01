package homework.day15.Test3;

/**
 * @ClassName TneThread
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 19:11
 * @Version 1.0
 **/
public class TwoThread implements Runnable {
    static int i ;

    @Override
    public void run() {
        while (true) {
            synchronized (TwoThread.class) {
                try {
                    TwoThread.class.notify();
                    Thread.sleep(1000L);
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    i ++;
                    TwoThread.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
