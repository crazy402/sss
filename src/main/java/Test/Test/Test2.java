package Test.Test;

import java.util.Arrays;

/**
 * @ClassName Test2
 * @Description //2、请写一个冒泡排序，实现{5,7,3,9,2}从小到大排序
 * @Author crazy402
 * @Date 2022/6/7 19:56
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {5,7,3,9,2};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length -  i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
