package day.Day15Demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName Test1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 15:24
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new MyRunable());
        executorService.submit(new MyRunable());
        executorService.submit(new MyRunable());
        executorService.submit(new MyRunable());

        executorService.shutdown();
    }
}
