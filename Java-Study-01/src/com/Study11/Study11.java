package com.Study11;

/**
 * ClassName Study11
 *
 * @Date2025/3/1121:47
 * @Create bysunlight
 */
public class Study11 {

    /**
     * 异常：程序可能出现的问题
     *
     * 编译时异常：
     *      没有继承RuntimeException的异常。是直接继承于Exception，
     *      编译阶段就会报错误提示
     * 运行时异常：
     *       RuntimeException本身和子类
     *       编译阶段没有任何错误提示，运行时才会出现
     *
     *
     * 如果try中可能会遇到多个问题，怎么执行？
     *      会写多个catch与之对应
     *      细节：
     *          如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面
     *
     * 如果try中遇到的问题没有被捕获的话，怎么执行？
     *      相当于try...catch的代码白写了，最终还是会交给虚拟机进行处理
     *
     * 如果try中遇到问题，那么try下面的其他代码还会执行吗？
     *      不会执行，会直接跳转到对应的catch当中，执行catch里面的语句体，但是如果没有对应的catch与之匹配，那么还是会交给虚拟机进行处理
     */





    public static void test()
    {
        int[] arr = {1,2,3,4,5,6};

        try {
            System.out.println(arr[1]);
            System.out.println(1/0);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("索引越界了");
        }catch (ArithmeticException e1)
        {
            System.out.println("算术异常");
        }
        System.out.println("你看我执行了吗");

    }


    public static void main(String[] args) {
        test();
    }





}
