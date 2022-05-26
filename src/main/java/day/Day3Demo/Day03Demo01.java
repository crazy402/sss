package day.Day3Demo;

import java.util.Scanner;

/**
 * @ClassName Day03Demo01
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/11 18:02
 * @Version 1.0
 **/
public class Day03Demo01 {
    // 键盘输入个人信息
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入名字:");
        String name = scanner.next();

        System.out.println("请输入年龄:");
        int age = scanner.nextInt();

        System.out.println("请输入性别:");
        char gender = scanner.next().charAt(0);

        System.out.println("请输入体重:");
        double weight = scanner.nextDouble();

        System.out.println("是否已婚:");
        boolean isMarry = scanner.nextBoolean();

        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
        System.out.println("性别:" + gender);
        System.out.println("体重:" + weight);
        System.out.println("是否已婚: " + isMarry);


    }
}
