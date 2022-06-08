package Test.Test;

/**
 * @ClassName Test1
 * @Description //1、用循环控制语句打印输出：1+3+5+...+99=?的结果
 * @Author crazy402
 * @Date 2022/6/7 19:54
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i=i+2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
