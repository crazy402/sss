package day.Day16Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

/**
 * @ClassName Test00
 * @Description //
 * @Author crazy402
 * @Date 2022/5/31 9:48
 * @Version 1.0
 **/
public class Test00 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("张无忌");
        collection.add("周芷若");
        collection.add("赵敏");

        System.out.println(collection);


        Collection<String> collection1 = new ArrayList<>();

        collection1.add("张三");
        collection1.add("法外狂徒");
        collection1.add("崔斯特");
        collection1.addAll(collection);
        System.out.println(collection1);

//        collection1.remove("张三");
//        System.out.println(collection1);

        /*collection1.clear();
        System.out.println(collection1);*/

        /*boolean empty = collection1.isEmpty();
        System.out.println(empty);*/

        int size = collection1.size();
        System.out.println(size);

        boolean contains = collection1.contains("张三");
        System.out.println(contains);


        for (String s : collection1) {
            System.out.println(s);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小红");
        list.add("小蓝");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            if ("小蓝".equals(next)) {
                listIterator.add("小白");
            }
        }
        System.out.println(list);
    }
}
