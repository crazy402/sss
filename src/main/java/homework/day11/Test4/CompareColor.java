package homework.day11.Test4;

/**
 * @ClassName CompareColor
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 19:26
 * @Version 1.0
 **/
public class CompareColor implements CompareAble {
    @Override
    public void compare(Apple a1, Apple a2) {
        System.out.println("挑红的");
        if ("红色".equals(a1.getColor())) {
            System.out.println(a1);
        } else if ("红色".equals(a2.getColor())) {
            System.out.println(a2);
        }
    }



}
