package demo.day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName DemoCalendar
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/26 14:15
 * @Version 1.0
 **/
public class DemoCalendar {
    public static void main(String[] args) {
        getTime();

        setTime();

        add();

    }

    public static void add() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -1);
        int year = calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);
    }

    public static void setTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2000);
        int year = calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);
    }


    public static void getTime() {
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println("time = " + time);
    }
}
