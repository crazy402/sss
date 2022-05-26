package demo;

/**
 * @ClassName Demo01Statc
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/18 9:22
 * @Version 1.0
 **/
public class Demo01Static {
    public static void main(String[] args) {
        Person.classRoom = "三年二班";
        Person person = new Person();
        Person person1 = new Person();

        person.name = "张三";
        person.age = 13;
        System.out.println(person.name+" "+person.age+" "+Person.classRoom);

        person1.name = "李四";
        person1.age = 13;
        System.out.println(person1.name+" "+person1.age+" "+Person.classRoom);

    }
}
