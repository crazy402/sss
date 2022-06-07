package homework.day17;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName product
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 19:31
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private Integer count;
}
