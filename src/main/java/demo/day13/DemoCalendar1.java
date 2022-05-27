package demo.day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName DemoCalendar1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 11:27
 * @Version 1.0
 **/
public class DemoCalendar1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);


      //  calendar.set(Calendar.MONTH, 5);
      //  int month = calendar.get(Calendar.MONTH);
      //  System.out.println("month = " + month);

        Date date = calendar.getTime();
        System.out.println("date = " + date);

    }
}
