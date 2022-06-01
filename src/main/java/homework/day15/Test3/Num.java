package homework.day15.Test3;

/**
 * @ClassName Num
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 19:12
 * @Version 1.0
 **/
public class Num {
    int i ;
    boolean flag = true;

    public Num() {
    }

    public Num(int i, boolean flag) {
        this.i = i;
        this.flag = flag;
    }

    public int getI() {
        return i;
    }

    public void setI() {
        i++;
        System.out.println(i);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
