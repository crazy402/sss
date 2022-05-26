package homework.day4;

/**
 * @ClassName Day04Work5
 * @Description //需求:
 * 	现有一个整数数组{100,50,90,60,80,70}。
 * 	请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）
 * @Author crazy402
 * @Date 2022/5/15 19:36
 * @Version 1.0
 **/
public class Day04Work5 {
    public static void main(String[] args) {
        int[] arr = {100,50,90,60,80,70};

        int avg = 0;
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            sum += arr[i];
        }

        avg = (sum - max - min)/(arr.length-2);
        System.out.println("avg = " + avg);
    }

}
