package homework.day5;

import java.util.Scanner;

/**
 * @ClassName Day05Work5
 * @Description //定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
 * @Author crazy402
 * @Date 2022/5/16 18:38
 * @Version 1.0
 **/
public class Day05Work5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneInt = scanner.nextInt();
        int twoInt = scanner.nextInt();
        int threeInt = scanner.nextInt();

        int max = getMax(oneInt, twoInt, threeInt);
        System.out.println("max = " + max);

    }

    public static int getMax(int a, int b, int c) {
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }
}
