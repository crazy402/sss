package day.Day8Demo;

/**
 * @ClassName Animal
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/21 9:01
 * @Version 1.0
 **/
public class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println("吃");
    }

    public Animal() {
    }

    public Animal(String name, int age) {
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
