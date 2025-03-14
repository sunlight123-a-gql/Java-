package com.Study10.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName Test1
 *
 * @Date2025/3/110:33
 * @Create bysunlight
 */
public class Test1 {

    /**
     * 定义一个集合，并添加一些整数， 1,2,3,4,5,6,7,8,9,10
     * 过滤奇数，只留下偶数
     * 并将结果保存下来
     */

    public static void test()
    {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(list).filter(s -> s % 2 ==0).forEach(s -> System.out.println(s));
    }


    /**
     * 创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄，
     * “zhangsan,23”
     * "lisi,24"
     * “wangwu,25”
     * 保留年龄大于等于24的人，并将结果收集到Map集合当中，姓名为键，年龄为值
     */
    public static void test1()
    {
        ArrayList<String> list = new ArrayList();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");
        list.stream()
                .filter(s -> 24<= Integer.parseInt(s.split(",")[1]))
                .collect(Collectors.toMap(s -> s.split(",")[0],s -> Integer.parseInt(s.split(",")[1])))
                .forEach((s, integer) -> System.out.println(s +"=" + integer));
    }


    /**
     * 现在有两个ArrayList集合:
     * 第一个集合中，存储6名男演员的年龄和姓名，第二个集合中存储六名女演员的姓名和年龄
     * 姓名和年龄之间用逗号隔开
     *
     * 完成如下操作：
     * 1.男演员只要名字为三个字的前两人
     * 2.女演员只要姓杨的，并且不要第一个人
     * 3.把过滤之后的男演员姓名和女演员姓名结合到一起
     * 4.将上一步演员信息封装成Actor对象
     * 5.将所有的演员对象都保存到list集合当中去，
     *
     * 演员类。Actor 属性只有一个name，age
     */
    public static void test2()
    {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌,18","杨过,20","张三丰,100","张强,20","谢广坤,41");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"周芷若,18","赵敏,20","杨不悔,16","胡闹,11","杨华,41","杨晓,18");

        Stream<String> stringStream = list1.stream()
                .filter(s -> (s.split(",")[0]).length() == 3)
                .limit(2);
        Stream<String> stringStream1 = list2.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);
        Stream<String> combinedStream = Stream.concat(stringStream, stringStream1);
        List<Actor> collect = combinedStream.map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        test2();
    }

}
