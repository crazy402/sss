package day.Day19Demo;

import java.io.File;

/**
 * @ClassName Test1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/6 9:33
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        Demo02();
    }
    public static void Demo() {
        File file = new File("C:\\home\\Clash.for.Windows-0.11.4-win");
        System.out.println("file = " + file);
    }

    public static void Demo01() {
        File file = new File("C:\\home", "Clash.for.Windows-0.11.4-win");
        System.out.println("file = " + file);
    }

    public static void Demo02() {
        File parent = new File("C:\\home");
        File file = new File(parent, "Clash.for.Windows-0.11.4-win");
        System.out.println("file = " + file);
    }


}
