package homework.day8;

/**
 * @ClassName Test01
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/20 18:19
 * @Version 1.0
 **/
public class Day08Work1 {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        newPhone.setBrand("华为");
        newPhone.setPrice(6666);

        System.out.println(newPhone.getBrand()+"..."+newPhone.getPrice());

        newPhone.Call("张三");
        newPhone.sendMessage();
        newPhone.playGame();
    }
}
