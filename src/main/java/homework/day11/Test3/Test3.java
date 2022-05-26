package homework.day11.Test3;

import java.util.Scanner;

/**
 * @ClassName Test3
 * @Description //* 模拟玩家选择角色。
 * * 定义接口FightAble：
 *     * 抽象方法：specialFight。
 *     * 默认方法：commonFight,方法中打印"普通打击"。
 * * 定义战士类：
 *     * 实现FightAble接口,重写方法中打印"武器攻击"。
 * * 定义法师类Mage：
 *     * 实现FightAble接口,重写方法中打印"法术攻击"。
 * * 定义玩家类Player：
 *     * 静态方法：FightAble select(String str)，根据指令选择角色。
 *         * 法力角色，选择法师。
 *         * 武力角色，选择战士
 * @Author crazy402
 * @Date 2022/5/25 18:49
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("选择: ");
        String next = scanner.next();

        Player player = new Player(next);

        player.select(next).specialFight();
        player.select(next).commonFight();

    }
}
