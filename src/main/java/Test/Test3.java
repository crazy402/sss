package Test;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/6 20:35
 * @Version 1.0
 **/
public class Test3 {
    static int x, y, z;

    static {
        int x = 5;
        x--;
    }

    static {
        x--;
    }

    public static void main(String[] args) {
        System.out.println("x=" + x);
        z--;
        method();
        System.out.println("result:" + (z + y + ++z));
    }

    public static void method() {
        // -1 + 1
        y = z++ + ++z;

    }
}
