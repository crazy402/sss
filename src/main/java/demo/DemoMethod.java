package demo;

/**
 * @ClassName DemoMethod
 * @Description //
 * @Author crazy402
 * @Date 2022/5/16 14:25
 * @Version 1.0
 **/
public class DemoMethod {
    public static void main(String[] args) {
        // sum();
//        int sum = sum1(10,20);
//        System.out.println("sum = " + sum);

       // sum2(10 ,20);

        int sum = sum1();
        System.out.println("sum = " + sum);

    }
    public static void sum() {
        int a = 10;
        int b = 10;

        int sum = a + b;
        System.out.println("sum = " + sum);
    }
    public static void sum2(int a, int b) {

        int sum = a + b;
        System.out.println("sum = " + sum);
    }

    public static int sum1(int a, int b) {

        return  a + b;

    }
    public static int sum1() {
        int a = 10;
        int b = 20;

        return  a + b;

    }
}
