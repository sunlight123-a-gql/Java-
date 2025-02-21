package com.Study2;

import java.util.Random;

/**
 * ClassName Study2_2
 *
 * @Date2025/2/1917:09
 * @Create bysunlight
 */
public class Study2_2 {

    /**
     * 数组：
     *  概念：
     *      数组指的是一种容器，可以用来存储同种数据类型的多个值。
     *
     *
     *      数组的定义与静态初始化：
     *              数组的定义：
     *                 1. 数据类型[] 数组名
     *                 2. 数据类型    数组名[]
     *              数组的初始化：
     *                  就是在内存中，为数组容器开辟空间，并将数据存入容器中的过程。
     *
     *              静态初始化：
     *                  数据类型[] 数组名 = new 数据类型[]{元素1，元素2，元素3...};
     *                  数据类型[] 数组名 = {元素1，元素2，元素3...};
     *      数组元素的访问
     *              格式：
     *                  数组名[索引]
     *      数组的遍历：
     *          开始条件 ：0
     *          结束条件：   数组的长度 - 1
     *
     *      数组的动态初始化
     *          动态初始化：初始化时只指定数组的长度，由系统（虚拟机）为数组分配初始值
     *
     *          格式：
     *              数据类型[] 数组名 = new 数据类型[数组长度]；
     *      数组的内存图
     *      数组常见问题
     *      数组常见操作
     */

    /**
     * 定义一个数组，
     * 遍历数组得到每一个元素，统计数组里面有多少个能被3整除的数字
     */
    public static int ForNumCount()
    {
        int[] numArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < numArray.length ; i++) {

            if (numArray[i] % 3 == 0)
            {
                count++;
            }
        }
        return count;
    }

    /**
     * 定义一个数组
     * 遍历数组的每一个元素
     * 要求：
     *  如果是奇数，则将当前数字扩大2倍
     *  如果是偶数，则将当前数字变成原来的一半
     */
    public static void ForEachNum()
    {
        int[] numArray = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0)
            {
                numArray[i] /= 2;
            }else {
                numArray[i] *= 2;
            }
        }
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " \t");
        }
    }

    /**
     * 生成10个1~100之间的随机数存入数组
     * 1.  求出所有的数据和
     * 2.  求出所有数据的平均数
     * 3.  统计有多少个数据比平均值小
     * @param args
     */
    public static void Num()
    {
        Random random = new Random();
        int[] numArray = new int[10];
        for (int i = 0; i < 10 ; i++) {
            int num1 = random.nextInt(100)+1;
            System.out.println(num1);
            numArray[i] = num1;
        }
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        System.out.println("总数"+sum);

        int numPer = sum / numArray.length;
        System.out.println("平均数" + numPer);

        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numPer > numArray[i])
            {
                count++;
            }
        }
        System.out.println("有" + count + "个数据比平均数小");
    }


    /**
     *  定义一个数组，存入1,2,3，4,5
     *  交换首尾索引
     * 得到5,2，3,4,1
     *  * @param args
     */
    public static void reverseArray()
    {
        int[] numArray = {1,2,3,4,5};
        for (int i = 0; i < numArray.length ; i++)
        {
            if (i == 0)
            {
                int num  = numArray[i];
                numArray[i] =  numArray[numArray.length - 1];
                numArray[numArray.length-1] = num;
            }
        }

        for (int i = 0; i < numArray.length; i++) {
            int num1 = numArray[i];
            System.out.print(num1 + "\t");
        }
    }


    /**
     *
     * Java的内存分配：
     *
     * 栈：        方法运行时使用的内存，比如main方法运行，进入方法栈中执行
     * 堆：        存储对象或者数组，new来创建的，都存储在堆内存中的
     * 方法区：     存储可以运行的class文件
     * 本地方法栈：  JVM在使用操作系统功能的时候使用，和我们开发无关
     * 寄存器：     给CPU使用，和我们开发无关
     *
     *
     * 注：  当两个数组指向同一个小空间时，
     *      其中一个数组堆小空间中的值发生了改变，
     *      那么其他数组再次访问时候都是修改之后的结果。
     *
     * @param args
     */

    public static void main(String[] args) {
        //ForEachNum();
        //Num();
        reverseArray();
    }
}
