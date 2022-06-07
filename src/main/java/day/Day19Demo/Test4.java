package day.Day19Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/6 19:10
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\资料\\账号密码.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\资料\\test\\账号密码.txt");

        byte[] bytes = new byte[1024];
        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            fileOutputStream.write(bytes,0,i);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }


}
