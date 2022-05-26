package demo.day13;

import java.math.BigDecimal;

/**
 * @ClassName DemoBigDecimal
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/26 14:05
 * @Version 1.0
 **/
public class DemoBigDecimal {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(3.55555);
        BigDecimal bigDecimal1 = new BigDecimal(2.534434);

        System.out.println(bigDecimal.add(bigDecimal1));
    }
}
