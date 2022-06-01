package homework.day15.Test3;

/**
 * @ClassName OneThread
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 19:11
 * @Version 1.0
 **/
public class OneThread implements Runnable {
   // int i ;

   // private static int num;
    @Override
    public void run() {
        while (true) {
            synchronized (TwoThread.class) {
                try {
                    TwoThread.class.notify();
                    Thread.sleep(1000L);
                    System.out.println(Thread.currentThread().getName()+":"+TwoThread.i);
                    TwoThread.i ++ ;
                    TwoThread.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }

            /*while(true){
                synchronized (OneThread.class) {
                    try {
                        OneThread.class.notify();
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + ":" + ++num);
                        OneThread.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }*/
        }

}
