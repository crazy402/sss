package day.Day17Demo;

/**
 * @ClassName Test1
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/1 10:40
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("张三");
        list.add(123);

        System.out.println(list);

        MyArrayList1<String> arrayList1 = new MyArrayList1<>();
        arrayList1.add("123");

    }
}
