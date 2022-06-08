package Test.Test;

/**
 * @ClassName Test5
 * @Description //5、求1+2！+3！+...+20！的和
 * @Author crazy402
 * @Date 2022/6/7 20:20
 * @Version 1.0
 **/
public class Test5 {
    public static void main(String[] args) {
        long sum = 0;
        long mul = 1;

        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < i; j++) {
                mul *= j;
            }
            sum += mul;
        }

        System.out.println(sum);
    }
}
