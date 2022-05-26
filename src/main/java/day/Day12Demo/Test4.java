package day.Day12Demo;

import java.util.Scanner;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 14:44
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        int big = 0;
        int small = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                big++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                small++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                num++;
            }
        }
        System.out.println("big = " + big);
        System.out.println("small = " + small);
        System.out.println("num = " + num);
    }
}
