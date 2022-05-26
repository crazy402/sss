package day.Day4Demo;

/**
 * @ClassName Day04Demo04
 * @Description //数组的常见算法
 * @Author crazy402
 * @Date 2022/5/12 11:35
 * @Version 1.0
 **/
public class Day04Demo04 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};
        // 求总和  平均数  乘积 统计偶数个数 最大值
        int sum = 0;
        int result = 1;
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
            sum += arr[i];
            result *= arr[i];
            max =  max>arr[i]?max:arr[i];
        }

        // 总和
        System.out.println(sum);

        double avg = sum / arr.length;
        // 平均
        System.out.println(avg);

        // 总乘积
        System.out.println(result);

        // 偶数个数
        System.out.println(count);

        // 求最大值
        System.out.println(max);



    }
}
