package day.Day12Demo;

import java.util.Scanner;

/**
 * @ClassName Test2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 11:22
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        String username = "root";
        String password = "123";

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            String pwd = scanner.next();
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                return ;
            } else {
                if (i == 2) {
                    System.out.println("账号冻结");
                }else {
                    System.out.println("登录失败");
                }
            }

        }
    }

}
