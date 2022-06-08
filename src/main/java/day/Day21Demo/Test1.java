package day.Day21Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName Test1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/8 9:21
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\402\\studyDay\\src\\main\\resources\\config.properties");

        Properties properties = new Properties();
        properties.load(fis);

        System.out.println("properties = " + properties);


    }
}
