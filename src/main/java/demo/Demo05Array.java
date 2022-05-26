package demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Demo05Array
 * @Description //
 * @Author crazy402
 * @Date 2022/5/14 15:32
 * @Version 1.0
 **/
public class Demo05Array {
    public static void main(String[] args) {
        int[] arr = new int[3];

//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//
//        }

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
