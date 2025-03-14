package com.Study9;

import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Consumer;

/**
 * ClassName Study9_7
 *
 * @Date2025/3/923:31
 * @Create bysunlight
 */
public class Study9_7 {

    /**
     * Collections：是集合的工具类
     *
     *
     * 创建不可变的list集合:  不可以修改数据的内容，确保数据的安全
     *
     * 格式：
     *      List<数据类型> 变量名 = List.of(数据1,数据2,...);
     *
     *创建不可变的Set集合:  不可以修改数据的内容，确保数据的安全
     *
     * 格式：
     * Set<数据类型> 变量名 = Set.of(数据1,数据2,...);
     *
     *
     * 细节：当我们要获取一个不可变的Set集合时，里面的参数一定要保证唯一性
     *
     * 创建不可变的Map集合：
     * 格式：
     *      Map<数据类型,数据类型> 变量名 = Map.of(数据1,数据2,...);
     *
     * 细节：
     *      1.键不可重复
     *      2.Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
     */


    //addAll  批量添加元素
    //shuffle：打乱List集合元素的顺序
    public static void addAll()
    {
        ArrayList<String> list  = new ArrayList<>();
        Collections.addAll(list,"add","sdsad","sa1");
        Collections.shuffle(list);
        StringJoiner sj = new StringJoiner(",", " = ","");
        for (int i = 0; i < list.size(); i++) {
           sj.add(list.get(i));
        }
        System.out.println(sj);
    }

    /**
     * sort:排序
     * binarySearch:以二分查找法查找元素 :这个得到的值，是你数组集合排序之后得到的索引值，而不是你原来未排序的值
     * copy：拷贝集合中的元素
     * fill：使用指定的元素填充集合
     * swap：交换集合中指定位置的元素
     * max/min：按照默认排序获取最大、小值
     */
    public static void swap()
    {
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> numList1 = new ArrayList<>();
        Collections.addAll(numList,1,9,5,623,52,15,304,852,628,125,32,5,10,85,11,33,55,66,88,132);
        Collections.addAll(numList1,852,33,11,55);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);
        int s =  Collections.binarySearch(numList,9);
        System.out.println("查找的元素是" + s);
        Collections.copy(numList,numList1);
        System.out.println(numList1);
        System.out.println(numList);
        Collections.fill(numList1,22);
        System.out.println(numList1);
        Collections.swap(numList,1,3);
        System.out.println(numList);
        System.out.println(Collections.max(numList));
        System.out.println(Collections.min(numList));
        System.out.println(Collections.max(numList1));
        System.out.println(Collections.min(numList1));


    }

    public static void main(String[] args) {
        addAll();
    }


}
