package day.Day8Demo;

/**
 * @ClassName Student
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/21 14:20
 * @Version 1.0
 **/
public class Student extends Person {
    public Student(String s, int i) {

    }

    @Override
    public void work() {
        System.out.println("学生的工作就是读书");
    }

    @Override
    public void eat() {
        System.out.println("疫情期间 学生只能恰食堂 不能点外卖");
    }
}
