package homework.day10;

/**
 * @ClassName Ttest4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/24 18:28
 * @Version 1.0
 **/
public class Test4 {
    static int i = 0;
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test(){
        try{
            return ++i;
        }finally{
            return ++i;
        }
    }
}
