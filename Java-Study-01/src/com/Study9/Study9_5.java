package com.Study9;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName Study9_5
 *
 * @Date2025/3/70:14
 * @Create bysunlight
 */
public class Study9_5 {

    /**
     * 泛型：
     *      可以在编译阶段约束操作的数据类型，并进行检查。
     *
     *      泛型的格式:
     *          <数据类型>
     *
     * 泛型方法：
     *      方法中形参类型不确定时
     *          1.使用类名后面定义的泛型  -》 所有方法都可以使用
     *          2.在方法声明上定义自己的泛型  -》 只有本方法能用
     *
     *     泛型的通配符：
     *          1. ？ extend E：E的本身还有他的子类
     *          2.？ super E：E的本身还有他的父类
     *
     */


    public static void Iterator()
    {
        /**
         * 如果我们没有给集合指定类型，默认认为所有的数据类型都是Object类型
         * 此时可以往集合里面添加任意的数据类型
         * 但是，我们在获取数据的时候，无法使用他的特有行为。
         *
         * 此时，推出了泛型，可以在添加数据的时候就把类型进行统一
         */
        ArrayList<String> list = new ArrayList<>();

        list.add("123");
        list.add("1234");
        list.add("1235");
    }

}
