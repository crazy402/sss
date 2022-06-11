package Test.Test;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/9 15:29
 * @description //
 **/
public class NumThread implements Runnable{
    int sum = 0;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("i = " + i);
        }
    }
}
