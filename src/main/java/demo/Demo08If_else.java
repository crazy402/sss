package demo;

import java.util.Scanner;

/**
 * @ClassName Demo08If_else
 * @Description //润年
 * @Author crazy402
 * @Date 2022/5/13 15:50
 * @Version 1.0
 **/
public class Demo08If_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println(year + "是润年");
        } else {
            System.out.println(year + "不是润年");
        }
    }
}
