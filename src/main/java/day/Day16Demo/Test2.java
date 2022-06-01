package day.Day16Demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Test2
 * @Description //
 * 1.需求:定义集合,存储"孙悟空","唐僧","猪八戒","沙和尚",
 * 遍历集合,在遍历的过程中,如果获取出来的是猪八戒,就直接在集合中添加"白龙马"
 * @Author crazy402
 * @Date 2022/5/30 18:31
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("孙悟空");
        list.add("唐僧");
        list.add("猪八戒");
        list.add("沙和尚");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("猪八戒".equals(next)) {
                list.add("白龙马");
            }
        }
    }
}
