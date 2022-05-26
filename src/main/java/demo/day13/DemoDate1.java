package demo.day13;

import java.util.Date;

/**
 * @ClassName DemoDate1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/26 14:12
 * @Version 1.0
 **/
public class DemoDate1 {
    public static void main(String[] args) {
        Date date = new Date(1000L);
        System.out.println("date = " + date);

        System.out.println("date.getTime() = " + date.getTime());
    }
}
