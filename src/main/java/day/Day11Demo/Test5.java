package day.Day11Demo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName test5
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/24 14:31
 * @Version 1.0
 **/
public class Test5 {
    public static void main(String[] args) {
        String s = "xxxx.txt11";
        try {
            String b = null;
            System.out.println(b.length());
            add(s);
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("删除");
        System.out.println("修改");
        System.out.println("查询");
    }
    public static void add(String s) throws IOException {
        if (s == null) {
            throw new IOException("IO异常");
        }

        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("找不到文件");
        }
    }
}
