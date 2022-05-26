package homework.day5;

/**
 * @ClassName Day05Work2
 * @Description //现有一个小数数组{12.9,53.54,75.0,99.1,3.14}。请编写代码，找出数组中的最小值并打印
 * @Author crazy402
 * @Date 2022/5/16 18:10
 * @Version 1.0
 **/
public class Day05Work2 {
    public static void main(String[] args) {
        double[] arr = {12.9,53.54,75.0,99.1,3.14};
        double min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i] ;
            }
        }

        System.out.println("min = " + min);
    }
}
