package homework.day11;

import java.util.Scanner;

/**
 * @ClassName Test
 * @Description //键盘录入一个字符串，
 * 统计该字符串中大写字母字符，小写字母字符，
 * 数字字符出现的次数(不考虑其他字符)
 *
 * ### 训练提示
 * @Author crazy402
 * @Date 2022/5/25 18:25
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        int big = 0;
        int small = 0;
        int num = 0;

        char[] chars = next.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                big++;
            }
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                small++;
            }
            if (chars[i] >= '0' && chars[i] <= '9') {
                num++;
            }
        }

        System.out.println("big = " + big);
        System.out.println("small = " + small);
        System.out.println("num = " + num);
    }
}
