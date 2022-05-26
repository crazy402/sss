package homework.day11.Test3;

/**
 *
 * @author crazy402
 */
public interface FightAble {
    void specialFight();

    default void commonFight() {
        System.out.println("普通打击");
    }
}
