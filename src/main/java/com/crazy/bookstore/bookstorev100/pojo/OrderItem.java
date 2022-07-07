package com.crazy.bookstore.bookstorev100.pojo;

import lombok.Data;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/7/6 19:35
 * @description //
 **/
@Data
public class OrderItem {
    /**
     * CREATE TABLE t_order_item(
     * 	item_id INT PRIMARY KEY AUTO_INCREMENT,
     * 	book_name VARCHAR(20),
     * 	price DOUBLE,
     * 	img_path VARCHAR(50),
     * 	item_count INT,
     * 	item_amount DOUBLE,
     * 	order_id VARCHAR(20)
     * );
     */
    private Integer itemId;
    private String bookName;
    private Double price;
    private String imgPath;
    private Integer itemCount;
    private Double itemAmount;
    private Integer orderId;
}
