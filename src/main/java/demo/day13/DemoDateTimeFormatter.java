package demo.day13;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName DemoDateTimeFormatter
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/26 15:06
 * @Version 1.0
 **/
public class DemoDateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String format = dateTimeFormatter.format(now);
        System.out.println("format = " + format);
    }
}
