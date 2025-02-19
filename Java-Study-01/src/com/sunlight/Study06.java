package com.sunlight;

import java.util.Scanner;

/**
 * ClassName Study06
 *
 * @Date2025/2/191:24
 * @Create bysunlight
 */
public class Study06 {

    /**
     * 约会：
     *      键盘录入两个整数，如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true,否则为false。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请你输入一个你的时髦程度：");
        int selfNum = scanner.nextInt();
        System.out.println("请你输入你对象的时髦程度：");
        int girlNum = scanner.nextInt();
//        if (selfNum > girlNum)
//        {
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
        boolean result = selfNum > girlNum;
        System.out.println(result);
    }



    /**
     *
     * 逻辑运算符
     * 1. & 并且（逻辑与）：
     *      两边都是真，结果才是真
     *
     * 2.| 或者（逻辑或）：
     *      两边都是假，结果才是假。
     *
     * 3. ^ 异或（逻辑异或）：
     *      相同为false，不同为true。
     *
     * 4.! 逻辑非：
     *      取反
     *
     *
     *  注意事项：
     *      & 和 |： 无论左边结果是true、还是false，右边都要执行。
     */


    /**
     * 短路逻辑运算符：
     *      &&：短路与：
     *          结果和 & 相同，但是有短路效果
     *      || 短路或：
     *          结果和 | 相同，但是有短路效果
     *
     *
     * 注意事项：
     *      &&、||:
     *          如果左边能确定整个表达式的结果，右边就不需要执行，（如果左边为假。不管右边是真是假，整个表达式的结果是为false的。）
     *
     *
     */

}
