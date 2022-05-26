package homework.day7;

/**
 * @ClassName Day07Work7
 * @Description //
 * 描述：猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了快一半，
 * 还不过瘾，又多吃了一个。第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。
 * 以后每天都吃了前一天剩下的一半多一个。到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？
 * @Author crazy402
 * @Date 2022/5/19 11:27
 * @Version 1.0
 **/
public class Day07Work7 {
    public static void main(String[] args) {
        int monkey = Monkey(1);
        System.out.println(monkey);

    }

    public static int Monkey(int n) {

        if (n == 10) {
            return 1;
        }else {
            return (Monkey(n+1)+1)*2;
        }
    }
}
