package demo.day13;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 14:54
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        LocalDate of = LocalDate.of(2022, 5, 27);
        System.out.println(of);

        LocalDate localDate = of.withYear(2020);
        System.out.println(localDate);

        LocalDate localDate1 = of.withMonth(6);
        System.out.println("localDate1 = " + localDate1);
    }
}
