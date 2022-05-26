package homework.day9.Test7;

/**
 * @ClassName Father
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 20:25
 * @Version 1.0
 **/
public class Father {
    static {
        System.out.println("（1）父类的静态代码块");
    }

    {
        System.out.println("（2）父类的非静态代码块");
    }

    Father() {
        System.out.println("（3）父类的无参构造");
    }
}
