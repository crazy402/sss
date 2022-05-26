package day.Day4Demo;

import java.util.Scanner;

/**
 * @ClassName Day04Demo05
 * @Description //二分查找
 * @Author crazy402
 * @Date 2022/5/12 13:34
 * @Version 1.0
 **/
public class Day04Demo05 {
    public static void main(String[] args) {
        int[] arr = {8,15,23,35,45,56,75,85};

        Scanner scanner = new Scanner(System.in);

        int target = scanner.nextInt();

        int index = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }


        if (index != -1) {
            System.out.println("找到了 下标是:" + index);
        } else {
            System.out.println("不存在");
        }

    }

}
