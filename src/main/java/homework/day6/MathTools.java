package homework.day6;

/**
 * @ClassName MathTools
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/17 18:35
 * @Version 1.0
 **/
public class MathTools {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int mutiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int remainder(int a, int b) {
        return a % b;
    }

    public int getMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    public int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public Boolean equals(int a, int b) {
        return a == b;
    }

    public Boolean isEven(int a) {
        return a % 2 == 0;
    }

    public Boolean isPrimeNumer(int a) {
        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                return false;
            }

        }
        return true;

    }

    public int round(double d) {
        return (int) (d + 0.5);
    }

}
