package Test.Test;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/9 15:29
 * @description //
 **/
public class Test18 {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        new Thread(numThread).start();
    }

}
