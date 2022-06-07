package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName Test4
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/6 20:51
 * @Version 1.0
 **/
public class Test4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        /*绍兴市
	温州市
	湖州市
	嘉兴市
	台州市
	金华市
	舟山市
	衢州市
	丽水市

海南省
	海口市
	三亚市
北京市
	北京市
	*/
        list.add("绍兴市");
        list.add("温州市");
        list.add("湖州市");
        list.add("嘉兴市");
        list.add("台州市");
        list.add("金华市");
        list.add("舟山市");
        list.add("衢州市");
        list.add("丽水市");
        map.put("浙江", list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("海口市");
        list1.add("三亚市");
        map.put("海南省", list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("北京市");
        map.put("北京市", list2);

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s + "..." + map.get(s));
        }


    }
}
