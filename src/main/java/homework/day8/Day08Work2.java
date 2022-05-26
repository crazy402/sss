package homework.day8;

/**
 * @ClassName Day08Work2
 * @Description //
 * 每一款手机都有自己的品牌和价格,原来的手机只能打电话,发短信,来电显示只能显示手机号;
 * 现在的新手机针对于来电显示做了功能的升级,还能显示头像,还能显示归属地,请设计程序,完成手机的升级!
 * @Author crazy402
 * @Date 2022/5/20 18:27
 * @Version 1.0
 **/
public class Day08Work2 {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        newPhone.setBrand("小米");
        newPhone.setPrice(1999);

        System.out.println(newPhone.getBrand() + "..." + newPhone.getPrice());

        newPhone.Call("李四");
        newPhone.sendMessage();
        newPhone.show();
    }
}
