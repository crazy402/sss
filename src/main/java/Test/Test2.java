package Test;

/**
 * @ClassName Test2
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/6 20:26
 * @Version 1.0
 **/
public class Test2 {
    int a;
    int b;
    public void f(){
        a = 0;
        b = 0;
        int[] c = {0};
        g(b,c);
        System.out.println(a + " " + b + " " + c[0]);
    }
    public void g(int b, int[] c){
        a = 1;
        b = 1;
        c[0] = 1;
    }
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.f();
    }
}
