package day.Day12Demo;

/**
 * @ClassName Test5
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/25 15:26
 * @Version 1.0
 **/
public class Test5 {
    public static void main(String[] args) {
        String s = " abc defg ";
        System.out.println("s.contains(\"g\") = " + s.contains("g"));

        System.out.println("s.endsWith(\"g\") = " + s.endsWith("g"));

        System.out.println("s.startsWith(\"a\") = " + s.startsWith("a"));

      //  System.out.println("s.replace(\"a\",\"c\") = " + s.replace("a", "c"));
        System.out.println("s.toUpperCase() = " + s.toUpperCase());

        System.out.println("s.toLowerCase() = " + s.toLowerCase());

        System.out.println("s.trim() = " + s.trim());
    }
}
