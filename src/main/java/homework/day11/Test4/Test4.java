package homework.day11.Test4;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 19:30
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");

        new CompareBig().compare(a1, a2);
        new CompareColor().compare(a1, a2);
    }
}
