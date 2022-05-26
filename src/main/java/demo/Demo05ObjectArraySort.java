package demo;

/**
 * @ClassName Demo05ObjectArraySort
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/18 14:39
 * @Version 1.0
 **/
public class Demo05ObjectArraySort {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.name = "张三";
        person1.age = 18;
        person2.name = "李四";
        person2.age = 13;
        person3.name = "王五";
        person3.age = 19;



        people[0] = person1;
        people[1] = person2;
        people[2] = person3;



        for (int j = 0; j < people.length - 1; j++) {
            for (int i = 0; i < people.length - 1 - j; i++) {
                Person temp = new Person();
                if (people[i].age > people[i + 1].age) {
                    temp = people[i];
                    people[i] = people[i+1];
                    people[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].name+" " + people[i].age);
        }



    }
}
