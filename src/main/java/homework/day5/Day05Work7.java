package homework.day5;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName Day05Work7
 * @Description //需求:
 * 	利用随机数产生一组双色球,其实就是由两组指定范围的的数字组成
 * 	1.有6个红球: 1到33 包含1和33	[1,33] -> [0,32] + 1 -> [0,33) + 1-> r.nextInt(33)+1
 *     2.有1个蓝球: 1到16 包含1和16	[1,16] -> [0,15] + 1 -> [0,16) + 1-> r.nextInt(16)+1
 *   	3.这7个数字打印在一行上每个数字之间用空格隔开
 *
 * 打印效果如下:
 * 	13 1 8 13 19 15 10
 * @Author crazy402
 * @Date 2022/5/16 18:48
 * @Version 1.0
 **/
public class Day05Work7 {
    public static void main(String[] args) {
        getDoubleBall();

        //  System.out.println("Arrays.toString(doubleBall) = " + Arrays.toString(doubleBall));
    }

    public static void getDoubleBall() {
        int[] red = new int[6];

        Random random = new Random();
        for (int i = 0; i < red.length; i++) {
            red[i] = random.nextInt(33) + 1;
        }
        int blue = random.nextInt(16) + 1;

        int[] doubleBall = new int[7];
        for (int i = 0; i < doubleBall.length; i++) {
            if (i != doubleBall.length - 1) {
                doubleBall[i] = red[i];
            }else {
                doubleBall[i] = blue;
            }

        }

        for (int i = 0; i < doubleBall.length; i++) {
            System.out.print(doubleBall[i]+" ");
        }
    }

}
