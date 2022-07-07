package com.crazy.bookstore.bookstorev100.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/7/4 18:42
 * @description //
 **/
@Data
public class CartItem {
    private Book book;//包含图书对象
    private Integer count = 0;//购买数量
    private Double subPrice = 0D;//小计金额
    public CartItem(){}
    public CartItem(Book book, Integer count, Double subPrice) {
        this.book = book;
        this.count = count;
        this.subPrice = subPrice;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 返回小计金额
     * 小计金额 = 商品单价 * 购买数量
     */
    public Double getSubPrice() {
        BigDecimal countBigDecimal = new BigDecimal(count + "");
        BigDecimal priceBigDecimal = new BigDecimal(book.getPrice() + "");
        subPrice = countBigDecimal.multiply(priceBigDecimal).doubleValue();
        return subPrice;
    }

    /*public void setSubPrice(Double subPrice) {
        this.subPrice = subPrice;
    }*/

    @Override
    public String toString() {
        return "CartItem{" +
                "book=" + book +
                ", count=" + count +
                ", subPrice=" + subPrice +
                '}';
    }

    /**
     * 将count自增1
     */
    public void countIncrease(){
        this.count ++;
    }

    /**
     * 将当前购物项的数量进行 -1
     */
    public void countDecrease(){
        if (this.count > 0) {
            this.count --;
        }
    }
}
