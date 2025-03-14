package com.Study9.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * ClassName Test1
 *
 * @Date2025/3/917:26
 * @Create bysunlight
 */
public class Test1 {

    /**
     * 统计集合人数：
     *      某个班级80名学生，提供了四个景点依次是A、B、C、D。每个学生只能选择一个景点，统计哪个景点人数最多
     *
     */




    public static void main(String[] args) {
        String[] values  = {"A","B","C","d"};
        Map<String,Integer> numCount  = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(values.length);
            String view = values[index];
            if (!numCount.containsKey(view))
            {
                numCount.put(view,1);
            }else {
                int value = numCount.get(view);
                numCount.put(view,value+1);
            }
        }

        int maxCount = 0;
        String viewName = "";
        // 输出每个元素及其出现的次数
        for (Map.Entry<String, Integer> entry : numCount.entrySet()) {
            int count = entry.getValue();
            String view = entry.getKey();
            if (count > maxCount)
            {
                maxCount = count;
                viewName = view;
            }
            System.out.println(entry.getKey() + " 出现的次数: " + entry.getValue());
        }
        System.out.println(viewName + " 出现的次数最多，为: " + maxCount);
    }
}
