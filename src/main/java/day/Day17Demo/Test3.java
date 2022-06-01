package day.Day17Demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 15:46
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("刘备");
        set.add("关羽");
        set.add("张飞");
        set.add("张飞");

        System.out.println(set);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("刘邦");
        linkedHashSet.add("虞姬");
        linkedHashSet.add("项羽");
        linkedHashSet.add("嬴政");
        linkedHashSet.add("亚瑟");
        linkedHashSet.add("亚瑟");
        System.out.println(linkedHashSet);


    }
}
