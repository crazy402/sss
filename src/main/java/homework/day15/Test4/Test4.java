package homework.day15.Test4;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 21:10
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Husband husband = new Husband(bank);
        Wife wife = new Wife(bank);

        new Thread(husband).start();
        new Thread(wife).start();
    }
}
