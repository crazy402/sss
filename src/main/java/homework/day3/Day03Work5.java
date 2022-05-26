package homework.day3;

import java.util.Scanner;

/**
 * @ClassName Day03Work5
 * @Description //需求:
 * 	    从键盘上录入一个大于100的三位数,打印出100到该数字之间满足如下要求的数字,数字的个数,以及数字的和:
 * 		1.数字的个位数不为7;
 * 		2.数字的十位数不为5;
 * 		3.数字的百位数不为3;
 * 实现步骤:
 * @Author crazy402
 * @Date 2022/5/13 23:42
 * @Version 1.0
 **/
public class Day03Work5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0;
        int sum = 0;



        for (int i = 101; i < num; i++) {
            int bai = i / 100;
            int shi = (i - bai*100) / 10;
            int ge = i -bai*100 - shi*10;

            if (ge != 7 && shi != 5 && bai != 3) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
    }
}
