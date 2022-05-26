package demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Demo04Random
 * @Description //Random
 * @Author crazy402
 * @Date 2022/5/14 11:16
 * @Version 1.0
 **/
public class Demo04Random {
    public static void main(String[] args) {
//        Random random = new Random();
//        int data = random.nextInt(10) + 1;
//        System.out.println("data = " + data);
//
//        int data1 = random.nextInt(100) + 1;
//        System.out.println("data1 = " + data1);
//
//        int data2 = random.nextInt(900) + 100;
//        System.out.println("data2 = " + data2);

        Random random = new Random();
        int num = random.nextInt(50)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数猜大小");

        while (true) {
            int i = scanner.nextInt();
            if (i > num) {
                System.out.println("你猜大了");
            } else if (i < num) {
                System.out.println("你猜小了");

            } else {
                System.out.println("中");
                System.out.println(num);
                break;
            }
        }
    }
}
