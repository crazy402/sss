package day.Day8Demo;

/**
 * @ClassName Person
 * @Description //
 * @Author crazy402
 * @Date 2022/5/21 14:18
 * @Version 1.0
 **/
public abstract class Person {
    String name;
    int age;

    /**
     * 工作
     */
    public abstract void work();

    /**
     * 饮食
     */
    public abstract void eat();

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
