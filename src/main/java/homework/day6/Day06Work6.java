package homework.day6;

/**
 * @ClassName Day06Work6
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/17 19:27
 * @Version 1.0
 **/
public class Day06Work6 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "张三";
        person.age = 18;
        System.out.println(person.name +" " + person.age);
        person.eat();

        Animal animal = new Animal();
        animal.name = "狗";
        animal.age = 2;
        System.out.println(animal.name + " " + animal.age);
        animal.eat();

        Iphone iphone = new Iphone();
        iphone.brand = "华为";
        iphone.price = 5000;
        System.out.println(iphone.brand + "  " + iphone.price);
        iphone.call();

    }
}
