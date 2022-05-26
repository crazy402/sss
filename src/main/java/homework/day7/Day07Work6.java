package homework.day7;

/**
 * @ClassName Day07Work6
 * @Description //
 * 用递归实现不死神兔：故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
 *
 * 在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
 *
 * 再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，
 *
 * 问：现有一对刚出生的兔子2年后(24个月)会有多少对兔子?
 * @Author crazy402
 * @Date 2022/5/19 11:24
 * @Version 1.0
 **/
public class Day07Work6 {
    public static void main(String[] args) {
        int rabbit = Rabbit(24);
        System.out.println("rabbit = " + rabbit);

    }

    public static int Rabbit(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else {
            return Rabbit(n-1)+Rabbit(n-2);
        }

    }
}
