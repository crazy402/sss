package day.Day22Demo;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/10 18:18
 * @description //
 **/
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        demo1();
        demo2();
        demo3();
    }

    /**
     * 通过创建对象获取class对象
     */
    public static void demo1() {
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        System.out.println("aClass = " + aClass);
    }


    /**
     * 通过类名获取class对象
     */
    public static void demo2() {
        Class<Person> personClass = Person.class;
        System.out.println("personClass = " + personClass);
    }

    /**
     * 通过Class类的静态方法获取
     */
    public static void demo3() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("day.Day22Demo.Person");
        System.out.println("aClass = " + aClass);
    }
}
