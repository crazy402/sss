package day.Day4Demo;

import java.util.Scanner;

/**
 * @ClassName Day04Demo07
 * @Description //冒泡排序
 * @Author crazy402
 * @Date 2022/5/12 14:18
 * @Version 1.0
 **/
public class Day04Demo07 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 2, 9, 1};
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i ; j++) {

                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        

    }
}
