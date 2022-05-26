package day.Day4Demo;

/**
 * @ClassName Day04Demo03
 * @Description //利用数组存储26个英文字母
 * @Author crazy402
 * @Date 2022/5/12 11:21
 * @Version 1.0
 **/
public class Day04Demo03 {
    public static void main(String[] args) {
        char[] arr = new char[26];

        System.out.print("存储字母前: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = (char) ('a' + i);
                System.out.print(arr[i]);
            }else {
                arr[i] = (char) ('a' + i);
                System.out.print("," + arr[i]);
            }

        }
        System.out.print("]");



    }
}
