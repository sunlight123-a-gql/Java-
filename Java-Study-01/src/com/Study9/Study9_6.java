package com.Study9;

/**
 * ClassName Study9_6
 *
 * @Date2025/3/923:23
 * @Create bysunlight
 */
public class Study9_6 {

    /**
     * 假设需要定义一个方法求和，该方法可以灵活的完成如下需求：
     * 计算2个数据的和
     * 计算3个数据的和
     * 计算4个数据的和
     * 计算5个数据的和
     * 。。。。
     * 计算n个数据的和
     *
     */

    public static void main(String[] args) {
        System.out.println(num(1, 2, 3, 4, 4, 5));
    }


    /**
     * 可变参数：方法形参的个数是可以发生变化的
     * 格式： 数据类型...参数名称
     * 底层：
     *      可变参数底层就是一个数组。
     *      只不过不需要我们自己创建，Java会帮我们创建好
     *
     *
     * 细节：
     *      1.在方法的形参中最多只能有一个可变参数
     *      2.可变参数必须放在形参列表的最后面
     *
     * @return
     */
    public static int num(int... args)
    {
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            count += args[i];
        }
        return count;
    }

}
