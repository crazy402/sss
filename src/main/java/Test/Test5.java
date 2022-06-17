package Test;



/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/17 9:30
 * @description //
 **/
public class Test5 {

    public static void main(String[] args) {
        int i = 0;
        change(i);
        i = i++;
        System.out.println("i = " + i);
    }

    private static void change(int i) {
        i++;
    }
}
