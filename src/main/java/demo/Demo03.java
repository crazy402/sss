package demo;

/**
 * @ClassName Demo03
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/11 15:43
 * @Version 1.0
 **/
public class Demo03 {
    public static void main(String[] args) {


        byte b = 10;
        b += 2;
        // System.out.println(b);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
