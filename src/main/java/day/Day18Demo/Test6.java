package day.Day18Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Test6
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/2 14:22
 * @Version 1.0
 **/
public class Test6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"王五");
        map1.put(2,"赵六");

        HashMap<Integer, HashMap<Integer, String>> mapHashMap = new HashMap<>();
        mapHashMap.put(1, map);
        mapHashMap.put(2, map1);

        Set<Map.Entry<Integer, HashMap<Integer, String>>> entries = mapHashMap.entrySet();
        for (Map.Entry<Integer, HashMap<Integer, String>> entry : entries) {
            Set<Map.Entry<Integer, String>> entrySet = entry.getValue().entrySet();
            for (Map.Entry<Integer, String> stringEntry : entrySet) {
                System.out.println(stringEntry.getKey()+"..."+stringEntry.getValue());
            }
        }
    }
}
