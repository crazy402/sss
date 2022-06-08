package Test.Test;

/**
 * @ClassName Test3
 * @Description //3、编写方法实现：求某年某月某日是这一年的第几天
 * @Author crazy402
 * @Date 2022/6/7 20:06
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {

    }

    public static void dayOfYear(int year, int month, int day) {
        int sum = day;
        int[] month1 = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] month2 = {31,29,31,30,31,30,31,31,30,31,30,31};
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            for (int i = 0; i < month2.length; i++) {
                sum+=month2[i];
            }
        } else {
            for (int i = 0; i < month1.length; i++) {
                sum+=month1[i];
            }
        }

        System.out.println(sum);
    }

}
