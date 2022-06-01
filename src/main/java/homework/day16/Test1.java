package homework.day16;


import java.util.Arrays;


/**
 * @ClassName Test1
 * @Description //
 * 有一个数组a[1000]存放0-999，要求每隔二个数删掉一个数，到末尾时循环至开头，
 * 继续运行。求最后一个被删掉的数的原始下标位置。
 * <p>
 * 以8个数为例：
 * <p>
 * {0,1,2,3,4,5,6,7}：0->1->2（删掉）->3->4->5（删掉）->6->7->0（删掉）。。。
 * @Author crazy402
 * @Date 2022/5/31 18:14
 * @Version 1.0
 * 0,1,2,3,4,5,6,7
 * 0,1,-1,3,4,-1,6,7
 * -1,1,-1,3,-1,-1,6,7
 * -1,-1,-1,3,-1,-1,6-
 **/
public class Test1 {
    public static void main(String[] args) {


        int i = 0;
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int count = 0;
        int delNum = 0;


        while (true) {
            if (arr[i] != -1) {
                count++;
            }
            if (count == 3) {
                arr[i] = -1;
                count = 0;
                delNum++;
                System.out.println(Arrays.toString(arr));
            }

            if (delNum == arr.length - 1) {

                break;
            }


            if(++i==arr.length) {//如果下标右移已经到头了，要从头开始
                i=0;

            }


        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=-1) {
                System.out.println("最后一个被删掉的数是：a[j]=" + arr[j] + "，它的下标：" + j);
            }
        }

    }


}
