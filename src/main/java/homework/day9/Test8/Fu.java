package homework.day9.Test8;

/**
 * @ClassName Fu
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 20:33
 * @Version 1.0
 **/
public class Fu {
    private static int i = getNum("（1）i");
    private int j = getNum("（2）j");
    static{
        print("（3）父类静态代码块");
    }
    {
        print("（4）父类非静态代码块，又称为构造代码块");
    }
    Fu(){
        print("（5）父类构造器");
    }
    public static void print(String str){
        System.out.println(str + "->" + i);
    }
    public static int getNum(String str){
        print(str);
        return ++i;
    }
}
