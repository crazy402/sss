package demo.day13;

import java.math.BigInteger;

/**
 * @ClassName DemoBigInteger1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 10:22
 * @Version 1.0
 **/
public class DemoBigInteger1 {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("1111111111111111111111111111");
        BigInteger bigInteger2 = new BigInteger("2222222222222222222");

        System.out.println(bigInteger1.add(bigInteger2));

        System.out.println(bigInteger1.subtract(bigInteger2));

        System.out.println(bigInteger1.multiply(bigInteger2));

        System.out.println(bigInteger1.divide(bigInteger2));


    }
}
