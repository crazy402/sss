package homework.day7;

/**
 * @ClassName Day07Work2
 * @Description //
 * 知识点：方法的声明与调用、方法的重载
 *
 * 案例：
 *
 * ​	声明一个图形工具类GraphicTools，包含如下方法：
 *
 * 1、void printRectangle()：该方法打印5行5列*矩形
 *
 * 2、void printRectangle(int line, int column, String sign)：该方法打印line行colomn列由sign组成的矩形
 *
 * 3、double getTriangleArea(double base, double height)：根据底边和底边对应的高求三角形面积
 *
 * 4、double getTriangleArea(double a, double b, double c)：根据三角形的三条边求三角形面积，如果a,b,c不能组成三角形，打印不能组成三角形，并返回0.0
 *
 * ​	声明Test02测试类，并在main方法中调用测试
 * @Author crazy402
 * @Date 2022/5/18 20:43
 * @Version 1.0
 **/
public class Day07Work2 {
    public static void main(String[] args) {
        GraphicTools graphicTools = new GraphicTools();
       // graphicTools.printRectangle();
       // graphicTools.printRectangle(4,3,"_");

//        double triangleArea = graphicTools.getTriangleArea(2.0, 3.0);
//        System.out.println("triangleArea = " + triangleArea);


    }
}
