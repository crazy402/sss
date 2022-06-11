package Test.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/9 15:16
 * @description //
 * 请编写代码读取一个项目根目录下info.properties文件
 * 里面的内容有user=atguigu等，请获取user的value中，并在控制台打印
 **/
public class Test15 {
    public static void main(String[] args) throws IOException {
        File file = new File("info/properties");

        FileInputStream fis = new FileInputStream(file);

        /*byte[] bytes = new byte[1024];
        int i = 0;
        while ((i = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, i));
        }*/

        Properties pro = new Properties();
        pro.load(fis);

        String user = pro.getProperty("user");

        System.out.println(user);


    }

}
