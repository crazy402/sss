package day.Day19Demo;

import java.io.File;
import java.util.ArrayList;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/6 14:08
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {
        File file = new File("C:\\Java\\repo");

        iteratorDir(file);
    }
    public static void iteratorDir(File file) {
        File[] files = file.listFiles(new MyFileFilter());

        for (File file1 : files) {
            if (file1.isDirectory()) {
                iteratorDir(file1);
            }
            System.out.println(file1);
        }

    }


}
