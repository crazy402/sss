package day.Day16Demo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 18:10
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        collection.add("赵六");
        collection.add("田七");
        collection.add("猪八");
        System.out.println(collection);

        Collection<String> collection1=new ArrayList<String>();
        collection1.add("刘备");
        collection1.add("关羽");
        collection1.add("张飞");

        collection.addAll(collection1);
        System.out.println(collection);

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("123");
        /*collection2.clear();
        System.out.println(collection2);*/


        boolean contains = collection2.contains("123");
        System.out.println("contains = " + contains);

        System.out.println(collection2.isEmpty());

        System.out.println(collection.size());

        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
