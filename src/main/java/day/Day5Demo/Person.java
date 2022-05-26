package day.Day5Demo;

/**
 * @ClassName Person
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/16 19:35
 * @Version 1.0
 **/
public class Person {
    String name;
    char gender;
    Dog dog;

    public Person() {
    }

    void feed() {
        dog.eat();
    }

    public Person(String name, char gender, Dog dog) {
        this.name = name;
        this.gender = gender;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dog=" + dog +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public Dog getDog() {
        return dog;
    }
}
