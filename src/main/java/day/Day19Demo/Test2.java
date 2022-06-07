package day.Day19Demo;

import java.io.File;

/**
 * @ClassName Test2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/6 10:00
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        File file = new File("C:\\Java\\repo");
        demo01(file);
    }
    public static void demo01(File file) {
        System.out.println(file);

        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()) {
                demo01(listFile);
            }else {
                System.out.println(listFile);
            }
        }

    }
}
