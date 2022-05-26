package day.Day9Demo;

/**
 * @ClassName KeyBroadImpl
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 11:09
 * @Version 1.0
 **/
public class KeyBroadImpl implements USB{
    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    @Override
    public void open1() {

    }

    public void input() {
        System.out.println("打字");
    }
}
