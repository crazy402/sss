package day.Day15Demo;

/**
 * @ClassName BaoZiPu
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/30 10:42
 * @Version 1.0
 **/
public class BaoZiPu {
    /**
     * 包子数量
     */
    private int count;
    /**
     * 是否有包子
     */
    private Boolean flag = true;

    public int getCount() {
        System.out.println("消费了"+count+"的包子");
        return count;
    }

    public void setCount() {

        count++;
        System.out.println("生产了"+count+"的包子");
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public BaoZiPu() {
    }

    public BaoZiPu(int count, Boolean flag) {
        this.count = count;
        this.flag = flag;
    }
}
