package com.Study3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * ClassName Study_Test02
 *
 * @Date2025/2/2311:26
 * @Create bysunlight
 */
public class Study_Test02 {


    // ctrl + alt + m: 自动抽取方法

    /**
     * 卖飞机票：
     *      机票价格按照淡季旺季、头等舱和经济舱收费，输入机票原价、月份、头等舱或者经济舱
     *      按照如下规则计算价格：
     *          旺季：5-10月份头等舱9折，经济舱8折
     *          淡季：11-4，头等舱7.5折，经济舱6.5折
     */
    public static int Price()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入机票的原价: ");
        int money = scanner.nextInt();
        System.out.print("请输入当前的月份: ");
        int month = scanner.nextInt();
        System.out.print("请输入当前购买的舱位，1 头等舱、2 经济舱: ");
        int type = scanner.nextInt();
        if (month >= 5 && month <= 10)
        {
            getPrice(money,type,0.9,0.8);
        }else if ((month >= 11 && month <= 12)|| month >= 1 && month <= 4){
            getPrice(money,type,0.75,0.65);
        }else {
            System.out.println("键盘录入的不合法");
        }
        return money;
    }

    public static int getPrice(int money,int sat,double v1,double v2)
    {
        if (sat == 1)
        {
            money *= v1;
        }else if (sat == 2){
            money *= v2;
        }else {
            System.out.println("键盘录入的不合法");
        }
        return money;
    }

    /**
     * 找质数：
     *      判断101-200之间有多少个质数，并输出所有的质数
     */
    public static void getNum()
    {
        int count = 0;
        boolean isZHI = true;
        for (int i = 101; i <= 200; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0)
                {
                   isZHI = false;
                }
            }
            if (isZHI)
            {
                count++;
                System.out.print(i + "\t");
            }else {
                isZHI = true;
            }
        }
        System.out.println("一共有" + count + "个质数");
    }

    /**
     * 开发验证码:
     *      定义方法实现随机产生一个5位的验证码：
     *      验证码格式：
     *          长度是5位
     *          前四位是大写字母或者小写字母
     *          最后一位是数字
     */
    public static void RandomNum()
    {
        String num = "";
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            if (i <= 3)
            {

                // 随机决定是生成大写字母还是小写字母
                boolean isUpperCase = random.nextBoolean();

                if (isUpperCase) {
                    // 大写字母的 ASCII 码范围是 65 到 90
                    num += (char) (random.nextInt(26) + 65);
                } else {
                    // 小写字母的 ASCII 码范围是 97 到 122
                    num += (char) (random.nextInt(26) + 97);
                }
            }else {
                int randomNum = random.nextInt(10);
                num += randomNum;
            }
        }
        System.out.println(num);
    }

    /**
     * 数组元素的复制:
     *      把一个数组中的元素复制到另一个新数组当中去
     */
    public static void copyArray()
    {
        int[] arr = {1,2,3,4,5};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            newArr[i] = num;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }


    /**
     * 评委打分:
     *      有6个数字，在0-100之间，去掉最高和最低分，得到剩下数字的平均值。
     */
    public static void getScore()
    {
        int sum = 0;
        int[] scoreArray = {85,86,99,80,90,88};
        for (int j : scoreArray) {
            sum += j;
        }
        int maxScore = getMaxScore(scoreArray);
        System.out.println(maxScore);
        int minScore = getMinScore(scoreArray);
        System.out.println(minScore);
        sum -= maxScore;
        sum -= minScore;
        System.out.println(sum / 4);
    }
    private static int getMaxScore(int[] scoreArray)
    {
        int maxScore = scoreArray[0];
        for (int i = 0; i < scoreArray.length; i++) {
            int score = scoreArray[i];
            if (maxScore < score)
            {
                maxScore = score;
            }
        }
        return maxScore;
    }

    private static int getMinScore(int[] scoreArray)
    {
        int minScore = scoreArray[0];
        for (int i = 0; i < scoreArray.length; i++) {
            int score = scoreArray[i];
            if (minScore > score)
            {
                minScore = score;
            }
        }
        return minScore;
    }

    /**
     * 数字加密:
     *      某系统的数字密码，比如1983，采用加密方式进行传输，
     *      规则如下：
     *          先得到每位数字，
     *          然后每位数字都加上5，
     *          对10求余，
     *          然后将数字反转，
     *          得到新的数字
     */
    public static void Num(int password)
    {
        String numStr = String.valueOf(password);
        int length = numStr.length();
        int[] result = new int[length];
        for (int i = 0; i < length ; i++) {
            int num = numStr.charAt(i) - '0';
            result[i] = enCode(num);
        }
        reverseArray(result);
        int newNum = 0;
        for (int number : result) {
            newNum = newNum * 10 + number;
        }
    }

    private static int enCode(int num)
    {
        num += 5;
        num %= 10;
        return num;
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * 数字解密
     */
    public static void Encode(int code)
    {
        int count = 0;
        int temp = code;
        while (code != 0)
        {
            code /= 10;
            count++;
        }
        int[] arr = new int[count];
        int index = 0;
        while (temp != 0)
        {
            int num = temp % 10;
            temp = temp / 10;
            arr[index] = num;
            index++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4)
            {
                arr[i] = arr[i] + 10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] -5;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            sum = sum *10 + num;
        }
        System.out.println(sum);
    }

    /**
     * 抢红包：
     *      定义一个数组，随机输出里面的数据，不能重复出现
     */
    public static void Random()
    {
        int[] arr = {2,588,888,1000,10000};
        int[] newArr = new int[arr.length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length;) {
            int randomIndex = random.nextInt(arr.length);
            int num = arr[randomIndex];
            if (contains(newArr,num))
            {
                System.out.println("抽奖次数" + i);
            }else {
                newArr[i] = num;
                System.out.println(num + "元的奖金被抽出");
                i++;
            }
        }
    }

    private static boolean contains(int[] array,int num)
    {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            int newNum = array[i];
            if (newNum == num)
            {
                flag = true;
            }
        }
        return flag;
    }


    /**
     * 模拟双色球【拓展】
     */



    public static void main(String[] args) {
        //getNum();
        //RandomNum();
        //getScore();
        //Num(1983);
        //Encode(8346);
        Random();
    }

}
