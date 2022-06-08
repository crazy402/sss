package day.Day20Demo;

import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName Test6
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/7 19:07
 * @Version 1.0
 **/
public class Test6 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Test\\123.txt");

        char[] chars = new char[1024];
        int i = 0;
        while ((i = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, i));
        }
        fr.close();
    }
}
