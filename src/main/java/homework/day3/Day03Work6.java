package homework.day3;

/**
 * @ClassName Day03Work6
 * @Description //需求:
 * 	1.打印所有四位数中 个位 + 千位 == 百位 + 十位 的数字
 *     2.最后要打印符合条件的数字的总数量
 *    	3.打印格式如下:
 * 		   1010
 *         1021
 *         1032
 *         1043
 *         ....
 *         以上满足条件的四位数总共有 615 个
 * 实现步骤:
 * @Author crazy402
 * @Date 2022/5/13 23:52
 * @Version 1.0
 **/
public class Day03Work6 {
    public static void main(String[] args) {
        int count = 0;


        for (int i = 1000; i < 10000; i++) {
            int qian = i / 1000;
            int bai = (i - qian * 1000) / 100;
            int shi = (i  - qian * 1000 - bai * 100) / 10;
            int ge = i - qian * 1000 - bai * 100 - shi * 10;

            if ((ge + qian) == (bai + shi)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
