package day.Day6Demo;

/**
 * @ClassName Test4
 * @Description //
 * 递归写出1-100的累乘
 * @Author crazy402
 * @Date 2022/5/17 20:15
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        int method = method(10);
        System.out.println("method = " + method);

    }
    public static int method(int n) {
        if (n == 1) {
            return 1;
        }

        return n * method(n-1);

    }
}
