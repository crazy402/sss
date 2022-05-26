package homework.day7;

import java.util.Arrays;

/**
 * @ClassName Day07Work4
 * @Description //
 *
 * 案例：
 *
 * ​	声明圆Circle类，包含radius属性（本题属性不私有化）
 *
 * ​	在PassParamDemo类中，声明如下方法，并体会方法的参数传递机制：
 *
 * 1、public void  doubleNumber(int num)：尝试将num变为原来的2倍大，看是否可以将给num赋值的实参变量值也扩大2倍，如果不能，请画图说明为什么？
 *
 * 2、public void toUpperCase(char letter)：尝试将letter的小写字母转为大写字母，看是否可以将给letter赋值的实参变量值也转为大写，如果不能，请画图说明为什么？
 *
 * 3、public void expandCircle(Circle  c，double times)：尝试将Circle的c对象的半径扩大为原来的times倍，看是否可以将给c赋值的实参对象的半径也扩大times倍，如果可以，请画图说明为什么？
 *
 * 4、public void sort(int[] arr)：尝试对arr数组实现从小到大排序，看是否可以将给arr赋值的实参数组也排序，如果可以，请画图说明为什么？
 *
 * ​	在Test04测试类的main()方法中调用测试
 * @Author crazy402
 * @Date 2022/5/19 10:12
 * @Version 1.0
 **/
public class Day07Work4 {
    public static void main(String[] args) {
        PassParamDemo passParamDemo = new PassParamDemo();
//        passParamDemo.doubleNumber(5);
//        passParamDemo.toUpperCase('a');

//        Circle circle = new Circle();
//        circle.radius = 2.0;
//        passParamDemo.expandCircle(circle, 3.14);

        int[] arr = {1,3,5,2,4};
        passParamDemo.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
