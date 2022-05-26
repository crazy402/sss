package day.Day12Demo;

import java.util.Arrays;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 11:44
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {
        String s = "abcdefg";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        String s1 = "你好";

        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));
    }

}
