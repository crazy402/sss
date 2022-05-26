package homework.day7;

/**
 * @ClassName Day07Work1
 * @Description //案例：
 *
 * ​	在Count类中，声明如下方法：
 *
 * 1、public long  sum(int...  nums)：求0~n个整数的累加和，如果没有传参，就返回0
 *
 * 2、public int max(int a, int... others)：求1~n个整数中的最大值
 *
 * 3、public String concat(String...  strings)：求0~n个字符串的拼接结果
 *
 * 4、public boolean isEven(int... nums)：判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false
 *
 * ​	声明一个Test01测试类，并在main方法中调用测试
 * @Author crazy402
 * @Date 2022/5/18 19:33
 * @Version 1.0
 **/
public class Day07Work1 {
    public static void main(String[] args) {

        Count count = new Count();
        long sum = count.sum(1,2,3,4,5);
        System.out.println("sum = " + sum);

        int max = count.max(1, 1,3,4,5,67,2);
        System.out.println("max = " + max);

        String concat = count.concat("hello", "world");
        System.out.println("concat = " + concat);

        boolean even = count.isEven(2, 4, 6);
        System.out.println("even = " + even);

    }


}
