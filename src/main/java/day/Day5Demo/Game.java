package day.Day5Demo;

/**
 * @ClassName Game
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/16 19:39
 * @Version 1.0
 **/
public class Game {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "张三";
        person.gender = '男';
        Dog dog = new Dog();

        Animal animal = new Animal();
        animal.eat();

        dog.type = "中华田园犬";
        dog.nikeName = "小黄";


//        System.out.println("person = " + person);
//        System.out.println("dog = " + dog);
    }
}
