package demo;

import java.util.Arrays;

/**
 * @ClassName Demo04ObjectArray
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/18 14:19
 * @Version 1.0
 **/
public class Demo04ObjectArray {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.name = "张三";
        person2.name = "李四";
        person3.name = "王五";

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        for (int i = 0; i < people.length; i++) {
            System.out.println("people[i].name = " + people[i].name);
        }


    }
}
