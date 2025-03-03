package com.Study5;

import java.util.Scanner;

/**
 * ClassName Study5_Test
 *
 * @Date2025/2/2713:34
 * @Create bysunlight
 */
public class Study5_Test {

    public static void main(String[] args) {
        //ChangeNum();
        //String();
        //numToString();
        getLength();
    }





    /**
     * 将数字变成罗马数字：
     *  如果录入的数字包含0，则可以变成""(长度为0的字符串)
     *
     *  注意：
     *      在遍历输入字符串的每个字符时，通过 c - '0' 将字符转换为对应的整数。例如，字符 '1' 减去字符 '0' 的 ASCII 码值，结果就是整数 1
     */
    public static void ChangeNum()
    {
        String[] arr = {"I","II","III","IV","V","VI","VII","VIII","IX"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字： ");
        String numStr = scanner.next();
        StringBuilder stringBuilder = new StringBuilder();
        if (!numStr.matches("^\\d+$"))
        {
            System.out.println("你输入的字符串不全是数字");
            return;
        }
        if (numStr.length() > 9)
        {
            System.out.println("你输入的字符串长度不符合要求，不能超过9");
        }
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            System.out.println(c);
            if (c == '0')
            {
                stringBuilder.append("");
            }else {
                stringBuilder.append(arr[(c - '0') - 1]);
            }
        }
        System.out.println(stringBuilder);
    }


    /**
     * 旋转操作：
     *      给定两个字符串，A和B：
     *      A的旋转操作时将A最左边的字符移动到最右边
     *
     *      如果在若干次调整操作后，A能够变成B,那么返回true，否则为false
     */
    public static void String()
    {
        String A = "abcde";
        String B = "abcde";

        char[] chars = A.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            A = Rotate(A);
            if (B.equals(A))
            {
                System.out.println("匹配成功");
                return;
            }
        }
        System.out.println("匹配不成功");
    }
    private static String Rotate(String str)
    {
        /*char temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return new String(arr);*/

        char c = str.charAt(0);
        String substring = str.substring(1);
        return substring + c;
    }

    /**
     * 给定两个以字符串形式表示的非负整数num和num2，返回num1和num2的乘积，返回结果也用字符串的形成返回
     */
    public static void numToString()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个纯数字的字符串: ");
        String numStr1 = scanner.next();

        System.out.println("请输入另外一个纯数字的字符串: ");
        String numStr2 = scanner.next();

        int newNum1 = strToInt(numStr1);
        int newNum2 = strToInt(numStr2);
        int endNum = newNum1 * newNum2;
        String endStr = endNum + "";
        System.out.println(endStr);
    }
    private static int strToInt(String str)
    {
        int length = str.length();
        int num = 0;
        int[] numArr = new int[length];
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int n = c - '0';
            num = num * 10 + n;
        }
        return num;
    }


    /**
     * 给一个字符串s，由若干单词组成，单词前后用空格字符隔开，返回字符串中最后一个单词的长度
     */
    public static void getLength()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个纯数字的字符串: ");
        String numStr1 = scanner.nextLine();  //可以输入带空格的字符串
        System.out.println(numStr1);
        char[] chars = numStr1.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length-1  ; i >= 0 ; i--) {
            char c = chars[i];
            if (c == ' '){
                break;
            }else {
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
    }

}
