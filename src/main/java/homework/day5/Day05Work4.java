package homework.day5;

import java.util.Scanner;

/**
 * @ClassName Day05Work4
 * @Description //定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试
 * @Author crazy402
 * @Date 2022/5/16 18:34
 * @Version 1.0
 **/
public class Day05Work4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double oneDouble = scanner.nextDouble();
        double twoDouble = scanner.nextDouble();

        double min = getMin(oneDouble, twoDouble);
        System.out.println("min = " + min);
    }
    public static double getMin(double a, double b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
