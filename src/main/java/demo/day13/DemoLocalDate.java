package demo.day13;

import java.time.LocalDate;

/**
 * @ClassName DemoLocalDate
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/26 14:47
 * @Version 1.0
 **/
public class DemoLocalDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        LocalDate of = LocalDate.of(2021, 1, 1);
        System.out.println("of = " + of);


        System.out.println("now.getYear() = " + now.getYear());
        System.out.println("now.getMonth() = " + now.getMonthValue());
        System.out.println("now.getDayOfMonth() = " + now.getDayOfMonth());

//        now.withYear(2000);
//        now.withMonth(2);
//        now.withDayOfMonth(2);

        System.out.println(now.withYear(2000).withMonth(2).withDayOfMonth(2));
    }
}
