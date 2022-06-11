package Test.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/9 15:28
 * @description //
 * 17、请编写代码把一个GBK的文本文件内容读取后存储到一个UTF-8的文本文件中
 **/
public class Test16 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileInputStream fis = new FileInputStream("");
        InputStreamReader isr = new InputStreamReader(fis, "GBK");


    }
}
