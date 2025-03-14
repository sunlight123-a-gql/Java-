package com.Study9;

import java.util.ArrayList;

/**
 * ClassName Study9
 *
 * @Date2025/3/520:06
 * @Create bysunlight
 */
public class Study9 {

    /**
     * 算法：
     *      查找算法：
     *          1.基本查找:for循环查找数据
     *          2.二分查找、折半查找：
     *              前提条件：
     *                  数组中的数据必须是有序的
     *              核心逻辑：
     *                  每次排除一半的查找范围，提高查找效率
     *               1.min和max表示当前要查找的范围
     *               2.mid是在min和max之间的
     *               3.如果要查找的元素在mid的左边，缩小范围时，min不变，max等于mid减一
     *               4.如果要查找的元素在mid的右边，缩小范围时，max不变，min等于mid加一
     *          3.分块查找:
     *              核心思想：
     *                  块内无序，块间有序
     *              实现步骤：
     *                  1.创建数组blockArr，存放每一个块对象的信息
     *                  2.先查找blockArr确定要查找的数据属于那一块
     *                  3.再单独遍历这一块数据即可
     *
     */


    /**
     * 普通查找
     * 数组：
     * 要查找的元素
     * @return
     */
    public static boolean basicSearch(int[] arr,int number)
    {
        //利用基本查找来查找number在数组中是否存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
            {
                return true;
            }
        }
        return false;
    }


    public static int[] basicSearch_new(int[] arr,int number)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //利用基本查找来查找number在数组中是否存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
            {
                arrayList.add(i);
            }
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }


    //二分查找法:  提高查找效率
    public static int binarySearch(int[] arr,int number)
    {
        //定义两个变量记录要查找的范围
        int min = 0;
        int max = arr.length-1;
        //利用循环不断地去找要查找的数据
        while (true)
        {
            if (min > max){
                return -1;
            }
            //找到min和max的中间位置
            int mid = (min + max)/2;
            //拿着mid指向的元素跟要查找的元素进行比较
            if (arr[mid] >number){
                max = mid -1;
            }else if (arr[mid] < number){
                min = mid + 1;
            }else {
                return mid;
            }
        }
    }


    public static int blockSearch(int[] arr,int number)
    {
        //要把数据进行分块
        //要分为几块
        return -1;
    }
}
