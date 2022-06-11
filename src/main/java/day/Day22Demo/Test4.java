package day.Day22Demo;


/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/10 18:37
 * @description //
 **/
public class Test4 {
    public static void main(String[] args){



        try {

            int[] arr = new int[10];

            System.out.println(arr[0]);

            arr = null ;
            System.out.println(arr[10]);

        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("数组角标越界");

        } catch (NullPointerException e) {

            System.out.println("空指针异常");

        }
    }



}
