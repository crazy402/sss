package day.Day4Demo;

/**
 * @ClassName Day04Demo02
 * @Description //数组的初始化
 * @Author crazy402
 * @Date 2022/5/12 11:13
 * @Version 1.0
 **/
public class Day04Demo02 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.print("存储数据到arr数组之前：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print("," + arr[i]);
            }
        }
        System.out.print("]");

        // 初始化
        /*  arr[0] = 2;
            arr[1] = 4;
            arr[2] = 6;
            arr[3] = 8;
            arr[4] = 10;*/
        int[] arr1 = new int[5];
        System.out.println();
        System.out.print("存储数据到arr数组之前：[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == 0) {
                arr1[i] = 2*i + 2;
                System.out.print(arr1[i]);
            } else {
                arr1[i] = 2*i + 2;
                System.out.print("," + arr1[i]);
            }
        }
        System.out.print("]");

    }
}
