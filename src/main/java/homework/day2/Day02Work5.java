package homework.day2;

/**
 * @ClassName Day02Work5
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/11 18:50
 * @Version 1.0
 **/
public class Day02Work5 {
    public static void main(String[] args) {
        int week = 2;
        week += 100;
        week %= 7;
        System.out.println("今天是周2,100天以后是周" + (week == 0?"日":week));
    }
}
