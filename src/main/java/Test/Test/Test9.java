package Test.Test;

import java.util.Arrays;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/9 14:04
 * @description //
 * 9、有一个字符串String abc = “342567891”，
 * 请写程序将字符串abc进行升序，
 * 可以使用JDK API中的现有的功能方法。
 **/
public class Test9 {
    public static void main(String[] args) {
        String abc = "342567891";
        char[] chars = abc.toCharArray();
        Arrays.sort(chars);

        String s = new String(chars);

        System.out.println(s);


    }

}
