package day.Day14Demo;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 21:02
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        Thread thread1 = new Thread(myTicket, "广坤");
        Thread thread2 = new Thread(myTicket, "赵四");
        Thread thread3 = new Thread(myTicket, "刘能");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
