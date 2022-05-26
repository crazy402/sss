package demo;

/**
 * @ClassName DemoMethod1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/16 15:38
 * @Version 1.0
 **/
public class DemoMethod1 {
    public static void main(String[] args) {
        String a = "🐥";
        String b = "🍄";

        String cooking = cooking(a, b);
        System.out.println("cooking = " + cooking);

        cooking1();

    }

    public static String cooking(String a, String b) {
        return a +"炖"+b;
    }
    public static void cooking1() {
        String a = "🐥";
        String b = "🍄";
        String cooking = a +"炖"+b;
        System.out.println(cooking);
    }


}
