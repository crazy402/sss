package day.Day16Demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Test1
 * @Description //
 * Iterator
 * @Author crazy402
 * @Date 2022/5/30 18:24
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("孙悟空");
        list.add("二郎神");
        list.add("哮天犬");
        list.add("姜子牙");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println(iterator.next());
        }
    }
}
