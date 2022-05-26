package homework.day7;

/**
 * @ClassName Employee
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/19 10:38
 * @Version 1.0
 **/
public class Employee {
    int id;
    String name;
    double salary;
    int age;

    public void printInfo() {
        System.out.println("编号: "+ id +"姓名: " + name +"工资: " + salary +"年龄: "+ age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void setInfo(int  i, String n, double s, int a) {
        id = i;
        name = n;
        salary = s;
        age = a;
    }
}
