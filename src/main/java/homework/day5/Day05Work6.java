package homework.day5;

import java.util.Scanner;

/**
 * @ClassName Day05Work6
 * @Description //数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
 * 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试
 *
 * 比如:
 *
 * ​	小数数字 -6.6 的绝对值是 6.6
 *
 * ​	小数数字 6.6 的绝对值是 6.6
 * @Author crazy402
 * @Date 2022/5/16 18:42
 * @Version 1.0
 **/
public class Day05Work6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double aDouble = scanner.nextDouble();
        double absoluteValue = getAbsoluteValue(aDouble);
        System.out.println("小数数字" + aDouble +"的绝对值是" + absoluteValue);

    }

    public static double getAbsoluteValue(double a) {
        if (a >= 0) {
            double absoluteValue = a;
            return absoluteValue;
        } else {
            double absoluteValue = -a;
            return absoluteValue;
        }
    }
}
