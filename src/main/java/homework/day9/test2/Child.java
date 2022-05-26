package homework.day9.test2;

/**
 * @ClassName Child
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/23 18:22
 * @Version 1.0
 **/
public class Child extends People {
    People father;

    public Child(String name) {
        System.out.println("3");
        father = new People(name+ "F");


    }
    public Child() {
        System.out.println("4");
    }
}
