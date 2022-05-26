package homework.day4;

/**
 * @ClassName Day04Work3
 * @Description //需求:
 * 	现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最小值并打印。
 * @Author crazy402
 * @Date 2022/5/15 19:32
 * @Version 1.0
 **/
public class Day04Work3 {
    public static void main(String[] args) {
        int[] arr = {100,50,90,60,80,70};
        int min = getMin(arr);
        System.out.println("min = " + min);
    }

    public static int getMin(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
