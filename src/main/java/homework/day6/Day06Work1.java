package homework.day6;

/**
 * @ClassName Day06Work1
 * @Description //案例：
 *
 * ​	声明员工类Employee，包含属性：编号、姓名、年龄、薪资，
 *
 * ​	声明Test01测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
 * @Author crazy402
 * @Date 2022/5/17 16:39
 * @Version 1.0
 **/
public class Day06Work1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.id = 1;
        employee1.name = "张三";
        employee1.age = 23;
        employee1.salary = 10000.0;

        employee2.id = 2;
        employee2.name = "李四";
        employee2.age = 22;
        employee2.salary = 11000.0;

        System.out.println("员工1的编号是: "+employee1.id+
                ",姓名是: "+ employee1.name+
                ",年龄是: "+employee1.age+
                ",薪资是: "+employee1.salary);
        System.out.println("员工1的编号是: "+employee2.id+
                ",姓名是: "+ employee2.name+
                ",年龄是: "+ employee2.age+
                ",薪资是: "+ employee2.salary);

    }
}
