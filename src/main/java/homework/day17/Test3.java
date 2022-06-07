package homework.day17;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 19:14
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("小亮",99));
        list.add(new Student("小强",85));
        list.add(new Student("小响",90));
        list.add(new Student("小勇",78));
        Collections.sort(list);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);


    }
}
