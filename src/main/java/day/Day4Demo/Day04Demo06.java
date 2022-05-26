package day.Day4Demo;

/**
 * @ClassName Day04Demo06
 * @Description //
 * @Author crazy402
 * @Date 2022/5/12 14:01
 * @Version 1.0
 **/
public class Day04Demo06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[arr.length - 1 -i];
            arr[arr.length -1 -i] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
