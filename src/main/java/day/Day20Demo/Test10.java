package day.Day20Demo;

import java.io.*;

/**
 * @ClassName Test10
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/7 19:39
 * @Version 1.0
 **/
public class Test10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        readObj();
    }

    /**
     * @throws IOException
     * ObjectOutputStream对象序列化
     */
    public static void writeObj() throws IOException {

        FileOutputStream fos = new FileOutputStream("person.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person person = new Person("张三", 18);
        oos.writeObject(person);
        oos.close();
    }

    public static void readObj() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Object readObject = ois.readObject();
        System.out.println(readObject);
        ois.close();
    }
}
