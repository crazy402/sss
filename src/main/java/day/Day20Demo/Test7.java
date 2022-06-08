package day.Day20Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName Test7
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/7 19:10
 * @Version 1.0
 **/
public class Test7 {
    /**
     * BufferedWriter写入文本文件
     * 创建对象，构造方法传递字符输出流：OutputStreamWriter, FileWriter
     * 写入的文本数据需要换行，不要手写 \r\n
     * 调用缓冲流对象的方法newLine()
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Test\\123.txt"));

        bw.write("你好世界");
        bw.flush();
        bw.newLine();
        bw.flush();
        bw.write("hello world");

        bw.close();
    }
}
