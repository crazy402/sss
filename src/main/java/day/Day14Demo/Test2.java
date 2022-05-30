package day.Day14Demo;

/**
 * @ClassName Test2
 * @Description //实现Runable线程完成线程
 * @Author crazy402
 * @Date 2022/5/27 20:12
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();


        Thread thread = new Thread(myRunable, "盖伦");
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了");
        }
    }
}
