package day.Day8Demo;

/**
 * @ClassName Employee
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/21 14:42
 * @Version 1.0
 **/
public abstract class Employee {
    int id;
    String name;

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void work();
}
