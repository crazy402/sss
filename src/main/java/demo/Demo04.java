package demo;

import java.util.Scanner;

/**
 * @ClassName Demo04
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/13 11:43
 * @Version 1.0
 **/
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int data = scanner.nextInt();
//        System.out.println("data = " + data);

//        String s = scanner.next();
//        System.out.println("s = " + s);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }
}
