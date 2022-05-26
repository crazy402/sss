package homework.day11.Test4;

/**
 * @ClassName Apple
 * @Description //
 * @Author crazy402
 * @Date 2022/5/25 19:14
 * @Version 1.0
 **/
public class Apple {
    private double size;
    private String color;

    public Apple() {
    }

    public Apple(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
