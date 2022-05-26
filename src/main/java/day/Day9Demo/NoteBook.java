package day.Day9Demo;


/**
 * @ClassName NoteBook
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 11:12
 * @Version 1.0
 **/
public class NoteBook {
    public void star() {
        System.out.println("开启电脑");
    }
    public void useUsb (USB usb) {
        if (usb instanceof MouseImpl) {
            usb.open();
            MouseImpl mouse = (MouseImpl) usb;
            mouse.click();
            usb.close();
        }
        if (usb instanceof KeyBroadImpl) {
            usb.open();
            KeyBroadImpl keyBroad = (KeyBroadImpl) usb;
            keyBroad.input();
            usb.close();
        }
    }
    public void stop() {
        System.out.println("关闭电脑");
    }

}
