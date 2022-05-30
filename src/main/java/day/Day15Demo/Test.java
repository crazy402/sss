package day.Day15Demo;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 10:50
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        BaoZiPu baoZiPu = new BaoZiPu();

        Producer producer = new Producer(baoZiPu);
        Consumer consumer = new Consumer(baoZiPu);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
