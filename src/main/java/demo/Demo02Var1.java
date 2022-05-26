package demo;

/**
 * @ClassName Demo02Var1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/18 10:29
 * @Version 1.0
 **/
public class Demo02Var1 {
    public static void main(String[] args) {
        String concat = concat("*", "张三", "李四", "王五");
        System.out.println("concat = " + concat);
    }

    public static String concat(String s, String...arr) {
        String s1 = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s1 += arr[i];
            }else {
                s1 += arr[i] + s;
            }
        }
        return s1;
    }
}
