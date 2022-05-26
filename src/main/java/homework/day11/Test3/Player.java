package homework.day11.Test3;

/**
 * @ClassName layer
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 18:54
 * @Version 1.0
 **/
public class Player {
    public Player(String next) {

    }

    public FightAble select(String str){
        if ("法力角色".equals(str)) {

            return new Mage();
        }else if ("武力角色".equals(str)) {

            return new Soldier();
        }
        return null;
    }
}
