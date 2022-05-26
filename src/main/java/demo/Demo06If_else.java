package demo;

import java.util.Scanner;

/**
 * @ClassName Demo06If_else
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/13 15:26
 * @Version 1.0
 **/
public class Demo06If_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int data = scanner.nextInt();

        if (data %2 == 0) {
            System.out.println("是偶数");

        } else {
            System.out.println("是奇数");
        }
    }
}
