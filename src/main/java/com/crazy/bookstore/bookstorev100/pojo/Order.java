package com.crazy.bookstore.bookstorev100.pojo;

import lombok.Data;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/7/6 19:25
 * @description //
 **/
@Data
public class Order {
    /**
     * order_id INT PRIMARY KEY AUTO_INCREMENT,
     * 	order_sequence VARCHAR(200),
     * 	create_time VARCHAR(100),
     * 	total_count INT,
     * 	total_amount DOUBLE,
     * 	order_status INT,
     * 	user_id INT
     */
    /**
     * 订单id
     */
    private Integer orderId;
    /**
     * 订单号
     */
    private String orderSequence;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 数量
     */
    private Integer totalCount;
    /**
     * 订单金额
     */
    private Double totalAmount;
    /**
     * 订单状态
     */
    private Integer orderStatus;
    /**
     * 订单用户
     */
    private Integer userId;
}
