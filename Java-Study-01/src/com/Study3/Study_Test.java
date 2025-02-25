package com.Study3;

import java.util.Arrays;

/**
 * ClassName Study_Test
 *
 * @Date2025/2/2310:25
 * @Create bysunlight
 */
public class Study_Test {

    /**
     * 数组遍历：
     *      设计一个方法用于数组遍历，要求遍历的结果是在一行上面
     */
    public static void printLn()
    {
        int[] numArray = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numArray.length ; i++) {
            int num = numArray[i];
            System.out.print(num + "\t");
        }
    }


    /**
     * 数组最大值：
     *      设计一个方法求数组的最大值，并将最大值返回
     */
    public static int maxNum()
    {
        int[] numArray = {11,200,30,55,99,101};
        int maxNum = numArray[0];
        for (int i = 1; i < numArray.length ; i++) {
            int num = numArray[i];
            if (maxNum < num)
            {
                maxNum = num;
            }
        }
        return maxNum;
    }


    /**
     * 数字是否存在：
     *      定义一个方法判断数组中的某一个数是否存在
     */
    public static void canExist(int num)
    {
        int[] numArray = {200,300,500,20,30,99,66,10,15};
        boolean exist = false;
        for (int i = 0; i < numArray.length; i++) {
            int num1 =numArray[i];
            if (num == num1)
            {
               exist = true;
            }
        }
        if (exist)
        {
            System.out.println("数组中存在");
        }else {
            System.out.println("数组中不存在");
        }

    }


    /**
     * 复制数组：
     *      定义一个方法copyOfRange(int[] arr,int from,int to)
     *      功能：将数组arr中从索引from（包含from）开始，到索引to结束（不包含）
     *      的元素复制到新数组中，将新数组返回
     */
    public static void copyOfRange(int[] arr,int from,int to)
    {
        if (arr.length > from  && arr.length < to)
        {
            return;
        }
        if (arr.length < from ||arr.length < to)
        {
            return;
        }
        int[] newArray = new int[to - from];

        //伪造一个索引
        int index = 0;
        for (int i = from; i < to; i++) {
            int newNum = arr[i];
            newArray[index] = newNum;
            index++;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }

    public static void change(int[] arr)
    {
        arr[1] = 200;
    }



    public static void main(String[] args) {
        //printLn();
        //int num =  maxNum();
        //System.out.println(num);
        //canExist(11);
        //canExist(15);
        //copyOfRange(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},3,9);
        int[] arr = {10,20,30};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }

}
