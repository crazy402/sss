package Test.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/9 15:02
 * @description //
 * 13、写一段代码实现在遍历ArrayList时移除一个元素，例如：”java”？
 **/
public class Test13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("word");
        list.add("java");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            if ("java".equals(iterator.next())) {
                iterator.remove();
            }else {
                iterator.next();
            }
        }

        System.out.println(list);


    }
}
