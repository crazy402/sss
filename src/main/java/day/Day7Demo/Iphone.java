package day.Day7Demo;

/**
 * @ClassName Iphone
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/20 14:23
 * @Version 1.0
 **/
public class Iphone {
    private String brand;
    private double price;
    private String color;

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Iphone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public Iphone() {
    }
}
