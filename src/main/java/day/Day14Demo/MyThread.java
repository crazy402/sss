package day.Day14Demo;

/**
 * @ClassName MyThread
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 19:51
 * @Version 1.0
 **/
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            //System.out.println("myThread线程执行了....");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"线程执行了...");
        }
    }
}
