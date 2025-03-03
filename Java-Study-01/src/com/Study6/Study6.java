package com.Study6;

import java.util.ArrayList;

/**
 * ClassName Study6
 *
 * @Date2025/2/2715:05
 * @Create bysunlight
 */
public class Study6 {

    /**
     * ArrayList:
     *
     *
     *
     * 集合和数组的区别：
     *      1.长度：
     *          1).数组长度固定
     *          2).集合长度可变
     *      2.存储类型：
     *          1)，数组可以存储基本数据类型和引用数据类型
     *          2).集合可以存储引用数据类型，如果需要存储基本数据类型，需要将其转换成包装类
     *
     */
    public static void main(String[] args) {
        //ArrayList();
        NumFor();
    }


    public static void ArrayList()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        System.out.println(list);
        list.remove("aaa");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(1,"zzz");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }

    public static void NumFor()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
           if (list.size() - 1 == i)
           {
               System.out.print(list.get(i));
           }else {
               System.out.print(list.get(i) + ",");
           }
        }
        System.out.print("]");
    }

}
