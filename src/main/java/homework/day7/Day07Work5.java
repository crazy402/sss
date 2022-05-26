package homework.day7;

/**
 * @ClassName Day07Work5
 * @Description //
 * 1）public static void main(String[] args)：在main方法中，创建Employee[]数组，并创建5个员工对象放到数组中，并为员工对象的属性赋值
 *
 * （2）创建EmployeeManager对象，
 *
 * （3）调用print方法，显示员工信息
 *
 * （4）调用sort方法对员工数组进行按照年龄排序，并调用print方法，显示员工信息
 *
 * （5）调用addSalary方法给每一个员工加薪1000元，并调用print方法，显示员工信息
 * @Author crazy402
 * @Date 2022/5/19 11:09
 * @Version 1.0
 **/
public class Day07Work5 {
    public static void main(String[] args) {
        Employee[] employees =new Employee[5];
        EmployeeManager employeeManager = new EmployeeManager();

        Employee e1 = new Employee();
        e1.name = "张三";
        e1.salary = 10000;
        e1.age = 18;
        e1.id = 1;
        employees[0] = e1;
        Employee e2 = new Employee();
        e2.name = "李四";
        e2.salary = 10000;
        e2.age = 17;
        e2.id = 2;
        employees[1] = e2;
        Employee e3 = new Employee();
        e3.name = "王五";
        e3.salary = 1000;
        e3.age = 19;
        e3.id = 3;
        employees[2] = e3;
        Employee e4 = new Employee();
        e4.name = "赵六";
        e4.salary = 20000;
        e4.age = 28;
        e4.id = 4;
        employees[3] = e4;
        Employee e5 = new Employee();
        e5.name = "田七";
        e5.salary = 10;
        e5.age = 13;
        e5.id = 5;
        employees[4] = e5;

        employeeManager.addSalary(employees,1000);
        employeeManager.sort(employees);
        employeeManager.print(employees);


    }
}
