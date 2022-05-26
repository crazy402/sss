package day.Day8Demo;

/**
 * @ClassName JavaEE
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/21 14:46
 * @Version 1.0
 **/
public class JavaEE extends Developer {
    @Override
    public void work() {
        System.out.println(""+getId()+getName()+"在开发电商网站");
    }
}
