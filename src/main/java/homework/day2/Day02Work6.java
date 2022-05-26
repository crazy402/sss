package homework.day2;

/**
 * @ClassName Day02Work6
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/11 18:58
 * @Version 1.0
 **/
public class Day02Work6 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 1;
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("3,4,1中最大值是:" + max);
    }
}
