package homework.day17;

import java.util.ArrayList;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 19:20
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1(1,"张无忌","河北"));
        list.add(new Student1(2,"张三丰","河南"));
        list.add(new Student1(3,"赵敏","内蒙古"));
        list.add(new Student1(4,"周芷若","四川"));

        for (Student1 student1 : list) {
            if (student1.getName().equals("张三丰")){
                student1.setAddress("山东");
                System.out.println(student1);
            }else {
                System.out.println(student1);
            }
        }

    }
}
