package day.Day20Demo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName Test5
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/7 19:05
 * @Version 1.0
 **/
public class Test5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Test\\123.txt");
        fw.write("深圳");
        fw.flush();
        fw.close();
    }
}
