package homework.day10;

/**
 * @ClassName Test3
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/5/24 18:24
 * @Version 1.0
 **/
public class Test3 {
    {
        System.out.println("a");
    }
    static{
        System.out.println("b");
    }
    Test3(){
        System.out.println("c");
    }
    public static String getOut(){
        try{
            return "1";
        }catch(Exception e){
            return "2";
        }finally{
            return "3";
        }
    }
    public static void main(String[] args) {
        System.out.println(getOut());
    }
}
