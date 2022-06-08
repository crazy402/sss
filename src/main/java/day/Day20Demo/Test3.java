package day.Day20Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/7 18:56
 * @Version 1.0
 **/
public class Test3 {
    /**
     * InputStreamReader
     * 构造方法：传递字节输入流 FileInputStream
     * 创建使用默认字符编码的，默认指的是平台的默认（GBK）
     * IDEA的默认环境是UTF-8
     * 读取utf文件
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Test\\123.txt");

        InputStreamReader isr = new InputStreamReader(fis);

        char[] chars = new char[1024];

        int i = 0;

        while ((i = isr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, i));
        }

        isr.close();

    }
}
