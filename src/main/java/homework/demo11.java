package homework;


/**
 * @ClassName demo11
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/10 21:09
 * @Version 1.0
 **/
public class demo11 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1000; i <= 9999; i++) {
            int a = i%10;
            int b = i%100 / 10;
            int c = i%1000/100;
            int d = i / 1000;
            if (a + d == c + b) {
                System.out.println(i);
                count++;

            }

        }
        System.out.println(count);

    }
}
