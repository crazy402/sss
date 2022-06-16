package Test2;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/13 18:44
 * @description //2.	一个球从100米高度自由落下，
 * 每次落地后反跳回原高度的一半，再落下，求它在第10次落地时，
 * 共经过多少米？第10次反弹多高
 **/
public class Test2 {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            num = num / 2;
            sum += num;
            System.out.println("num = " + num);
            System.out.println("sum = " + sum);
        }


    }

}
