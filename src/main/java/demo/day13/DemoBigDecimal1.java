package demo.day13;

import java.math.BigDecimal;

/**
 * @ClassName DemoBigDecimal1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/27 10:28
 * @Version 1.0
 **/
public class DemoBigDecimal1 {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("2.233");
        BigDecimal bigDecimal2 = new BigDecimal("2.33");

        System.out.println(bigDecimal1.add(bigDecimal2));

        System.out.println(bigDecimal1.subtract(bigDecimal2));

        System.out.println(bigDecimal1.multiply(bigDecimal2));

        System.out.println(bigDecimal1.divide(bigDecimal2,2,BigDecimal.ROUND_HALF_UP));
    }
}
