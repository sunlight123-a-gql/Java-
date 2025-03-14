package com.Study9;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName Study9_2
 *
 * @Date2025/3/611:03
 * @Create bysunlight
 */
public class Study9_2 {

    /**
     * Arrays:操作数组的工具类
     *
     * Arrays.sort 底层原理：
     *      1.利用插入排序 + 二分查找的方式进行排序
     *      2.默认把0索引当成有序的序列，1索引到最后当成无序的序列
     *      3.遍历无序的序列得到里面的每一个元素，假设当前遍历得到的元素是A元素
     *      4.把A往有序序列当中进行插入，在插入的时候，是利用二分查找的方式确定A元素的插入点
     *      5.拿着A元素，跟插入点的元素 进行比较，比较的规则就是使用compare方法的方法体
     *
     *
     *      compare方法的形式参数：
     *      O1:表示在无序序列当中，遍历得到的每一个元素
     *      O2：表示在有序序列当中的元素
     *
     *
     *      o2-o1:降序
     *      o1-o2:升序
     *
     *      返回值：
     *          负数：表示当前要插入的元素是小的，放在前面
     *          整数：表示当前要插入的元素是大的，放后面
     *          0：表示当前要插入的元素跟现在的元素比是一样的，放在后面
     *
     *
     * Lambda表达式：
     *  Lambda表达式可以用来简化匿名内部类的书写
     *  Lambda表达式只能简化函数式接口的匿名内部类的写法
     *          函数式接口：有且仅有一个抽象方法的接口，接口上方可以加@FunctionalInterface注解
     *
     *  Lambda省略写法：
     *      1.参数类型可以省略不写
     *      2.如果只有一个参数，参数类型可以省略，同时()也可以省略
     *      3.如果Lambda表达式的方法体只有一行，大括号、分号，return可以省略不写，需要同时省略
     *
     *
     *
     */
    public static void main(String[] args) {
        /*Integer[] arr  = {5,99,32,452,100,8,36,55,26};
        String[] arrs = {"a","aaa","aaaaa","aa"};
        *//*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });*//*
        Arrays.sort(arr, (Integer integer, Integer t1) ->t1 - integer);
        Arrays.sort(arrs,(String s, String t1) ->s.length() - t1.length());
        System.out.println(Arrays.toString(arrs));*/
        System.out.println(getCount(20));
    }


    /**
     *
     */
    public static int getCount(int n) {
       /* if (n == 10)
        {
            return 1;
        }else {
           return (getCount(n+1) + 1) *2;
        }*/
        if (n == 1) {
            return 1;
        }
        if (n == 2)
        {
            return 2;
        }
        if (n == 3)
        {
            return 4;
        }
        return getCount(n-1) + getCount(n -2) + getCount(n - 3);
    }

}
