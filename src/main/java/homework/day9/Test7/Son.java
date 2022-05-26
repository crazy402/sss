package homework.day9.Test7;

/**
 * @ClassName Son
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 20:25
 * @Version 1.0
 **/
public class Son extends Father {
    static {
        System.out.println("（4）子类的静态代码块");
    }

    {
        System.out.println("（5）子类的非静态代码块");
    }

    Son() {
        System.out.println("（6）子类的无参构造");
    }
}
