package homework.day9.Test6;

/**
 * @ClassName Sub
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 20:07
 * @Version 1.0
 **/
public class Sub extends Base {
    Sub() {
        super.method(70);
    }
    {
        System.out.println("sub");
    }
    @Override
    public void method(int j) {
        System.out.println("sub : "+j);
    }
}
