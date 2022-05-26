package homework.day6;

import java.util.Arrays;

/**
 * @ClassName Day06Work5
 * @Description //案例：
 *
 * ​	声明一个数组管理工具类MyArrays，包含如下方法：
 *
 * 1、void sort(int[] arr)：可以为任意一维整型数组arr实现从小到大排序
 *
 * 2、int indexOf(int[] arr, int value)：可以在任意一维整型数组arr中查找value值的下标，如果不存在返回-1
 *
 * 3、int[] copy(int[] arr, int len)：可以实现从任意一维数组arr中复制一个新数组返回，新数组的长度为len，从arr[0]开始复制
 *
 * ​	声明一个Test07测试类，并在main方法中调用测试
 * @Author crazy402
 * @Date 2022/5/17 19:04
 * @Version 1.0
 **/
public class Day06Work5 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        MyArrays myArrays = new MyArrays();
        int[] sort = myArrays.sort(arr);
        System.out.println(Arrays.toString(sort));

        int i = myArrays.indexOf(arr, 6);
        System.out.println("i = " + i);

        int[] copy = myArrays.copy(arr, 4);
        System.out.println(Arrays.toString(copy));
    }


}
