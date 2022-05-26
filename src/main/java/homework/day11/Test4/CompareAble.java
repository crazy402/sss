package homework.day11.Test4;

/**
 * @author crazy402
 */
public interface CompareAble {
    default void compare(Apple a1, Apple a2) {
        System.out.println("默认挑大的: ");
        if (a1.getSize() > a2.getSize()) {
            System.out.println(a1);
        }else {
            System.out.println(a2);
        }
    }

}
