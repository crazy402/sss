package day.Day14Demo;

/**
 * @ClassName Demo1
 * @Description //拆箱装箱
 * @Author crazy402
 * @Date 2022/5/28 9:23
 * @Version 1.0
 **/
public class Demo1 {
    public static void main(String[] args) {
        Integer integer = new Integer(100);


        Integer integer1 = Integer.valueOf(integer);
        System.out.println(integer1);



        int i = integer.intValue();
        System.out.println(i+1);
    }
}
