package day.Day5Demo;

/**
 * @ClassName Dog
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/16 19:36
 * @Version 1.0
 **/
public class Dog {
    String type;
    String nikeName;
    int energy;
    final int MAX_ENERGY = 10000;

    //吃东西
    void eat() {
        if (energy < MAX_ENERGY) {
            energy += 10;
        }
    }

    public Dog() {
    }

    public Dog(String type, String nikeName, int energy) {
        this.type = type;
        this.nikeName = nikeName;
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", nikeName='" + nikeName + '\'' +
                ", energy=" + energy +
                ", MAX_ENERGY=" + MAX_ENERGY +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getType() {
        return type;
    }

    public String getNikeName() {
        return nikeName;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMAX_ENERGY() {
        return MAX_ENERGY;
    }
}
