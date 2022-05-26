package demo.day13;

import java.math.BigInteger;

/**
 * @ClassName DemoBigInteger
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/26 14:00
 * @Version 1.0
 **/
public class DemoBigInteger {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1111111111111111111111111111111111111");
        BigInteger bigInteger1 = new BigInteger("2222222222222222222222222");
        System.out.println(bigInteger.add(bigInteger1));

        System.out.println(bigInteger.subtract(bigInteger1));

        System.out.println(bigInteger.multiply(bigInteger1));

        System.out.println(bigInteger.divide(bigInteger1));
    }
}
