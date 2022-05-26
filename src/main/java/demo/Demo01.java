package demo;

/**
 * @ClassName Demo01
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/11 11:33
 * @Version 1.0
 **/
public class Demo01 {
    public static void main(String[] args) {
        char[] a = {'A', 'B', 'C', 'D', 'E', 'F'};

        int i = 0;

        while (a[i++] != '\u0000') {

            System.out.print(a[i++]);

            if (i == 4) {

                break;

            }


        }
    }
}
