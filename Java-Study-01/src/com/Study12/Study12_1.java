package com.Study12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * ClassName Study12_1
 *
 * @Date2025/3/1316:28
 * @Create bysunlight
 */
public class Study12_1 {

    /**
     * 在计算机中，任意数据都是以二进制的形式来存储的
     *
     * ASCII编码规则：不足八位的 前面补0，补齐8位
     * ASCII解码规则：直接转成十进制
     *
     * 存储英文，一个字节就可以了
     *
     *
     *GBK存储英文：
     *  1.查询GBK
     *  2.编码：不足八位，前面补0
     *
     *GBK存储中文：一个汉字两个字节存储
     *   规则：高位字节二进制一定以1开头，转成十进制之后是一个负数
     *  1.查询GBK
     *  2。编码规则：不需要变动
     *
     *
     * Unicode存储英文
     *  1.查询Unicode
     *  2.编码规则：
     *      UTF-8:用1~4个字节保存
     *          ASCII：1个字节
     *          中文：3个字节
     *      UTF-16:用2~4个字节保存
     *      UTF-32:固定使用四个字节保存
     *
     * 为什么会有乱码？
     *  1.读取数据时未读完整个汉字
     *  2.编码和解码时的方式不统一
     *
     * 字符流：
     *      字符流的底层其实是字节流
     *      字符流  = 字节流 + 字符集
     * 特点：
     *      输入流：一次读一个字节，遇到中文时，一次读多个字节
     *      输出流：底层会把数据按照指定的编码方式进行编码，变成字节再写到文件中
     *
     * 字符流原理解析：
     * 1.创建字符输入流对象
     *      底层： 关联文件，并创建缓冲区（长度为8192的字节数组）
     * 2.读取数据
     *      底层：
     *             1.判断缓冲区中是否有数据可以读取
     *             2.缓冲区没有数据：
     *                  就从文件中获取数据，装到缓冲区，每次尽可能装满缓冲区
     *                  如果文件中也没有数据了，返回-1
     *             3.缓冲区有数据：就直接从缓冲区读取
     *                  空参的read方法：一次读取一个字节，遇到中文一次读取多个字节，把字节解码并转成十进制返回
     *
     *
     * 字符集：
     */



    //拷贝文件夹操作
    public static void test() throws IOException {
        File file = new File("C://");
        File src = new File("C://");
        copydir(file,src);
    }

    private static void copydir(File src, File dest) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile())
            {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) !=  -1)
                {
                    fos.write(bytes,0,len);

                }
                fos.close();
                fis.close();
            }else {
                copydir(file,new File(dest,file.getName()));
            }
        }
    }

    /**
     *加密解密操作：
     *  1。和拷贝的操作相差无几
     *  2.获取的字符集，进行一个异或运算（解密也是这样的）
     */


    /**
     * 修改文件当中的数据顺序,将文件当中的数据排序之后存入新的文件当中
     */
    public static void sort() throws IOException {
        /*FileReader fr = new FileReader("Java-Study-01\\src\\com\\Study12\\aaa");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1)
        {
            sb.append((char)ch );
        }
        fr.close();
        System.out.println(sb);*/

        /*String s = sb.toString();
        String[] split = s.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s1 : split) {
            int i = Integer.parseInt(s1);
            list.add(i);
        }
        Collections.sort(list);
        FileWriter fw = new FileWriter("Java-Study-01\\src\\com\\Study12\\bbb");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() -1)
            {
                fw.write(list.get(i) + "");
            }else {
                fw.write(list.get(i) + "-");
            }
        }
        fw.close();
        */
        FileReader fr = new FileReader("Java-Study-01\\src\\com\\Study12\\aaa");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1)
        {
            sb.append((char)ch );
        }
        fr.close();
        System.out.println(sb);
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] arr = Arrays.stream(sb.toString()
                        .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        FileWriter fw = new FileWriter("Java-Study-01\\src\\com\\Study12\\bbb");
        String replace = Arrays.toString(arr).replace(", ", "-");
        //Arrays.toString 方法是 Java 中用于将数组转换为字符串表示的方法，它的实现会在数组元素之间添加逗号和一个空格
        String substring = replace.substring(1, replace.length() - 1);
        fw.write(substring);
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        sort();
    }


}
