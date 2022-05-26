package homework.day7;

/**
 * @ClassName EmployeeManager
 * @Description //
 * （1）public void print(Employee[] all)：遍历打印员工数组中的每个员工的详细信息
 * <p>
 * ​	（2）public void sort(Employee[] all)：将all员工数组按照年龄从高到低排序
 * <p>
 * ​	（3）public void addSalary(Employee[] all, double increament)：将all员工数组的每一个员工的工资，
 * 增加increament
 * @Author crazy402
 * @Date 2022/5/19 10:43
 * @Version 1.0
 **/
public class EmployeeManager {

    public void print(Employee[] all) {
        for (int i = 0; i < all.length; i++) {
            System.out.println("all[i] = " + all[i]);
        }
    }

    public void sort(Employee[] all) {
        for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all.length - 1 - i; j++) {
                if (all[j].age < all[j + 1].age) {
                    Employee temp = all[j];
                    all[j] = all[j + 1];
                    all[j + 1] = temp;
                }
            }
        }
    }

    public void addSalary(Employee[] all, double increament) {
        for (int i = 0; i < all.length; i++) {
            all[i].salary += increament;
        }
    }
}
