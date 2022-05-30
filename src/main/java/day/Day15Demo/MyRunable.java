package day.Day15Demo;

/**
 * @ClassName MyRunable
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 15:23
 * @Version 1.0
 **/
public class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行了");
    }
}
