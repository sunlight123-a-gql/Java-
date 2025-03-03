package com.Study5;

import java.util.Scanner;

/**
 * ClassName Study5_1
 *
 * @Date2025/2/2620:34
 * @Create bysunlight
 */
public class Study5_1 {


    public static void main(String[] args) {

        //length();
        //forString();
        int[] arr = {1,2,3};
        //arrToString(arr);
        //arrReverse();
        //NumCaptial();
        subString();
    }




    /**
     * 用户登录：
     *      已知正确的用户名和密码，请使用程序实现模拟用户登录：
     *      一共三次机会，登录完成之后给出相应提示信息
     */
    public static void UserLogin()
    {
        String userName = "gql";
        String password = "gql19970131";
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            if (count == 3)
            {
                System.out.println("你的账号被锁定，请稍后再试");
                break;
            }
            count++;
            System.out.println("请输入你的用户名:");
            String user = scanner.next();
            System.out.println("请输入你的密码:");
            String pass = scanner.next();
            if (!user.equals(userName)||!pass.equals(password))
            {
                System.out.println("账号或密码错误");
            }
            if (user.equals(userName) &&pass.equals(password))
            {
                System.out.println("登录成功，欢迎使用");
                break;
            }
        }while (count <= 3);
    }


    /**
     * 遍历字符串
     */
    public static void forString()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串： ");
        String string = scanner.next();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            System.out.println(c);
        }


        for (int i = 0; i < string.length(); i++) {
            char s = string.charAt(i);
            System.out.println(s);
        }
    }

    /**
     * 键盘录入一个字符串。统计该字符串中的大写字母、小写字母、数字的出现次数
     */
    public static void length()
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int UpperCount = 0;
        int LowwerCount = 0;
        int NumCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char s = string.charAt(i);
            if (Character.isUpperCase(s)){
                UpperCount++;
            }
            if (Character.isLowerCase(s))
            {
                LowwerCount++;
            }
            if (Character.isDigit(s))
            {
                NumCount++;
            }
        }
        System.out.println(UpperCount + "\t"  + LowwerCount + "\t" + NumCount);
    }


    public static void arrToString(int[] arr) {
        if (arr == null) {
            System.out.println("");
        }
        if (arr.length == 0)
        {
            System.out.println("[]");
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
            {
                result  = result + arr[i];
            }else {
                result = result + arr[i] + ",";
            }
        }
        result = result + "]";
        System.out.println(result);
    }

    public static void arrReverse()
    {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String string = scanner.next();
        for (int i = string.length()-1; i >= 0 ; i--) {
            char temp = string.charAt(i);
            result = result + temp;
        }
        System.out.println(result);
    }

    /**
     * 金额转换:
     *      最多支持7位数
     */
    public static void NumCaptial()
    {
        String[] num  = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        Scanner scanner = new Scanner(System.in);
        int coin;
        while (true)
        {
            System.out.println("请输入金额： ");
            coin = scanner.nextInt();
            if (coin >= 0 && coin <= 9999999)
            {
                break;
            }else {
                System.out.println("金额无效，请重新输入");
            }
        }
        System.out.println("第一个:   " + coin);
        String moneyStr = "";
        while (true)
        {
            int ge = coin % 10;
            String captialNumber = num[ge];
            System.out.println(captialNumber);
            moneyStr = captialNumber + moneyStr;

            coin = coin / 10;

            if (coin == 0)
            {
                break;
            }
        }
        System.out.println("第二个:   " + moneyStr);
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println("第三个数据: "+moneyStr);
        String result = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);

    }


    /**
     * 手机号码屏蔽
     */
    public static void subString()
    {
        Scanner scanner = new Scanner(System.in);
        String phone;
        while (true)
        {
            System.out.println("请输入你的手机号码： ");
            phone = scanner.next();
            if (phone.length() != 11)
            {
                System.out.println("请重新输入你的手机号码：");
            }else {
                break;
            }
        }
        String startstring = phone.substring(0,3);
        String endstring = phone.substring(7);
        String result = startstring + "****" + endstring;
        System.out.println(result);

    }


}
