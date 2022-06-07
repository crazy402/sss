package homework.day17;

import java.util.*;

/**
 * @ClassName Test2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 18:29
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        HashSet<String> redSet = new HashSet<>();
        HashSet<String> blueSet = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            int anInt = random.nextInt(33) + 1;
            if (anInt < 10) {
                redSet.add(0 + "" + anInt);
            } else {
                redSet.add(anInt + "");
            }
        }
        System.out.println(redSet);
        ArrayList<String> list = new ArrayList<>();


        for (String s : redSet) {
            list.add(s);
        }


        Collections.sort(list);

        Random random1 = new Random();
        int blue = random1.nextInt(16) + 1;
        if (blue < 10) {
            list.add(0 + "" + blue);
        } else {
            list.add(blue + "");
        }
        System.out.println(list);


        System.out.println(list);
    }
}
