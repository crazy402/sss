package day.Day20Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName Test8
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/7 19:14
 * @Version 1.0
 **/
public class Test8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Test\\123.txt"));

        /*char[] chars = new char[1024];
        int i = 0;
        while ((i = br.read(chars)) != -1) {
            System.out.println(new String(chars, 0, i));
        }*/

        //bfr对象的方法readLine()读取行，返回字符串
        //定义字符串，接收readLine()方法的返回值
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
