package homework.day7;

/**
 * @ClassName Count
 * @Description //
 *  * ​	在Count类中，声明如下方法：
 *  *
 *  * 1、public long  sum(int...  nums)：求0~n个整数的累加和，如果没有传参，就返回0
 *  *
 *  * 2、public int max(int a, int... others)：求1~n个整数中的最大值
 *  *
 *  * 3、public String concat(String...  strings)：求0~n个字符串的拼接结果
 *  *
 *  * 4、public boolean isEven(int... nums)：判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false
 * @Author crazy402
 * @Date 2022/5/18 19:34
 * @Version 1.0
 **/
public class Count {
    public long  sum(int...  nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int max(int a, int... others) {
        a = others[1];
        for (int i = 1; i < others.length; i++) {
            if (a < others[i]) {
                a = others[i];
            }
        }
        return a;
    }
    public String concat(String...  strings) {
        String concat = "";
        for (int i = 0; i < strings.length; i++) {
            concat += strings[i];
        }
        return concat;
    }

    public boolean isEven(int... nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        if (count == nums.length) {
            return true;
        }else {
            return false;
        }
    }
}
