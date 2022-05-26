package day.Day9Demo;

/**
 * @ClassName Mouse
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 9:22
 * @Version 1.0
 **/
public class MouseImpl implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");

    }

    @Override
    public void openDef() {
        System.out.println("打开重写默认方法");
    }

    public void click() {
        System.out.println("鼠标点击");
    }

    @Override
    public void open1() {
        System.out.println("鼠标开启111");
    }


}
