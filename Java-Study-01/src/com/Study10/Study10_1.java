package com.Study10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * ClassName Study10_1
 *
 * @Date2025/3/112:26
 * @Create bysunlight
 */
public class Study10_1 {


    /**
     * 方法引用：
     *      把已经有的方法拿过来用，当做函数式接口中抽象方法的方法体
     *
     *  细节：
     *      1.被引用的方法必须已经存在
     *      2.被引用的方法的形参和返回值需要跟抽象方法保持一致
     *      3.被引用方法的功能要满足当前需求
     *
     *
     * 方法引用分类：
     *
     * 1.引用静态方法：
     * 2.引用成员方法：
     *      1.引用其他类的成员方法  其他类对象 ::方法名
     *      2.引用本类的成员方法   this::方法名 （引用处应该是非静态方法）
     *      3.引用父类的成员方法 super::方法名
     * 3.引用构造方法：
     *
     */
    public static void main(String[] args) {
        test1();
    }

    private static void test() {
        Integer[] arr = {3,5,4,1,6,2};
        //匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer - t1;
            }
        });
        Arrays.stream(arr).forEach(s -> System.out.println(s));


        Arrays.sort(arr,(t1,t2) -> t2 - t1);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,Study10_1::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int num1,int num2)
    {
        return num1 - num2;
    }

    public static void test1()
    {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));
    }

}
