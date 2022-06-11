package Test.Test;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/9 14:10
 * @description //10、编写一个懒汉式单例设计模式
 **/
public class Test10 {
    private Test10() {
    }

    private static Test10 T = null;

    private static Test10 getInstance() {
        if (T == null) {
            T = new Test10();
        }
        return T;
    }


}
