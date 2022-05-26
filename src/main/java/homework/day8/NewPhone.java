package homework.day8;

/**
 * @ClassName NewPhone
 * @Description //
 * @Author crazy402
 * @Date 2022/5/20 18:16
 * @Version 1.0
 **/
public class NewPhone extends OldPhone{
    public void playGame() {
        System.out.println("打游戏");
    }
    @Override
    public void show() {
        System.out.println("显示手机号, 显示归属地, 显示头像");
    }
}
