package com.Study9.Test;

import java.text.Collator;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.BiConsumer;

/**
 * ClassName Test_TreeMap
 *
 * @Date2025/3/918:18
 * @Create bysunlight
 */
public class Test_TreeMap{

    /**
     * 需求1：
     *      键：整数表示id
     *      值：字符串表示商品名称
     *      要求，按照id的升序排序，按照id的降序排列
     *
     *
     *
     * 需求2：
     *      键：学生对象
     *      值：籍贯
     *      要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名同年龄视为同一人
     *
     */


    private static void Test1()
    {
        TreeMap<Integer,String> godsMap = new TreeMap<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 -integer;
            }

        });
        godsMap.put(66,"面包1");
        godsMap.put(80,"面包2");
        godsMap.put(12,"面包3");
        godsMap.put(19,"面包4");

        godsMap.forEach((Integer integer, String s) -> System.out.println(integer + "=" + s));
    }

    private static void Test2()
    {
        TreeMap<Student1,String> godsMap = new TreeMap<>();
        godsMap.put(new Student1("小米",18),"江苏");
        godsMap.put(new Student1("大米",35),"北京");
        godsMap.put(new Student1("孔明",80),"天津");
        godsMap.put(new Student1("上帝",35),"上海");

        godsMap.forEach((Student1 student1, String s) -> System.out.println(student1.getAge() + "=" + student1.getName() +"=" + s));
    }


    public static void main(String[] args) {
        Test2();
    }
}
