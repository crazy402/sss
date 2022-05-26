package homework.day9.Test6;

/**
 * @ClassName Base
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 20:06
 * @Version 1.0
 **/
public class Base {
    Base(){
        method(100);
    }
    {
        System.out.println("base");
    }
    public void method(int i) {
        System.out.println("base : " + i);
    }
}
