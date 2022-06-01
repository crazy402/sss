package day.Day17Demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Person
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 9:31
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person implements Comparable<Person> {

    private String name;
    private Integer age;


    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }


}
