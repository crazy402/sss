package homework.day16;

import java.util.ArrayList;

/**
 * @ClassName Test2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/31 20:22
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {



    }
    public static int binarySearch(int[] arr, int des) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (des > arr[mid]) {
                left = mid + 1;
            }
            if (des < arr[mid]) {
                right  = mid - 1;
            }
            if (des == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
