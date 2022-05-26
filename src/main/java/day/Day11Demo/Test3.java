package day.Day11Demo;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/24 11:42
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {

        String s = "abc.txt";
        method(s);
        System.out.println("我也要执行");

    }

    public static void method(String s) {
        if (!s.endsWith(".txt")) {
            throw new NullPointerException("身体被掏空");
        }

        System.out.println("我要执行");
    }
}
