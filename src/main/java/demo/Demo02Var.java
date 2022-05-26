package demo;

/**
 * @ClassName Demo02Var
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/18 10:19
 * @Version 1.0
 **/
public class Demo02Var {
    public static void main(String[] args) {

        int sum = sum(1, 2, 3, 4, 5);
        System.out.println("sum = " + sum);

    }
    public static int sum(int...arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
