package homework.day3;

/**
 * @ClassName Day03Work4
 * @Description //
 *  需求:
 * 	打印出1到100之间的既是3的倍数又是5倍数的数字以及这些数字的和
 *  实现步骤:
 * @Author crazy402
 * @Date 2022/5/13 23:39
 * @Version 1.0
 **/
public class Day03Work4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
