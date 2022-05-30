package day.Day14Demo;

/**
 * @ClassName MyRunable
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 20:10
 * @Version 1.0
 **/
public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了");
        }
    }
}
