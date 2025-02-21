package com.Study2;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName Study2_1
 *
 * @Date2025/2/1917:02
 * @Create bysunlight
 */
public class Study2_1 {


    public static void main(String[] args) {
        GuessNum();
    }


    /**
     * 猜数字游戏：
     */
    public static void GuessNum()
    {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int GuessCount = 0;
        while (true)
        {
            System.out.println("请输入一个数字：");
            int num = scanner.nextInt();
            GuessCount++;
            if ( num >randomNum )
            {
                System.out.println("你猜的数字大了");
            }else if (num < randomNum){
                System.out.println("你猜的数字小了");
            }else {
                System.out.println("你猜对了,一共猜了"+GuessCount + "次数");
                break;
            }
        }
    }

}
