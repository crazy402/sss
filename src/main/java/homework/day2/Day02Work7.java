package homework.day2;

/**
 * @ClassName Day02Work7
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/11 19:00
 * @Version 1.0
 **/
public class Day02Work7 {
    public static void main(String[] args) {
        
        int year = 2018;
        boolean result = year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);
        System.out.println(year + (result? "是闰年":"不是闰年"));
    }
}
