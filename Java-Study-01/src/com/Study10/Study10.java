package com.Study10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * ClassName Study10
 *
 * @Date2025/3/1013:58
 * @Create bysunlight
 */
public class Study10 {

    /**
     * Stream流：
     *      结合Lambda表达式，简化集合、数组的操作
     *
     *
     *Stream流的使用步骤：
     *      1.先得到一条Stream流，并把数据放上去
     *      2.利用Stream流中的API进行各种操作{中间方法，终结方法}
     *
     * 流：
     *
     *    中间方法：
     *      filter：过滤
     *      limit：获取前几个元素
     *      skip：跳过前几个元素
     *      distinct：元素去重，依赖（hashCode和equals方法）
     *      concat：合并a和b两个流为一个流
     *      map：转换流中的数据结构
     *
     *
     * 单列集合：Collection中默认的方法stream
     * 双列集合：不能直接获取。需要通过调用keySet或者entrySet转换，然后调用stream
     * 数组。Arrays工具类型中的静态方法stream
     * 一堆零散数据，Stream接口中的静态方法of
     *
     * 细节：
     *    1.返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
     *    2.修改Stream流中的数据，不会影响原来集合或者数组中的数据
     *
     *
     * toArray方法的参数的作用：负责创建一个指定类型的数组
     * toArray方法的底层：会依次得到流里面的每一个数据，并把数据放到数组当中去
     * toArray方法的返回值：是一个装着流里面的所有数据的数组
     *
     */

    public static void stream()
    {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张无忌");
        strings.add("周芷若");
        strings.add("赵敏");
        strings.add("张强");
        strings.add("张三丰");
        strings.add("张翠山");
        strings.add("张良");
        strings.add("王二麻子");
        strings.add("谢广坤");
        //strings.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.print(name + "\t"));
        strings.stream().skip(4).limit(3).forEach(s -> System.out.println(s));
        String[] v = strings.stream().toArray(s -> new String[s]);
        System.out.println(v);
    }

    public static void Stream()
    {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("add",123);
        hashMap.put("add1",1234);
        hashMap.put("add2",1235);
        hashMap.put("add3",1236);

        //获取每一个键
        hashMap.keySet().stream().forEach(s -> System.out.println(s));

        //获得的是键值对
        hashMap.entrySet().stream().forEach(s -> System.out.println(s));
    }


    public static void stream1()
    {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("张无忌-男-15");
        strings.add("周芷若-女-14");
        strings.add("赵敏-女-13");
        strings.add("张强-男-20");
        strings.add("张三丰-男-100");
        strings.add("张翠山-男-40");
        strings.add("张良-男-35");
        strings.add("王二麻子-男-37");
        strings.add("谢广坤-男-41");
        strings.stream().filter(s ->"男".equals(s.split("-")[1])).forEach(s -> System.out.println(s));
        Map<String, Integer> collect = strings.stream().
                filter(s -> "男".equals(s.split("-")[1]))
                /**
                 * toMap:  参数一，表示键的生成规则
                 *         参数二：表示值的生成规则
                 *
                 * 参数一：
                 *      Function泛型一，表示流中的每一个数据的类型
                 *      Function泛型二：表示Map集合中键的数据类型
                 *
                 *      方法apply形参：依次表示流里面的每一个数据
                 *              方法体：生成键的代码
                 *              返回值：已经生成的键
                 * 参数二：
                 *      Function泛型二：表示流里面每一个数据的类型
                 *      Function泛型二：表示Map集合中值的数据类型
                 *
                 *      方法apply形参：依次表示流里面每一个数据
                 *              方法体：生成值的代码
                 *              返回值：已经生成的值
                 *
                 */
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(collect);

        strings.stream()
                .filter( s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0],s -> Integer.parseInt(s.split("-")[2])))
                .forEach((s, s2) -> System.out.println(s + "=" + s2));

    }


    public static void main(String[] args) {
        stream1();
    }

}
