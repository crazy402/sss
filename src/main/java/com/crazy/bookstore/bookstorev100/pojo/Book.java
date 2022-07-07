package com.crazy.bookstore.bookstorev100.pojo;

import lombok.Data;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/30 19:55
 * @description //
 **/
@Data
public class Book {
    /**
     * id
     */
    private Integer bookId;
    /**
    书籍名称
     */
    private String bookName;
    /**
     * 作者
     */
    private String author;
    /**
        书籍价格
     */
    private Double price;
    /**
        书籍销售量
     */
    private Integer sales;
    /**
    库存
     */
    private Integer stock;
    /**
    图片
     */
    private String imgPath;

    public void saveBook(Book book) {
    }
}
