package day.Day14Demo;

/**
 * @ClassName MyRunable1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/28 14:11
 * @Version 1.0
 **/
public class MyRunable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "执行"+ i+"次");
        }
    }
}
