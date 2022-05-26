package homework.day7;

/**
 * @ClassName GraphicTools
 * @Description //1、void printRectangle()：该方法打印5行5列*矩形
 *  *
 *  * 2、void printRectangle(int line, int column, String sign)：
 *      该方法打印line行colomn列由sign组成的矩形
 *  *
 *  * 3、double getTriangleArea(double base, double height)：根据底边和底边对应的高求三角形面积
 *  *
 *  * 4、double getTriangleArea(double a, double b, double c)：根据三角形的三条边求三角形面积，
 *    如果a,b,c不能组成三角形，打印不能组成三角形，并返回0.0
 *  *
 * @Author crazy402
 * @Date 2022/5/18 20:44
 * @Version 1.0
 **/
public class GraphicTools {
    public void printRectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void printRectangle(int line, int column, String sign) {
        for (int i = 0; i < line; i++) {
            for (int i1 = 0; i1 < column; i1++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public double getTriangleArea(double base, double height) {
        return base*height/2;
    }

    public double getTriangleArea(double a, double b, double c) {
        if(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c >a){
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }else{
            System.out.println(a +"," + b +"," + c + "不能构成三角形");
            return 0;
        }
    }


}
