package day.Day18Demo;

import day.Day17Demo.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/2 10:49
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {
        TreeMap<Person, String> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        map.put(new Person("张三",18),"北京");
        map.put(new Person("李四",19),"深圳");
        map.put(new Person("王五",28),"武汉");

        System.out.println(map);




    }
}
