package homework.day2;

/**
 * @ClassName Day02Work1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/11 18:20
 * @Version 1.0
 **/
public class Day02Work1 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        System.out.println( "byte的类型的a和b的和是:" + c);

        short a1 = 1000;
        short b1 = 2000;
        short c1 = (short) (a1 + b1);
        System.out.println("short类型的a1和b1的和是:" + c1);

        char a2 = 'a';
        int b2 = 30;
        int c2 = a2 - b2;

        System.out.println("char类型的a2和int类型的b2的差为:" + c2);


    }
}
