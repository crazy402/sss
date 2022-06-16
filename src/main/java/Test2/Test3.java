package Test2;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/13 18:50
 * @description //3.	用100元钱买100支笔，其中钢笔3元/支，圆珠笔2元/支，
 * 铅笔0.5元/支，问钢笔、圆珠笔和铅笔可以各买多少支？请写main方法打印需要买的数目
 **/
public class Test3 {
    public static void main(String[] args) {

        double money = 100;
        double pPen = 3;
        double yPen = 2;
        double qPen = 0.5;

        int count = 100;

        for (int pen = 1; pen <= money / pPen; pen++) {
            for (int yuan = 1; yuan <= money / yPen; yuan++) {
                for (int qian = 1; qian <= money / qPen; qian++) {
                    if (pen + yuan + qian == count && pen * pPen + yuan * yPen + qian * qPen == money) {
                        System.out.println("购买" + pen + "支钢笔，" + yuan + "支圆珠笔，" + qian + "支铅笔");
                    }
                }
            }
        }

    }
}
