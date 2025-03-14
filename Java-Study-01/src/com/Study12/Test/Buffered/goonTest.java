package com.Study12.Test.Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName goonTest
 *
 * @Date2025/3/1414:34
 * @Create bysunlight
 */
public class goonTest {

    /**
     * 软件运行次数：
     *
     *  当程序运行超过三次给出提示，本软件只能免费使用3次，欢迎您注册会员后继续使用
     *      第一次使用欢迎使用本软件，第一次使用免费
     *      第一次使用欢迎使用本软件，第二次使用免费
     *      第一次使用欢迎使用本软件，第三次使用免费
     *      第一次使用   本软件只能免费使用三次，欢迎您注册会员后继续使用
     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Java-Study-01\\src\\com\\Study12\\Test\\Buffered\\count"));
        int count  = Integer.parseInt(br.readLine());
        System.out.println(count);
        br.close();
        if (count >= 3)
        {
            System.out.println("本软件只能免费使用3次，欢迎注册会员后使用");
        }else {
            System.out.println("欢迎使用本软件，第" + count + "次免费使用");
        }
        count++;
        BufferedWriter bw = new BufferedWriter(new FileWriter("Java-Study-01\\src\\com\\Study12\\Test\\Buffered\\count"));
        bw.write(count + "");
        bw.close();

    }

}
