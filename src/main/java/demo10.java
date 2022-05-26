import java.util.Scanner;

/**
 * @ClassName demo10
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/10 20:46
 * @Version 1.0
 **/
public class demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入整数:");
            int a = scanner.nextInt();
            if (a > max) {
                max = a;
            }
        }

        System.out.println(max);
    }
}
