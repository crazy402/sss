package demo;

/**
 * @ClassName Demo03Rec
 * @Description //递归
 * @Author crazy402
 * @Date 2022/5/18 11:16
 * @Version 1.0
 **/
public class Demo03Rec {
    public static void main(String[] args) {
        int mul = mul(5);
        System.out.println("mul = " + mul);

        int fibonacci = Fibonacci(12);
        System.out.println("fibonacci = " + fibonacci);
    }
    public static int mul(int n) {
        if (n ==  1) {
            return 1;
        }
        return n*mul(n-1);
    }

    public static int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
