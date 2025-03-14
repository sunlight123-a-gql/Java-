package com.Study12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName Study12
 *
 * @Date2025/3/1314:08
 * @Create bysunlight
 */
public class Study12 {

    /**
     * IO：用于读写文件中的数据,是存储和读取数据的解决方案
     *
     * IO流的分类：
     *      流的方向：
     *          1.输出流
     *          2.输入流
     *      操作文件类型：
     *          1.字符流：纯文本文件
     *              Reader
     *              Writer
     *          2.字节流：所有类型文件
     *              InputStream
     *              OutPutStream
     *
     *
     *  FileOutPutStream：
     *      操作本地文件的字节输出流，可以把程序中的数据写到本地文件当中
     *  书写步骤：
     *      1.创建字节输出流对象
     *          细节：
     *              1.参数是字符串表示的路径或者File对象都是可以的
     *              2.如果文件不存在会创建一个新的文件，但是要保证父路径是存在的
     *              3.如果文件已经存在，则会清空文件
     *      2.写数据
     *          细节：
     *              write的参数是整数，但是实际上写到本地文件的是ASCII码对应的字符
     *      3.释放资源
     *          细节：
     *              每次使用完流之后都要释放资源
     *
     * 写数据的三种方式
     *  1.write(int b)：一次写一个字节数据
     *  write（byte[] b）：一次写一个字节数组的数据
     *  write(byte[] b,int off,int len) 一次写一个字节数组的部分数据
     *
     *
     *
     *FileInPutStream：
     *      操作本地文件的字节输入流，可以把本地文件中的数据读取到程序当中去
     *
     * 书写步骤：
     *      1.创建字节输入流对象
     *          细节：
     *              1.如果文件不存在，直接报错
     *      2.读数据
     *          1.一次读一个字节，读出来的是数据在ASCII上对应的数字
     *          2.读到文件末尾了，read返回-1；
     *
     *          a.read():每调用一次read方法，就读取一次数据。
     *      3.释放资源
     *
     *文件拷贝： 一次只读写一个字节
     *      int b;
     *      while((b = fis.read()) != -1)
     *      {
     *          fos.write(b);
     *      }
     *     IO流：若拷贝的文件过大，速度慢
     */


    public static void OutputStream() throws IOException {
        String number = "1234";
        FileOutputStream fileOutputStream = new FileOutputStream("Java-Study-01\\src\\com\\Study12\\aaa");
        fileOutputStream.write(number.getBytes(),0,2);
        fileOutputStream.close();
    }


    public static void InputStream() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("Java-Study-01\\src\\com\\Study12\\aaa" );
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void copy() throws IOException {

        long start = System.currentTimeMillis();
        FileInputStream fit = null;
        FileOutputStream fot = null;
        try {
            fit = new FileInputStream("Java-Study-01\\src\\com\\Study12\\aaa" );
            fot = new FileOutputStream("Java-Study-01\\src\\com\\Study12\\ccc");
            int len;
            byte[] bytes = new byte[1024*1024*5];
            while ((len = fit.read(bytes)) != -1)
            {
                fot.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fot.close();
            fit.close();
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }
    }


    public static void main(String[] args) throws IOException {
        copy();

    }

}
