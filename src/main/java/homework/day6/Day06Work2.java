package homework.day6;

/**
 * @ClassName Day06Work2
 * @Description //案例：
 *
 * ​	声明一个日期类MyDate，包含属性：年、月、日
 *
 * ​	声明一个Test02测试类，并在main方法中，创建3个日期对象，
 * 一个是你的出生日期，一个是来尚硅谷的日期，一个是毕业的日期，并打印显示
 * @Author crazy402
 * @Date 2022/5/17 16:47
 * @Version 1.0
 **/
public class Day06Work2 {
    public static void main(String[] args) {
        MyDate birthday = new MyDate();
        MyDate starDate = new MyDate();
        MyDate endDate = new MyDate();

        birthday.year = 1997;
        birthday.month = 3;
        birthday.day =15;

        starDate.year = 2022;
        starDate.month = 5;
        starDate.day = 9;

        endDate.year = 2022;
        endDate.month = 11;
        endDate.day = 9;

        System.out.println("出生日期: "+birthday.year+"."+birthday.month+"."+birthday.day);
        System.out.println("来尚硅谷的日期: "+starDate.year+"."+starDate.month+"."+starDate.day);
        System.out.println("毕业的日期: "+endDate.year+"."+endDate.month+"."+endDate.day);
    }
}
