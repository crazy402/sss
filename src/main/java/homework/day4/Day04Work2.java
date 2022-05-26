package homework.day4;

/**
 * @ClassName Day04Work2
 * @Description //需求:
 * 	现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的和并打印。
 * @Author crazy402
 * @Date 2022/5/15 19:30
 * @Version 1.0
 **/
public class Day04Work2 {
    public static void main(String[] args) {
        int[] arr = {100,50,90,60,80,70};
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
