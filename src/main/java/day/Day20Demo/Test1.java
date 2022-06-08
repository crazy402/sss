package day.Day20Demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @ClassName Test1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/7 18:40
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流, 绑定文件
        FileOutputStream fos = new FileOutputStream("D:\\Test\\123.txt");
        //创建转换对象 构造方法 传递字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        //转换流对象的方法写入字符串
        osw.write("hello world");

        //字符输出流需要刷新
        osw.flush();
        osw.close();


    }
}
