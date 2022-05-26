package demo;

/**
 * @ClassName Demo02While
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/14 9:49
 * @Version 1.0
 **/
public class Demo02While {
    public static void main(String[] args) {
        int mountain = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper < mountain) {
            paper *= 2;
            count++;
        }
        System.out.println("count = " + count);
    }
}
