package day.Day2Demo;

/**
 * @ClassName Day02Demo02
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/10 19:52
 * @Version 1.0
 **/
public class Day02Demo02 {
    public static void main(String[] args) {
        int a = 3;


        int num = 1234;
        int q = num / 1000;
        int b = (num - q*1000) / 100;
        int s = (num - q*1000 - b*100) / 10;
        int g = (num - q*1000- b*100 - s*10);
        System.out.println(q);
        System.out.println(b);
        System.out.println(s);
        System.out.println(g);
    }
}
