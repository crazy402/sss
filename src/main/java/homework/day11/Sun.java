package homework.day11;

/**
 * @ClassName Sun
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 18:44
 * @Version 1.0
 **/
public class Sun extends Star implements Universe{
    @Override
    public void shine() {
        System.out.println("sun:光照八分钟，到达地球");
    }

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
}
