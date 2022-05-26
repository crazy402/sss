package day.Day10Demo;

/**
 * @ClassName ExceptionDemo
 * @Description //测试
 * @Author crazy402
 * @Date 2022/5/23 18:55
 * @Version 1.0
 **/
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {34, 12, 67};
        int element = ArrayTools.getElement(arr, 2);
        System.out.println("element = " + element);
        System.out.println("over");
    }
}
