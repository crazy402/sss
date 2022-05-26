package demo;

/**
 * @ClassName Demo06
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/18 15:26
 * @Version 1.0
 **/
public class Demo06BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int left = 0;
        int right = arr.length - 1;
        int target = 2;



        while (left <= right) {
            int mid = right - (right-left)/2;
            if (target > arr[mid]) {
                left = mid + 1;
            }else if (target < arr[mid]){
                right = mid - 1;
            }else {
                System.out.println(mid);
                break;
            }
        }

        if (left > right) {
            System.out.println("没找到");
        }
    }
}
