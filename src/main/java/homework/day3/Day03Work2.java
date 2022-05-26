package homework.day3;

import java.util.Scanner;

/**
 * @ClassName Day03Work2
 * @Description //1.根据程序员的工龄(整数)给程序员涨工资(整数),程序员的工龄和基本工资通过键盘录入
 *     2.涨工资的条件如下：
 *         [10-15)     +20000
 *         [5-10)      +10000
 *         [3~5)       +5000
 *         [1~3)       +3000
 *      3.运行程序:
 *          请输入作为程序员的你的工作的工龄:10
 *          请输入作为程序员的你的基本工资为:60000
 *          程序运行后打印格式
 *          	"您目前工作了10年，基本工资为 60000元, 应涨工资 20000元,涨后工资 80000元"
 * @Author crazy402
 * @Date 2022/5/13 23:20
 * @Version 1.0
 **/
public class Day03Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入作为程序员的你的工作的工龄");
        int workYear = scanner.nextInt();
        System.out.println("请输入作为程序员的你的基本工资");
        int salary = scanner.nextInt();
        int upSalary = 0;

        if (workYear >= 1 && workYear < 3) {
            upSalary = salary + 3000;
        } else if (workYear >= 3 && workYear < 5) {
            upSalary = salary + 5000;
        } else if (workYear >= 5 && workYear < 10) {
            upSalary = salary + 10000;
        } else if (workYear >= 10 && workYear < 15) {
            upSalary = salary + 20000;
        }
        System.out.println("您目前工作了"+ workYear+"年,基本工资为"+(upSalary-salary)+"元,涨后工资"+upSalary);



    }
}
