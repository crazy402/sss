package day.Day11Demo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/24 14:12
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) throws IOException {
        String s = "adsadad.txt";
        add(s);
    }

    public static void add(String s) throws IOException {
        if (s == null) {
            throw new IOException("IO异常");
        }
        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("文件找不到");
        }

        System.out.println("我要执行");

    }
}
