package day.Day18Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName Test5
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/2 14:19
 * @Version 1.0
 **/
public class Test5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "张三");
        hashMap.put(2, "李四");
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "王五");
        hashMap1.put(2, "赵六");

        ArrayList<HashMap<Integer, String>> arrayList = new ArrayList<>();
        arrayList.add(hashMap);
        arrayList.add(hashMap1);

        for (HashMap<Integer, String> map : arrayList) {

            Set<Integer> keySet = map.keySet();
            for (Integer integer : keySet) {
                System.out.println(integer+"...."+map.get(integer));
            }
        }

    }
}
