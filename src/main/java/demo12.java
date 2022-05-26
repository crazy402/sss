/**
 * @ClassName demo12
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/10 21:25
 * @Version 1.0
 **/
public class demo12 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
