package day.Day14Demo;

/**
 * @ClassName MyThread1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/28 11:19
 * @Version 1.0
 **/
public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("mythreadc执行"+i+"次");

        }
    }
}
