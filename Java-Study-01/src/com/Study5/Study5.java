package com.Study5;

import java.util.Scanner;

/**
 * ClassName Study5
 *
 * @Date2025/2/2520:56
 * @Create bysunlight
 */
public class Study5  {

    /**
     * 字符串：
     *      1.String:
     *              字符串的内容是不会发生改变的，它的对象在创建后不能被更改
     *
     *        ==号比的到底是什么？
     *          基本数据类型：比较的是数据值
     *          引用数据类型比较的是地址值
     *
     *       字符串比较：
     *           equals方法（要比较的字符串）         完全一样的结果四true，否则为false
     *           equalsIgnoreCase（要比较的字符串）  忽略大小写的比较
     *
     *
     *        遍历字符串：
     *              charAt（index）：    根据索引返回字符
     *              length（）：         返回此字符串的长度
     *
     *         数组的长度： 数组名.length:       因为数组名的length是属性
     *         字符串的长度： 字符串名.length()   因为字符串的length是方法
     *
     *      2.StringBuilder:
     *           StringBuider可变的字符序列，
     *           StringBuilder是非线程安全的、StringBuffer是线程安全的
     *
     *
     *      3.StringJoiner:
     *            StringJoiner:    创建一个StringJoiner对象，指定拼接时的间隔符号
     *            StringJoiner(间隔符号、开始符号、结束符号):     创建一个StringJoiner对象，指定拼接时的间隔符号、开始符号、结束符号
     *
     *
     *      4.字符串原理：
     *           1.字符串存储的内存原理：
     *                  直接赋值会复用字符串常量池中的
     *                  new出来的不会，而是开辟一个新的空间
     *
     *           2.==号比较的是什么？
     *                  基本数据类型比较数据值
     *                  引用数据类型比较地址值
     *
     *           3.字符串拼接的底层原理：
     *
     *                      String s1  = "a";
     *                      String s2  = "b";
     *                      String s3  = "c";
     *                      String s4  = "d";
     *                      String s5  = "e";
     *                      String s6 = s1 + s2 + s3+ s4+ s5;
     *
     *                      s6总共会创建7个对象：
     *                              5个字符串常量
     *                              1个StringBuilder对象
     *                              1个由StringBuilder.toString()方法创建的新的Stiring对象
     *
     *
     *
     *                      String s1 = "a" + "b" + "c"
     *                          在编译的时候，程序底层会将 "a" + "b" + "c" 拼接为 “abc”;
     *
     *                      注意：
     *                          如果没有变量参与，都是字符串直接相加，编译之后就是拼接之后的结果，会复用串池中的字符串
     *                          如果有变量参与，每一行拼接的代码，斗湖在内存中创建新的字符串，浪费内存
     *
     *
     *           StringBuilder提高效率原理图：
     *                  所有要拼接的内容都会往StringBuilder中存放，不会创建很多无用的空间，节约内存.
     *
     *
     *           StringBuilder底层扩容机制：
     *                  底层初始状态默认容量是：16
     *                  1.如果超出的话，会采取扩容机制： 原来数组的容量 * 2 + 2，创建一个新的数组，将原来的数据存入新的数组当中去
     *                  2.如果不够，则已实际的容量为准。
     *
     *
     *
     */

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        String s5 = new String("ABC");
        System.out.println(s1 == s2);
        System.out.println(s4.equals(s5));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));


        Scanner scanner = new Scanner(System.in);
        String s6 = scanner.next();
        System.out.println(s6 == s1);
        System.out.println(s6.equals(s1));
        System.out.println(s6.equalsIgnoreCase(s1));
    }

    public static void test()
    {
        String s1  = "a";
        String s2  = "b";
        String s3  = "c";
        String s4  = "d";
        String s5  = "e";
        String s6 = s1 + s2 + s3+ s4+ s5;
        System.out.println(s6);
    }
}
