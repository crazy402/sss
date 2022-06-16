package Test2;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/13 18:22
 * @description //
 **/
public class Test1 {
    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "2";
        String str3 = new String("1");
        final String str4 = "2";
        final String str5 = new String("2");
        String str6 = "12";

        String str7 = "1" + "2";
        String str8 = str1 + "2";
        String str9 = str1 + str2;
        String str10 = str3 + str4;
        String str11 = "1" + str4;
        String str12 = "1" + str5;
        String str13 = (str1 + str2).intern();

        System.out.println("(1)" + (str1 == str3));//false
        System.out.println("(2)" + (str2 == str4));//true
        System.out.println("(3)" + (str4 == str5));//false
        System.out.println("(4)" + (str6 == str7));//true
        System.out.println("(5)" + (str6 == str8));//false
        System.out.println("(6)" + (str6 == str9));//false
        System.out.println("(7)" + (str6 == str10));//false
        System.out.println("(8)" + (str6 == str11));//true
        System.out.println("(9)" + (str6 == str12));//false
        System.out.println("(10)" + (str6 == str13));//true

    }
}