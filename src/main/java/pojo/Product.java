package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/15 15:15
 * @description //
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer pid;
    private String pname;
    private Double price;
    private Integer num;
    private Integer cid;
}
