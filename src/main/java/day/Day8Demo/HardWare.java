package day.Day8Demo;

/**
 * @ClassName HardWare
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/21 14:49
 * @Version 1.0
 **/
public class HardWare extends Maintenance {
    @Override
    public void work() {
        System.out.println(""+getId()+getName()+"修复打印机");
    }
}
