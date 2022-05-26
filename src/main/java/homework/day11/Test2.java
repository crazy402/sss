package homework.day11;

/**
 * @ClassName Test2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 18:41
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();

        System.out.println("==============");

        Universe universe = new Sun();
        universe.doAnything();

        Sun sun = (Sun)universe;
        sun.shine();

    }
}
