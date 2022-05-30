package day.Day14Demo;

/**
 * @ClassName Test6
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/28 14:12
 * @Version 1.0
 **/
public class Test6 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunable1(), "张三");
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+ "执行"+ i+"次");
        }

    }
}
