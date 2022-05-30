package day.Day14Demo;

/**
 * @ClassName Test7
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/28 14:29
 * @Version 1.0
 **/
public class Test7 {
    public static void main(String[] args) {

        new Thread(() -> {

            for (int i = 0; i < 5; i++) {

                System.out.println(Thread.currentThread().getName() + "..执行");
            }

        }, "德玛西亚").start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {

                System.out.println(Thread.currentThread().getName() + "..执行");
            }
        }, "皮尔特沃夫").start();


    }
}
