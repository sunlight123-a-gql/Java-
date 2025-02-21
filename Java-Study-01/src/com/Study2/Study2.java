package com.Study2;

import java.util.Scanner;

/**
 * ClassName Study2
 *
 * @Date2025/2/1911:26
 * @Create bysunlight
 */
public class Study2 {

    public static void main(String[] args) {

        //计算1~100之间的偶数和
//        int sum = 0;
//        for (int i = 1; i <= 100 ; i++) {
//            if (i % 2 == 0)
//            {
//                sum += i;
//            }
//        }
//        System.out.println(sum);


        //计算输入两个数，这两个数之间，既能够被3整除，又能被5整除的数有几个
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入第一个数，表示左区间");
//        int smallNum = scanner.nextInt();
//        System.out.println("请输入第二个数，这个是最大的数字");
//        int bigNum = scanner.nextInt();
//        int count = 0;
//        for (int i = smallNum; i <= bigNum ; i++) {
//            if (i % 3 == 0 && i % 5 == 0)
//            {
//                count++;
//            }
//        }
//        System.out.println(count);


        //计算打印折纸的次数，世界上最高峰8844.43米 = 8844430毫米。有一张足够大的纸，需要折多少次，才能达到这个高度
//        int count = 0;
//        double i = 0.1;
//        while (i < 8844430)
//        {
//            count++;
//            i *= 2;
//        }
//        System.out.println(count);
    }

    /**
     * 流程控制语句：
     *      顺序结构
     *          程序默认的执行流程，从上至下
     *      分支结构：
     *          if语句的格式
     *              if(关系表达式){
     *                  语句体;
     *              }
     *          执行流程：
     *              1.首先计算关系表达式的值
     *              2.如果表达式的值为true，就执行语句体
     *              3.如果关系表达式的值为false，就不指向语句体
     *              4.继续执行后面的其他语句
     *
     *
     *          if的第二种格式
     *              if(关系表达式)
     *              {
     *                  语句体1；
     *              }else{
     *                  语句体2；
     *              }
     *
     *          if的第二种格式
     *                  if(关系表达式1)
     *                  {
     *                      语句体1；
     *                  }else if(关系表达式2){
     *                     语句体2；
     *                 }else{
     *                     语句体3
     *                 }
     *
     *          switch语句格式
     *              switch(表达式){
     *                  case 值1：
     *                      语句体1；
     *                      break；
     *                  case 值2：
     *                      语句体2；
     *                      break；
     *                  ....
     *
     *                  default:
     *                      语句体n+1；
     *                      break;
     *              }
     *          注：
     *              表达式：取值为byte、short、int、char、枚举（JDK5以后可以使用），JDK以后可以是String。
     *              case：之后跟的值只能是字面量，不能写变量
     *              case穿透：在每个case条件之后，需要加入break中断语句，如果不加，会出现case穿透现象。
     *      循环结构：
     *          for循环语句格式:
     *              for(初始化语句;条件判断语句;条件控制语句)
     *              {
     *                  循环体语句;
     *              }
     *
     *          while语句格式
     *              while(条件判断语句){
     *                  循环体语句；
     *                  条件控制语句；
     *              }
     *
     *
     *           注：
     *              for和while的区别？
     *                  答： for循环使用场景是，知道循环次数或者循环的范围
     *                      while循环的使用场景是，不知道循环的次数和范围，只知道循环的结束条件
     *
     *
     *
     *         do...while循环语句格式：
     *              do{
     *                  循环体语句；
     *                  条件控制语句；
     *              }while(条件判断语句);
     */

}
