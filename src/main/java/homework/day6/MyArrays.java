package homework.day6;

/**
 * @ClassName MyArrays
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/17 19:03
 * @Version 1.0
 **/
public class MyArrays {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public int indexOf(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int[] copy(int[] arr, int len) {
        int[] arrLen = new int[len];

//        for (int i = 0; i < arr.length; i++) {
//            if (i <= len) {
//                arrLen[i] = arr[i];
//            }
//        }

        for (int i = 0; i < arrLen.length; i++) {
            arrLen[i] = arr[i];
        }

        return arrLen;

    }
}
