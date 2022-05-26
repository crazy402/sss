package day.Day5Demo;

/**
 * @ClassName Test01Overload
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/17 10:27
 * @Version 1.0
 **/
public class Test01Overload {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        int sum1 = sum(a,b);
        int sum2 =sum(a, b, c);
        int sum3 =sum(a, b, c, d);

    }


    private static int sum(int a, int b) {
        int sum = a+b;
        return sum;
    }
    private static int sum(int a, int b, int c) {
        int sum = a+b+c;
        return sum;
    }
    private static int sum(int a, int b, int c, int d) {
        int sum = a+b+c+d;
        return sum;
    }

}
