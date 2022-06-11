package day.Day20Demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName Person
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/7 19:41
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person implements Serializable {
    static final long serialVersionUID = 42L;

    private String name;
    private Integer age;


    public Person(String s, int i) {
    }
}
