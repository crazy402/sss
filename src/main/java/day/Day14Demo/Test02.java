package day.Day14Demo;

/**
 * @ClassName Test02
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/28 11:21
 * @Version 1.0
 **/
public class Test02 {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();

//        myThread.start();

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行" + i+"次");
        }
    }
}
