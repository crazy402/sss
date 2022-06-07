package day.Day18Demo;

import java.util.ArrayList;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/2 14:16
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("赵六");
        list1.add("田七");
        list1.add("猪八");

        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        arrayLists.add(list);
        arrayLists.add(list1);

        for (ArrayList<String> arrayList : arrayLists) {
            for (String s : arrayList) {
                System.out.println(s);
            }
        }
    }
}
