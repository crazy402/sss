package homework.day8;

/**
 * @ClassName Panda
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/20 18:38
 * @Version 1.0
 **/
public class Panda extends Animal {
    @Override
    public void eat() {
        System.out.println(getColor()+getNumOfLeg()+"腿熊猫吃竹子");
    }

    public void climbTree() {
        System.out.println(getColor()+getNumOfLeg()+"腿熊猫在爬树");
    }


}
