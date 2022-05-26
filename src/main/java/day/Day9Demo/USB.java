package day.Day9Demo;

/**
 * @author crazy402
 */
public interface USB {
    /**
     * 开启
     */
    void open();

    /**
     * 关闭
     */
    void close();

    /**
     * 默认方法
     */
    public default void openDef(){
        System.out.println("打开默认方法");
    }


    /**
     * 无返回值
     */
    void open1();




}
