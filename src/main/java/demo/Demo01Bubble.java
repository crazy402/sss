package demo;

import java.util.Arrays;

/**
 * @ClassName Demo01Bubble
 * @Description //冒泡
 * @Author crazy402
 * @Date 2022/5/16 10:30
 * @Version 1.0
 **/
public class Demo01Bubble {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4,6};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
