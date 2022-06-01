package day.Day17Demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName Test2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 14:46
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        String[] color = "♠-♥-♣-♦".split("-");

        String[] num = "2,3,4,5,6,7,8,9,10,J,Q,K,A".split(",");

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < color.length; i++) {
            for (int i1 = 0; i1 < num.length; i1++) {
                list.add(color[i] + num[i1]);
            }
        }
        // System.out.println(list);
        //  System.out.println(list.size());
        list.add("🃏");
        list.add("🃏");

        Collections.shuffle(list);

        System.out.println(list);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i >= 51) {
                diPai.add(list.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(list.get(i));
                } else if (i % 3 == 1) {
                    player2.add(list.get(i));
                } else if (i % 3 == 2) {
                    player3.add(list.get(i));
                }
            }
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(diPai);
    }
}
