package homework.day9.Test13;

/**
 * @ClassName Zi
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/24 18:38
 * @Version 1.0
 **/
public class Son extends Father{

    private String info = "尚硅谷";



    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}
