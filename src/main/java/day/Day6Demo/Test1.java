package day.Day6Demo;

/**
 * @ClassName Test1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/17 19:48
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        sum(1,2,3,4,5);

    }
    public static void sum(int...arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
