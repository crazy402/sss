package homework.day17;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 18:18
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student>{
    private String name;
    private Integer score;

    @Override
    public int compareTo(Student o) {
        return this.score - o.score ;
    }
}
