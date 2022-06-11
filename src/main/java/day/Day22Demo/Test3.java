package day.Day22Demo;

import java.lang.reflect.Constructor;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/10 18:25
 * @description //
 **/
public class Test3 {
    public static void main(String[] args) throws Exception {
        demo3();
    }

    /**
     * 反射获取无参数的构造方法执行
     * 1： 获取到Person类的class文件对象
     * 2： class文件对象的方法，获取Person类的构造方法
     * 3： 执行构造方法
     */

    public static void demo1() throws Exception {
        Class<?> cla = Class.forName("day.Day22Demo.Person");

        // getConstructors() 获取所有的构造方法 返回的是数组
        Constructor<?>[] constructors = cla.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }

        //getConstructor() 获取单个构造方法
        Constructor<?> constructor = cla.getConstructor();
        System.out.println("constructor = " + constructor);

        //Constructor类中的方法 newInstance 运行获取到的构造方法
        //Object newInstance(运行构造方法的实际参数)返回新建的对象
        Object o = cla.newInstance();
        System.out.println("o = " + o);


    }

    /**
     * 反射获取有参数构造方法执行
     */
    public static void demo2() throws Exception{
        Class<?> cla = Class.forName("day.Day22Demo.Person");

        Constructor<?> constructor = cla.getConstructor(String.class, Integer.class);

        System.out.println(constructor);

        Object o = cla.newInstance();
        System.out.println("o = " + o);
    }

    /**
     * 反射获取数构造方法执行-简单方式
     *
     * 被反射的类中，必须具有public权限的无参数构造方法。
     * Class类中有方法newInstance()直接创建对象，
     * newInstance()方法获取自动调用被反射类的无参数构造方法。
     *
     */
    public static void demo3() throws Exception{
        Class<?> cla = Class.forName("day.Day22Demo.Person");

        Object o = cla.newInstance();

        System.out.println("o = " + o);
    }
}
