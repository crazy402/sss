package day.Day16Demo;

import java.util.LinkedList;

/**
 * @ClassName Test5
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/31 15:49
 * @Version 1.0
 **/
public class Test5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("令狐冲");
        list.add("风清扬");
        list.add("左冷禅");

        System.out.println(list);

        list.addFirst("金庸");
        System.out.println(list);

        list.addLast("古龙");
        System.out.println(list);

        list.remove("左冷禅");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }
}
