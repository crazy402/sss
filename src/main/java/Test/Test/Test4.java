package Test.Test;

/**
 * @ClassName Test4
 * @Description //通项公式如下：
 * f(n)=n + (n-1) + (n-2) + .... + 1，
 * 其中n是大于等于5并且小于10000的整数，
 * 例如：f(5) = 5 + 4 + 3 + 2 + 1，
 * f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，
 * 请用非递归的方式完成方法long f( int n)的方法体
 * @Author crazy402
 * @Date 2022/6/7 20:15
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        f(5);
    }
    public static void f(int n) {
        for (int i = n - 1; i > 0; i--) {
            n = n + i;
        }
        System.out.println(n);
    }
}
