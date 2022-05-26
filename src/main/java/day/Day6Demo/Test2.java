package day.Day6Demo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName Test2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/17 19:58
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(0, Arrays.asList("关羽","张飞","刘备","吕布"));

        System.out.println(list);
    }
}
