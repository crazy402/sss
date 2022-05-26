package day.Day8Demo;

/**
 * @ClassName Teacher
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/21 14:22
 * @Version 1.0
 **/
public class Teacher extends Person {
    @Override
    public void work() {
        System.out.println("老师的工作是教书");
    }

    @Override
    public void eat() {
        System.out.println("疫情期间 老师可以食堂也可以出去吃");
    }
}
