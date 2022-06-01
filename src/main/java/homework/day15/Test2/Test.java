package homework.day15.Test2;

/**
 * @ClassName Test
 * @Description //
 * 案例：创建和启动2个子线程，一个打印1-10之间奇数，一个打印1-10之间偶数，
 *
 * （1）要求每个线程要么不打印，要么就连续打印5个数，每个数打印间隔500毫秒
 *
 * （2）但两个线程不要求交替打印。
 * @Author crazy402
 * @Date 2022/5/30 18:49
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (o) {
                    for (int i = 1; i <= 10; i++) {
                        if (i%2 == 0) {
                            System.out.println(Thread.currentThread().getName()+"-->"+i);
                        }
                    }
                }

            }
        },"子线程1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (o) {
                    for (int i = 1; i <= 10; i++) {
                        if (i%2 == 1) {
                            System.out.println(Thread.currentThread().getName()+"-->"+i);
                        }
                    }
                }

            }
        }, "子线程2").start();
    }
}
