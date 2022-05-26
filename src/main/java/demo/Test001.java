package demo;

/**
 * @ClassName Test001
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 9:08
 * @Version 1.0
 **/
public class Test001 {
    public static void main(String[] args) {
        String s = new String();

        byte[] bytes = {'a', 'b', 'c'};
        char[] chars = {'a','b'};
        String s1 = new String(bytes);
        String s2 = new String(chars);
        System.out.println("s2 = " + s2);

    }
}
