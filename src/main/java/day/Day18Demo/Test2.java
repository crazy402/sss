package day.Day18Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName Test2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/2 9:53
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();

        HashMap<String, Integer> map = new HashMap<>();

        char[] chars = data.toCharArray();

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        /*for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            map.put(chars[i]+"",1);
        }*/

        /*for (char aChar : chars) {
            String c = aChar + "";


            if (map.get(c)==0) {
                map.put(c,1);
            }else {
                Integer count = map.get(c);
                count++;
                map.put(c, count);
            }
        }*/



        for (char aChar : chars) {
            String c = aChar + "";
            if (!map.containsKey(c)) {
                map.put(c,1);
            }else {
                Integer count = map.get(c);
                count++;
                map.put(c, count);
            }
        }

        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "..." + entry.getValue());
        }
    }
}
