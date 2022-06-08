package day.Day20Demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @ClassName Test2
 * @Description //
 *
 * @Author crazy402
 * @Date 2022/6/7 18:48
 * @Version 1.0
 * 构造方法：传递字节输出流 FileOutputStream，第二个参数传递字符串的编码表名
 * 写入文本数据，使用指定的编码表名
 * 编码表名不分大小写
 */
public class Test2 {
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("D:\\Test\\123.txt");

        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");

        osw.write("你好");

        osw.flush();

        osw.close();

    }
}
