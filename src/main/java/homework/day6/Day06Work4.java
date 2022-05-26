package homework.day6;

/**
 * @ClassName Day06Work4
 * @Description //案例：
 *
 * ​	声明一个数学计算工具类MathTools，包含如下方法：
 *
 * 1、int add(int a, int b)：求a+b
 *
 * 2、int subtract(int a,int b)：求a-b
 *
 * 3、int mutiply(int a, int b)：求a*b
 *
 * 4、int divide(int a, int b)：求a/b
 *
 * 5、int remainder(int a, int b)：求a%b
 *
 * 6、int max(int a, int b)：求a和b中的最大值
 *
 * 7、int min(int a, int b)：求a和b中的最小值
 *
 * 8、boolean equals(int a, int b)：判断a和b是否相等
 *
 * 9、boolean isEven(int a)：判断a是否是偶数
 *
 * 10、boolean isPrimeNumer(int a)：判断a是否是素数
 *
 * 11、int round(double d)：返回d的四舍五入后的整数值
 *
 * ​	声明一个Test06测试类，并在main方法中调用测试
 * @Author crazy402
 * @Date 2022/5/17 18:37
 * @Version 1.0
 **/
public class Day06Work4 {
    public static void main(String[] args) {
        int a = 10, b= 20;
        double d = 3.14;

        MathTools mathTools = new MathTools();
        int add = mathTools.add(a, b);
        System.out.println("add = " + add);

        int subtract = mathTools.subtract(a, b);
        System.out.println("subtract = " + subtract);

        int mutiply = mathTools.mutiply(a, b);
        System.out.println("mutiply = " + mutiply);

        int divide = mathTools.divide(a, b);
        System.out.println("divide = " + divide);

        int remainder = mathTools.remainder(a, b);
        System.out.println("remainder = " + remainder);

        int max = mathTools.getMax(a, b);
        System.out.println("max = " + max);

        int min = mathTools.getMin(a, b);
        System.out.println("min = " + min);

        Boolean equals = mathTools.equals(a, b);
        System.out.println("equals = " + equals);

        Boolean even = mathTools.isEven(a);
        System.out.println("even = " + even);

        Boolean primeNumer = mathTools.isPrimeNumer(a);
        System.out.println("primeNumer = " + primeNumer);

        int round = mathTools.round(d);
        System.out.println("round = " + round);

    }
}
