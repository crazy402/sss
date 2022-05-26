package day.Day12Demo;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName Test1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 10:37
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        char[] chars = {'a', 'b', 'c'};
        String s = new String(chars, 0, 2);
        System.out.println("s = " + s);

        byte[] bytes = {'a', 'b', 'c', 'd'};
        String s1 = new String(bytes, 1, 2);
        System.out.println("s1 = " + s1);

        String gbk = new String(bytes, "GBK");
        System.out.println(gbk);
    }
}
