package day.Day18Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Test1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/2 9:31
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("张三", "李四");
        map.put("王五", "赵六");
        map.put("田七", "猪八");
        map.put("熊大", "熊二");

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s + "....." + map.get(s));
        }

        System.out.println("===========");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "..." + entry.getValue());
        }


    }
}
