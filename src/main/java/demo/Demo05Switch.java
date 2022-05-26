package demo;

import java.util.Scanner;

/**
 * @ClassName Demo05Switch
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/13 14:31
 * @Version 1.0
 **/
public class Demo05Switch {
    public static void main(String[] args) {
        System.out.println("输入当前月份");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();


        /*switch (data) {
            case 1:
                System.out.println("冬");
                break;
            case 2:
                System.out.println("冬");
                break;
            case 3:
                System.out.println("春");
                break;
            case 4:
                System.out.println("春");
                break;
            case 5:
                System.out.println("春");
                break;
            case 6:
                System.out.println("夏");
                break;
            case 7:
                System.out.println("夏");
                break;
            case 8:
                System.out.println("夏");
                break;
            case 9:
                System.out.println("秋");
                break;
            case 10:
                System.out.println("秋");
                break;
            case 11:
                System.out.println("秋");
                break;
            case 12:
                System.out.println("冬");
                break;
            default:
                System.out.println("不存在");
                break;
        }*/

        switch (data) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            default:
                System.out.println("不存在");
                break;
        }
    }
}
