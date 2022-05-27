package demo.day13;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @ClassName Test1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 11:45
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, 2, 1);
        calendar.add(Calendar.DATE, -1);
        System.out.println(calendar.get(Calendar.DATE));
    }
}
