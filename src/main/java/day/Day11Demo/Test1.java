package day.Day11Demo;

/**
 * @ClassName Test1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/24 9:46
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        Person person = new Person("张三",15);
        Person person1 = new Person("张三",15);

        boolean equals = person.equals(person1);
        System.out.println("equals = " + equals);


    }
}
