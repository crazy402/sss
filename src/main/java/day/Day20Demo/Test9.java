package day.Day20Demo;

import java.io.*;

/**
 * @ClassName Test9
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/7 19:19
 * @Version 1.0
 **/
public class Test9 {
    public static void main(String[] args) throws IOException{
        printFile();
    }

    /**
     * @throws IOException
     * printWriter 输出数据 目的是字符输出
     */
    public static void printWriter() throws IOException {
        FileWriter fw = new FileWriter("writer.txt");
        PrintWriter pw = new PrintWriter(fw);

        pw.println(666);
        pw.println("嘻嘻嘻");
        pw.close();

    }

    /**
     * printStream 输出数据 目的是字符输出
     */
    public static void printStream() throws IOException{
        FileOutputStream fos = new FileOutputStream("stream.txt");
        PrintWriter pw = new PrintWriter(fos);

        pw.println(666);
        pw.println("嘻嘻嘻");
        pw.close();

    }
    public static void printString() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("String.txt");
        pw.println(666);
        pw.println("嘻嘻嘻");
        pw.close();
    }

    public static void printFile() throws FileNotFoundException {
        File file = new File("file.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println(666);
        pw.println("嘻嘻嘻");
        pw.close();
    }
}
