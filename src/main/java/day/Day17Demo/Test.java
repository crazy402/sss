package day.Day17Demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 9:31
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 18));
        list.add(new Person("李四", 17));
        list.add(new Person("法外狂徒", 28));

        Collections.sort(list);

        System.out.println(list);

        for (Person person : list) {
            System.out.println("person = " + person);
        }

    }
}
