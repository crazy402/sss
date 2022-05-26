package homework.day6;

/**
 * @ClassName Day06Work3
 * @Description //声明公民类Citizen，包含属性：姓名，生日，身份证号，其中姓名是String类型，
 * 生日是MyDate类型，身份证号也是String类型。
 *
 * ​	声明Test03测试类，在main方法中创建你们家庭成员的几个对象，并打印信息
 * @Author crazy402
 * @Date 2022/5/17 18:05
 * @Version 1.0
 **/
public class Day06Work3 {
    public static void main(String[] args) {
        Citizen father = new Citizen();
        Citizen mother = new Citizen();
        Citizen son = new Citizen();


        father.name = "张三";
        father.birthday.year =2000;
        father.birthday.month =6;
        father.birthday.day =6;
        father.idCard = "123";
        String date = father.birthday.year+"."+father.birthday.month+"."+father.birthday.day;
        System.out.println(date);

        mother.name = "李四";
        mother.birthday.year =2000;
        mother.birthday.month =6;
        mother.birthday.day =6;
        mother.idCard = "123";

        son.name = "王二麻子";
        son.birthday.year =2000;
        son.birthday.month =6;
        son.birthday.day =6;
        son.idCard = "123";

        System.out.println("父亲姓名: "+ father.name + "父亲的生日: "+ date +"身份证: "+father.idCard);
        System.out.println("母亲姓名: "+ father.name + "母亲的生日: "+ date +"身份证: "+father.idCard);
        System.out.println("儿子姓名: "+ father.name + "儿子的生日: "+ date +"身份证: "+father.idCard);



    }
}
