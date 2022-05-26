package homework.day7;

import java.util.Arrays;

/**
 * @ClassName Day07Work3
 * @Description //
 * 案例：
 *
 * ​	声明一个数组工具类MyArrays，包含如下方法：
 *
 * 1、int  binarySearch(int[]  arr,  int  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
 *
 * 2、int  binarySearch(char[]  arr,  char  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
 *
 * 3、int  binarySearch(double[]  arr,  double  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
 *
 * 4、int[]  copy(int[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
 *
 * 5、double[]  copy(double[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
 *
 * 6、char[]  copy(char[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
 *
 * 7、void sort(int[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
 *
 * 8、void sort(char[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
 *
 * 9、void sort(double[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
 *
 * ​	声明Test03测试类，并在main方法中调用测试
 * @Author crazy402
 * @Date 2022/5/18 21:03
 * @Version 1.0
 **/
public class Day07Work3 {
    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();

//        int[] arr ={1,2,3,4,5};
//        int i = myArrays.binarySearch(arr, 4);
//        System.out.println("i = " + i);

//        char[] chars = {'a','b','c'};
//        int b = myArrays.binarySearch(chars, 'b');
//        System.out.println(b);

//        double[] arr = {1.0, 3.0, 4.0};
//        int i = myArrays.binarySearch(arr, 4.0);
//        System.out.println(i);

//        int[] arr = {1,3,5};
//        int[] copy = myArrays.copy(arr, 2);
//        System.out.println(Arrays.toString(copy));

//        double[] arr = {1.0, 2.0, 3.0};
//        double[] copy = myArrays.copy(arr, 3);
//        System.out.println(Arrays.toString(copy));

//        char[] arr = {'a','b','c'};
//        char[] copy = myArrays.copy(arr, 1);
//        System.out.println(Arrays.toString(copy));

//        int[] arr = {1,5,6,3,4,6};
//        myArrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

    }
}
