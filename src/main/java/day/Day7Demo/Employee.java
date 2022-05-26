package day.Day7Demo;

/**
 * @ClassName Employee
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/20 15:29
 * @Version 1.0
 **/
public class Employee {
    String name;
    int age;

    public Employee() {
    }

    public Employee(String name, int age) {
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
