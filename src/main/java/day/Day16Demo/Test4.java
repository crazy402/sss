package day.Day16Demo;

import java.util.ArrayList;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/31 14:49
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);

        list.remove(new Integer(3));
        System.out.println(list);
    }
}
