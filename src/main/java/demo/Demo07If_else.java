package demo;

import java.util.Scanner;

/**
 * @ClassName Demo07If_else
 * @Description //比较最大值
 * @Author crazy402
 * @Date 2022/5/13 15:49
 * @Version 1.0
 **/
public class Demo07If_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        int data1 = scanner.nextInt();

        if (data > data1) {
            System.out.println(data);

        } else {
            System.out.println(data1);
        }

        System.out.println(data > data1 ? data : data1);
    }
}
