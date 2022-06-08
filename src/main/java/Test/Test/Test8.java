package Test.Test;

/**
 * @ClassName Test8
 * @Description //编写代码实现，从一个标准url里取出文件的扩展名，尽可能高效
 * @Author crazy402
 * @Date 2022/6/7 20:50
 * @Version 1.0
 **/
public class Test8 {
    public static void main(String[] args) {
        String str = fileExtNameFromUrl("http://localhost:8080/testweb/index.html");
        System.out.println(str);
    }

    public static String fileExtNameFromUrl(String url){
        return  url.substring((url.lastIndexOf('.')+1));
    }
}
