package demo;

import java.util.Arrays;

/**
 * @ClassName Demo02TwoArray
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/16 11:31
 * @Version 1.0
 **/
public class Demo02TwoArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{1},{1,3}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //System.out.print(arr[i][j]+" ");
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
