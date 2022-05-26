package day.Day6Demo;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/17 20:12
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {
        method(3);

    }

    public static void method(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        n--;

        method(n);
    }
}
