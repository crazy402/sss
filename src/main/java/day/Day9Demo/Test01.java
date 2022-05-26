package day.Day9Demo;

/**
 * @ClassName Test01
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 11:13
 * @Version 1.0
 **/
public class Test01 {
    public static void main(String[] args) {
//        NoteBook noteBook = new NoteBook();
//        noteBook.star();
//        MouseImpl mouse = new MouseImpl();
//        KeyBroadImpl keyBroad = new KeyBroadImpl();
//        noteBook.useUsb(mouse);
//        noteBook.useUsb(keyBroad);
//        noteBook.stop();

//        final int A;
//        A = 100;
//
//        System.out.println("A = " + A);

        USB usb = open2(new MouseImpl());
        usb.open1();

    }

//    public static void open1(USB usb) {
//        usb.open1();
//    }

    public static USB open2(MouseImpl mouse) {
        return mouse;
    }

}
