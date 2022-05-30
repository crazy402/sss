package day.Day14Demo;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 20:55
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行了");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                    System.out.println(Thread.currentThread().getName()+"执行了");
                }
            }
        },"张三").start();


    }
}
