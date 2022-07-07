package com.crazy.bookstore.bookstorev100.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/7/4 18:42
 * @description //
 **/
@Data
public class Cart {
    //包含的购物项，键是图书编号id，值是购物项对象
    private Map<Integer, CartItem> cartItemMap = new HashMap<>();
    //商品总数量
    private Integer totalCount = 0;
    //购物车总金额
    private Double  totalAmount = 0D;
    /**
     *  updateCartItemCount
     *  手动更新购买数量
     *  总金额的修改公式:
     *    (修改后的数量-原有数据*单价)
     */
    public void updateCartItemCount(Integer bookId,Integer count){
        //图书id，取出购物项
        CartItem cartItem = cartItemMap.get(bookId);

        //总金额计算
        BigDecimal countBigDecimal = new BigDecimal((count - cartItem.getCount()) + "");
        BigDecimal totalBigDecimal = new BigDecimal(totalAmount + "");
        BigDecimal priceBigDecimal = new BigDecimal(cartItem.getBook().getPrice() + "");

        //totalBigDecimal.add(countBigDecimal.multiply(priceBigDecimal)).doubleValue();
        totalAmount = totalBigDecimal.add(countBigDecimal.multiply(priceBigDecimal)).doubleValue();
        // totalAmount += (count - cartItem.getCount()) * cartItem.getBook().getPrice();
        //修改购买的数量
        cartItem.setCount(count);
    }

    /**
     * cartItemCountIncrease
     * 购物车中商品数量 ++
     * 从新计算商品总价格
     */
    public void cartItemCountIncrease(Integer bookId){
        CartItem cartItem = cartItemMap.get(bookId);
        cartItem.countIncrease();
        //计算总金额 = 原有的总金额 = 被加数数量图书的单价
        BigDecimal totalBigDecimal = new BigDecimal(totalAmount + "");
        BigDecimal priceBigDecimal = new BigDecimal(cartItem.getBook().getPrice() + "");
        totalAmount = totalBigDecimal.add(priceBigDecimal).doubleValue();
    }

    /**
     * cartItemCountDecrease
     * 购物车中商品数量 --
     * 从新计算商品总价格
     * 如果要删除的商品，在购物项里，只有一个数量，直接删除购物项
     */
    public void cartItemCountDecrease(Integer bookId){
        //取出集合的值，购物项
        CartItem cartItem = cartItemMap.get(bookId);
        //判断购买数量是不是1
        if (cartItem.getCount() == 1){
            //购物项集合中，移除
            cartItemMap.remove(bookId);
        }else {
            //购买数量大于1，购买数量--
            cartItem.countDecrease();
        }
        //计算总金额 = 原有的总金额 = 被减数数量图书的单价
        BigDecimal totalBigDecimal = new BigDecimal(totalAmount + "");
        BigDecimal priceBigDecimal = new BigDecimal(cartItem.getBook().getPrice() + "");

        totalAmount = totalBigDecimal.subtract(priceBigDecimal).doubleValue();
    }

    /**
     * removeCartItem
     * 移除购物车中的购物项，接收参数 bookId
     * 1: 移除购物车中的购物项，删除Map集合中的元素
     * 2：计算总金额
     */
    public void removeCartItem(Integer bookId){
        //保留，被删除之间的购物项，目的计算总金额
        //CartItem cartItem = cartItemMap.get(bookId);

        //1: 移除购物车中的购物项，删除Map集合中的元素
        //remove方法，移除并返回，被删除之间的值
        CartItem cartItem = cartItemMap.remove(bookId);
        //2：计算总金额  -= 被删除的购物项中的小计金额
        BigDecimal totalBigDecimal = new BigDecimal(totalAmount + "");
        BigDecimal priceBigDecimal = new BigDecimal(cartItem.getSubPrice() + "");
        totalAmount = totalBigDecimal.subtract(priceBigDecimal).doubleValue();
    }

    /**
     * getCount()
     * 返回购物车中的商品数量
     * 购物项对象CartItem，存储Map集合
     * CartItem对象的购买数量
     */
    public Integer getCount(){
        totalCount=0;
        //取出Map集合的值CartItem购物项对象，CartItem中的购买数量
        Collection<CartItem> coll =  cartItemMap.values();
        for (CartItem cartItem : coll){
            //取出购物项中的购买数量
            //购物车中的总数量求和
            totalCount += cartItem.getCount();
        }
        return totalCount;
    }

    /**
     * 购物车对象，实现添加购物车功能
     * 传递图书对象
     * 添加购物车：就是在购物车对象中Cart，添加购物项对象CartItem
     * 物项对象CartItem：图书，购买数量，单价
     * 实现步骤：
     *   1: 取出图书id，Map集合的键
     *   2：键找到Map集合的值 （购物项）
     *   3: 判断：购物项不存在
     *    3.1: 购物项不存在：这本书没有加过
     *    3.2：存储购物项数据
     *    3.3： 购物项添加到购物车的Map集合中
     *
     *  4： 判断：购物项存在
     *    4.1 原有的购物项的购买数量上++
     *  5：计算购物车的总金额
     */
    public void addCart(Book book){
        //1: 取出图书id，Map集合的键
        Integer bookId = book.getBookId();
        // 2：键找到Map集合的值 （购物项）
        CartItem cartItem = cartItemMap.get(bookId);
        //3: 判断：购物项不存在
        if (cartItem == null){
            //创建购物项对象
            cartItem = new CartItem();
            //存储数据，图书对象
            cartItem.setBook(book);
            //存储购买数量
            cartItem.setCount(1);
            //购物项对象，存储Map集合，键是图书id，值购物项
            cartItemMap.put(bookId,cartItem);
        }
        //4： 判断：购物项存在
        else {
            cartItem.countIncrease();//购买数量++
        }
        //5：计算购物车的总金额 = 原有的总金额 + 商品单价
        BigDecimal totalBigDecimal = new BigDecimal(totalAmount + "");
        BigDecimal priceBigDecimal = new BigDecimal(book.getPrice() + "");

        totalAmount = totalBigDecimal.add(priceBigDecimal).doubleValue();
    }


    public Cart(){}
    public Cart(Map<Integer, CartItem> cartItemMap, Integer totalCount, Double totalAmount) {
        this.cartItemMap = cartItemMap;
        this.totalCount = totalCount;
        this.totalAmount = totalAmount;
    }

    public Map<Integer, CartItem> getCartItemMap() {
        return cartItemMap;
    }

    public void setCartItemMap(Map<Integer, CartItem> cartItemMap) {
        this.cartItemMap = cartItemMap;
    }


    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartItemMap=" + cartItemMap +
                ", totalCount=" + totalCount +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
