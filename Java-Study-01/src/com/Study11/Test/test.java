package com.Study11.Test;

import java.util.Scanner;

/**
 * ClassName test
 *
 * @Date2025/3/120:14
 * @Create bysunlight
 */
public class test {

    /**
     * 键盘录入自己心仪的女朋友姓名和年龄
     * 姓名的长度在3和10之间
     * 年龄的范围在18~40之间
     * 超出这个范围是异常数据不能赋值，需要重新输入，一直到录入正确为止
     *
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Friend friend = new Friend();
        while (true) {
            try {
                System.out.println("请输入你的姓名");
                String name = scanner.nextLine();
                friend.setName(name);
                System.out.println("请输入你的年龄");
                int age = scanner.nextInt();
                friend.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入数字");
                continue;
            }catch (RuntimeException e) {
                System.out.println("姓名的长度或者年龄的范围有误");
                continue;
            }
        }
        System.out.println(friend);


    }

}
