package homework.day2;

/**
 * @ClassName Day02Work4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/11 18:37
 * @Version 1.0
 **/
public class Day02Work4 {
    public static void main(String[] args) {
        int hour = 89;
        int day = hour / 24;
        int otherHour = hour % 24;

        System.out.println("为抵抗洪水, 战士连续作战89小时:" + hour + "是" + day +"天" +otherHour+"小时");
    }

}
