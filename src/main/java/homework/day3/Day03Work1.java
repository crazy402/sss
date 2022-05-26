package homework.day3;

import java.util.Scanner;

/**
 * @ClassName Day03Work1
 * @Description //让用户依次录入三个整数，求出三个数中的最大值，并打印到控制台。【使用if】
 * @Author crazy402
 * @Date 2022/5/13 23:16
 * @Version 1.0
 **/
public class Day03Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("一次输入3个整数");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = 0;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        if (max > num3) {
            System.out.println("最大值是:" + max);
        } else {
            System.out.println("最大值是:" + num3);
        }
    }
}
