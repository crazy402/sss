package homework.day17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName Test5
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 19:31
 * @Version 1.0
 **/
public class Test5 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        /*products.add(new Product("小浣熊",0));
        products.add(new Product("香蕉",0));
        products.add(new Product("口香糖",0));
        products.add(new Product("蟹黄",0));
        products.add(new Product("苹果",0));*/


        products.add(new Product("1",0));
        products.add(new Product("2",0));
        products.add(new Product("3",0));
        products.add(new Product("4",0));
        products.add(new Product("5",0));

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            if (next.equals("end")) {
                break;
            }else {
                for (Product product : products) {
                  if (product.getName().equals(next)) {
                      int i = product.getCount();
                      product.setCount(++i);

                  }
                }
            }
        }

        for (Product product : products) {
            System.out.println(product);
        }
        //System.out.println(products);
    }
}
