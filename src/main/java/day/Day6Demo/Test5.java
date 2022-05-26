package day.Day6Demo;

/**
 * @ClassName Test5
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/17 20:29
 * @Version 1.0
 **/
public class Test5 {
    public static void main(String[] args) {
        System.out.println("Fibonacci(5) = " + Fibonacci(5));
    }
    public static int Fibonacci(int n) {
        if (n == 1 || n == 2){
            return 1;
        }

        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
