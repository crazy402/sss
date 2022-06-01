package homework.day15.Test1;

/**
 * @ClassName Test
 * @Description //
 * 在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。
 * @Author crazy402
 * @Date 2022/5/30 18:46
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2 == 0) {
                        System.out.println(Thread.currentThread().getName()+"-->"+i);
                    }
                }
            }
        },"子线程").start();

        for (int i = 0; i < 100; i++) {
            if (i%2 != 1) {
                System.out.println(Thread.currentThread().getName()+"-->"+i);
            }

        }
    }
}
