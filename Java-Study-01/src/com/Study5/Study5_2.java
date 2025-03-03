package com.Study5;

import java.util.StringJoiner;

/**
 * ClassName Study5_2
 *
 * @Date2025/2/2711:23
 * @Create bysunlight
 */
public class Study5_2 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();


        appendString();
        stringJoiner();
    }



    /**
     *  //添加
     *       stringBuilder.append(1);
     *       stringBuilder.append(2.3);
     *       stringBuilder.append(true);
     *
     *
     * //stringBuilder.reverse()反转
     *
     *
     *
     * 打印StirngBuilder不是地址值而是属性值
     */


    /**
     * 链式编程:
     *
     */


    /**
     * 拼接字符串：
     *
     */
    public static void appendString()
    {
        int[] arr = {1,2,3};
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (arr.length -1 == i)
            {
                stringBuilder = stringBuilder.append(arr[i]).append("]");
            }else {
                stringBuilder = stringBuilder.append(arr[i]).append(",");
            }
        }
        System.out.println(stringBuilder);
    }


    public static void stringJoiner()
    {
        int[] arr = {1,2,3};
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            stringJoiner.add(String.valueOf(arr[i]));
        }
        System.out.println(stringJoiner);
    }



}
