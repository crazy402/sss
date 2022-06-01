package homework.day15.Test3;

/**
 * @ClassName Test3
 * @Description //
 * 创建和启动2个子线程，一个打印奇数，一个打印偶数，
 *
 * （1）要求实现交替打印。
 *
 * （2）每个数打印间隔1秒
 * @Author crazy402
 * @Date 2022/5/30 19:03
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {

        OneThread oneThread = new OneThread();
        TwoThread twoThread = new TwoThread();

        new Thread(oneThread).start();
        new Thread(twoThread).start();

        /*OneThread oneThread = new OneThread();

        new Thread(oneThread).start();
        new Thread(oneThread).start();*/

    }
}
