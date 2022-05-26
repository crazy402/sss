package day.Day2Demo;

/**
 * @ClassName Day02Demo03
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/10 20:09
 * @Version 1.0
 **/
public class Day02Demo03 {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        // i = 2  j = 1
        // k = 2 *2 +4 *2 = 12
        // i =4 j = 3

        int k = i++ * ++j + ++i * j++;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

    }
}
