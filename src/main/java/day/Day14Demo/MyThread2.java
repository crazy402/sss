package day.Day14Demo;

/**
 * @ClassName MyThread2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/28 11:47
 * @Version 1.0
 **/
public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000L);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("myThread执行"+i+"次");
        }


    }
}
