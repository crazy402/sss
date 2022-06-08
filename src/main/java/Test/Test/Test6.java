package Test.Test;

/**
 * @ClassName Test6
 * @Description //
 * 6、输出一个如下图形，一共有n行，第n行有2n-1个*，
 * 完成方法public void printStar(int n)的方法体
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * @Author crazy402
 * @Date 2022/6/7 20:32
 * @Version 1.0
 **/
public class Test6 {
    public static void main(String[] args) {

        f(5);
    }
    public static void f(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
