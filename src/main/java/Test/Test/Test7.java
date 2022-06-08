package Test.Test;

/**
 * @ClassName Test7
 * @Description //
 * 请编写代码使用把一个字符串反转，例如：hello1234，反转后：4321olleh
 * @Author crazy402
 * @Date 2022/6/7 20:46
 * @Version 1.0
 **/
public class Test7 {
    public static void main(String[] args) {
        String s = "hello1234";
        /*StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);*/

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;

        }

        s = new String(chars);
        System.out.println(s);
    }
}
