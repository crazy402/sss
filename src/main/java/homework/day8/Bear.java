package homework.day8;

/**
 * @ClassName Bear
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/20 18:39
 * @Version 1.0
 **/
public class Bear extends Animal {
    @Override
    public void eat() {
        System.out.println(getColor()+getNumOfLeg()+"腿熊在吃蜂蜜");
    }

    public void catchFish() {
        System.out.println(getColor()+getNumOfLeg()+"腿熊在抓鱼");
    }
}
