package homework.day8;

/**
 * @ClassName Animal
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/20 18:35
 * @Version 1.0
 **/
public abstract  class Animal {
    private String color;
    private int numOfLeg;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfLeg() {
        return numOfLeg;
    }

    public void setNumOfLeg(int numOfLeg) {
        this.numOfLeg = numOfLeg;
    }

    public Animal() {
    }

    public Animal(String color, int numOfLeg) {
        this.color = color;
        this.numOfLeg = numOfLeg;
    }

    public void eat() {
        System.out.println("喜欢吃");
    }

}
