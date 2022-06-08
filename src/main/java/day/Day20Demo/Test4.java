package day.Day20Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/7 19:00
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Test\\123.txt");

        InputStreamReader isr = new InputStreamReader(fis, "GBK");

        char[] chars = new char[1024];

        int i = 0;

        while ((i = isr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, i));
        }

        isr.close();
    }
}
