package homework.day5;

/**
 * @ClassName Day05Work1
 * @Description //
 * 请使用静态初始化的方式,创建一个长度为5的整数数组,并为数组中的元素赋值,遍历数组,
 * 在同一行打印所有元素,元素之间用空格隔开,比如:如果数组为{1,2,3,4,5}打印结果:1 2 3 4 5
 * @Author crazy402
 * @Date 2022/5/16 18:07
 * @Version 1.0
 **/
public class Day05Work1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

    }
}
