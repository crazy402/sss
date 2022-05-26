package day.Day8Demo;

/**
 * @ClassName NetManager
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/21 14:49
 * @Version 1.0
 **/
public class NetManager extends Maintenance{
    @Override
    public void work() {
        System.out.println(""+getId()+getName()+"检测网络");
    }
}
