package day.Day11Demo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName Test6
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/24 15:48
 * @Version 1.0
 **/
public class Test6 {
    public static void main(String[] args) {

    }
    public static void add(String s) throws IOException {
        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("文件找不到");
        }
    }
}
