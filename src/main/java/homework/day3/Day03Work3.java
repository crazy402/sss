package homework.day3;

import java.util.Scanner;

/**
 * @ClassName Day03Work3
 * @Description //需求【使用switch】:
 * 	1.功能描述：模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
 * 	2.要求：
 * 		(1)键盘录入三个整数,其中前两个整数代表参加运算的数据，
 * 			第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
 * 		(2)使用今天所学知识完成功能
 * 		(3)演示格式如下1:
 * 			请输入第一个整数:30
 * 			请输入第二个整数:40
 * 			请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0
 * 			控制台输出:70
 *
 *             演示格式如下2:
 * 			请输入第一个整数:30
 * 			请输入第二个整数:40
 * 			请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):1
 * 			控制台输出:-10
 * @Author crazy402
 * @Date 2022/5/13 23:32
 * @Version 1.0
 **/
public class Day03Work3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个整数:");
        int num2 = scanner.nextInt();
        System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
        int num3 = scanner.nextInt();

        switch (num3) {
            case 0:
                System.out.println("和为:" + (num1 + num2));
                break;
            case 1:
                System.out.println("差为:" + (num1 - num2));
                break;
            case 2:
                System.out.println("积为:" + (num1 * num2));
                break;
            case 3:
                System.out.println("商为:" + (num1 / num2));
                break;
            default:
                System.out.println("数字不符合要求");
                break;

        }
    }
}
