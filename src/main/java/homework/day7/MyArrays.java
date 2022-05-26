package homework.day7;


/**
 * @ClassName MyArrays
 * @Description //
 * 1、int  binarySearch(int[]  arr,  int  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
 * *
 * * 2、int  binarySearch(char[]  arr,  char  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
 * *
 * * 3、int  binarySearch(double[]  arr,  double  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
 * *
 * * 4、int[]  copy(int[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
 * *
 * * 5、double[]  copy(double[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
 * *
 * * 6、char[]  copy(char[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
 * *
 * * 7、void sort(int[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
 * *
 * * 8、void sort(char[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
 * *
 * * 9、void sort(double[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
 * @Author crazy402
 * @Date 2022/5/18 21:04
 * @Version 1.0
 **/
public class MyArrays {
    public int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        int index = 0;

        while (left <= right) {
            int mid = right - (right - left) / 2;
            if (value > arr[mid]) {
                left = mid + 1;
            }
            if (value < arr[mid]) {
                right = mid - 1;
            }
            if (value == arr[mid]) {
                index = mid;
                break;
            }
        }

        if (left > right) {
            index = -1;
            return index;
        } else {
            return index;
        }

    }

    public int  binarySearch(char[]  arr,  char  value) {
        int left = 0;
        int right = arr.length - 1;
        int index = 0;

        while (left <= right) {
            int mid = right - (right - left) / 2;
            if (value > arr[mid]) {
                left = mid + 1;
            }
            if (value < arr[mid]) {
                right = mid - 1;
            }
            if (value == arr[mid]) {
                index = mid;
                break;
            }
        }

        if (left > right) {
            index = -1;
            return index;
        } else {
            return index;
        }
    }

    public int  binarySearch(double[]  arr,  double  value) {
        int left = 0;
        int right = arr.length - 1;
        int index = 0;

        while (left <= right) {
            int mid = right - (right - left) / 2;
            if (value > arr[mid]) {
                left = mid + 1;
            }
            if (value < arr[mid]) {
                right = mid - 1;
            }
            if (value == arr[mid]) {
                index = mid;
                break;
            }
        }

        if (left > right) {
            index = -1;
            return index;
        } else {
            return index;
        }
    }

    public int[]  copy(int[] arr , int length) {
        int[] arr1 = new int[length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public double[]  copy(double[] arr , int length) {
        double[] doubles = new double[length];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = arr[i];
        }
        return doubles;
    }

    public char[]  copy(char[] arr , int length) {
        char[] chars = new char[length];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = arr[i];
        }
        return chars;
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length- 1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void sort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length- 1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    char temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void sort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length- 1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    double temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
