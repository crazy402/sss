package homework.day11;

/**
 * @ClassName Test1
 * @Description //
 * 请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
 * 例如："abcba"、"上海自来水来自海上"均为对称字符串。
 * @Author crazy402
 * @Date 2022/5/25 18:31
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        String qwq = new String("qwq");
        huiWenShu(qwq);
    }

    public static Boolean huiWenShu(String s) {
        if (s == null) {
            System.out.println("当前数据为空");
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(s);

        if (s.equals(stringBuilder.reverse().toString())) {
            System.out.println("s是回文数");
            return true;
        }else {
            System.out.println("s不是回文数");
            return false;
        }

    }
}
