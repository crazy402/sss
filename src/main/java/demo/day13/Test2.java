package demo.day13;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @ClassName Test2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 14:31
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        long time = System.currentTimeMillis();
        System.out.println(formatter.format(time));

        Date parse = formatter.parse(formatter.format(time));
        System.out.println(parse);

    }
}
