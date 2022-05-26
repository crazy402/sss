package day.Day9Demo;

/**
 * @ClassName Test02
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 15:44
 * @Version 1.0
 **/
public class Test02 {
    public static void main(String[] args) {
       /* USB1 usb1 = method();
        usb1.open();*/

        new USB1(){
            @Override
            public void open() {
                System.out.println("鼠标启动");
            }
        }.open();

        USB1 usb1 = new USB1() {
            @Override
            public void open() {
                System.out.println("0.0");
            }
        };
        usb1.open();
    }

    /*public static USB1 method() {
        class Mouse implements USB1{
            @Override
            public void open() {
                System.out.println("鼠标开启");
            }
        }

        return new Mouse();
    }*/


}
