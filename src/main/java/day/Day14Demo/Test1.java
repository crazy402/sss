package day.Day14Demo;

/**
 * @ClassName Test1
 * @Description //创建线程的方式
 * @Author crazy402
 * @Date 2022/5/27 19:50
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
      //  myThread.run();

        myThread.setName("张三");
        myThread.start();

        for (int i = 0; i < 5; i++) {
       //     System.out.println("man线程执行了...");
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName()+"线程执行了...");
        }
    }
}
