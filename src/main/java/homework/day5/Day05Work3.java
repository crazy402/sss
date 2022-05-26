package homework.day5;

/**
 * @ClassName Day05Work3
 * @Description //现有一个整数数组{100,50,90,60,80,70}。
 * 请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）
 * @Author crazy402
 * @Date 2022/5/16 18:12
 * @Version 1.0
 **/
public class Day05Work3 {
    public static void main(String[] args) {
        int[] arr = {100,50,90,60,80,70};

        int min = getMin(arr);
        int max = getMax(arr);
        int sum = getSum(arr);
        int avg = (sum - (max + min)) / (arr.length - 2);
        System.out.println("avg = " + avg);
        /*int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        int avg = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }

            sum += arr[i];
        }

        avg = (sum - (max + min)) / (arr.length - 2);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);*/
    }
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getSum(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
