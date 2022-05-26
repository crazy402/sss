package homework.day8;

/**
 * @ClassName Day08Work3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/20 18:39
 * @Version 1.0
 **/
public class Day08Work3 {
    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.setColor("黑白");
        panda.setNumOfLeg(4);

        panda.eat();
        panda.climbTree();

        Bear bear = new Bear();
        bear.setColor("棕色");
        bear.setNumOfLeg(4);
        bear.eat();
        bear.catchFish();

    }
}
