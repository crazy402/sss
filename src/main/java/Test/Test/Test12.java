package Test.Test;

import java.util.Scanner;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/9 14:32
 * @description //
 * 12、补充如下枚举类型的代码，使得如下代码达到运行效果
 * 单词提示：monday,tuesday,wednesday,thursday,friday,saturday,sunday
 **/
public class Test12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("今天是星期几(1-7)：");
        //假设输入的是2
        int number = input.nextInt();
        Week w = Week.getByNumber(number);
        //今天是：TUESDAY(2,星期二)
        System.out.println("今天是：" + w);
    }

    enum Week {

        /**
         * @author crazy402
         * @param
         * @return
         */

        MONDAY(1, "星期一"),
        TUESDAY(2, "星期二"),
        WEDNESDAY(3, "星期三"),
        THURSDAY(4, "星期四"),
        FRIDAY(5, "星期五"),
        SATURDAY(6, "星期六"),
        SUNDAY(7, "星期日");


        private int number;
        private String decription;

        private Week(int number, String decription) {
            this.number = number;
            this.decription = decription;
        }

        /**
         *
         *
         * @param number
         * @return
         * @author crazy402
         */

        public static Week getByNumber(int number) {
            switch (number) {
                case 1:
                    return MONDAY;
                case 2:
                    return TUESDAY;
                case 3:
                    return WEDNESDAY;
                case 4:
                    return THURSDAY;
                case 5:
                    return FRIDAY;
                case 6:
                    return SATURDAY;
                case 7:
                    return SUNDAY;
                default:
                    return null;
            }
        }

        @Override
        public String toString() {
            return super.toString() + "(" + number + "," + decription + ")";
        }
    }

}


