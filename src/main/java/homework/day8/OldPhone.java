package homework.day8;

/**
 * @ClassName OldPhone
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/20 18:15
 * @Version 1.0
 **/
public class OldPhone {
    private String brand;
    private int price;



    public OldPhone() {
    }

    public OldPhone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void show() {
        System.out.println("显示手机号");
    }

    public void Call(String name) {
        System.out.println("给" +name+ "打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
