package day.Day14Demo;

/**
 * @ClassName Test001
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/28 11:49
 * @Version 1.0
 **/
public class Test001 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.setName("张三");

        myThread2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+i+"次");
        }


    }
}
