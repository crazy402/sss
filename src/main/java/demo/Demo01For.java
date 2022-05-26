package demo;

/**
 * @ClassName Demo01For
 * @Description //for求和
 * @Author crazy402
 * @Date 2022/5/14 9:15
 * @Version 1.0
 **/
public class Demo01For {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
//        for (int i = 0; i < 4; i++) {
//            sum += i;
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//                count++;
//            }
//        }
//        System.out.println("sum = " + sum);
//        System.out.println("count = " + count);

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println("");
        }


    }

}
