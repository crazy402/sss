package homework.day7;

/**
 * @ClassName PassParamDemo
 * @Description //在PassParamDemo类中，声明如下方法，并体会方法的参数传递机制：
 *
 * 1、public void  doubleNumber(int num)：尝试将num变为原来的2倍大，
 *      看是否可以将给num赋值的实参变量值也扩大2倍，如果不能，请画图说明为什么？
 *
 * 2、public void toUpperCase(char letter)：尝试将letter的小写字母转为大写字母，
 *      看是否可以将给letter赋值的实参变量值也转为大写，如果不能，请画图说明为什么？
 *
 * 3、public void expandCircle(Circle  c，double times)：尝试将Circle的c对象的半径扩大为原来的times倍，
 *      看是否可以将给c赋值的实参对象的半径也扩大times倍，如果可以，请画图说明为什么？
 *
 * 4、public void sort(int[] arr)：尝试对arr数组实现从小到大排序，看是否可以将给arr赋值的实参数组也排序，
 *      如果可以，请画图说明为什么？
 * @Author crazy402
 * @Date 2022/5/19 10:18
 * @Version 1.0
 **/
public class PassParamDemo {
    public void  doubleNumber(int num) {
        num *= 2;
        System.out.println(num);
    }

    public void toUpperCase(char letter) {
        letter = (char) (letter - 32);
        System.out.println(letter);
    }

    public void expandCircle(Circle  c, double times) {
        c.radius *= times;
        System.out.println(c.radius);
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

}
