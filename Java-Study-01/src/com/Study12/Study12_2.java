package com.Study12;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName Study12_2
 *
 * @Date2025/3/1412:05
 * @Create bysunlight
 */
public class Study12_2 {

    /**
     * 缓冲流：减少系统调用，提高性能
     *
     * 转换流：字符流和字节流之间的桥梁
     *  字符转换输入流
     *  字符转换输出流
     *作用：
     *  1.指定字符集读写数据
     *  2.字节流想要使用字符流中的方法
     *
     * Serializable:标记型接口
     *  一旦实现了这个接口，那么就表示当前的类可以被序列化
     *
     *
     *
     * 序列化流：
     *      序列化流： 把java中的对象写到本地文件当中
     *      反序列化流：把本地文件中的数据读到java当中
     *
     *细节：
     *  1.使用序列化流将对象写到文件时，需要让JavaBean类实现Serializable接口
     *     否则会出现NotSerializable异常
     *  2.序列化流写到文件中的数据是不能修改的，一旦修改就无法再次读回来了，
     *  3.序列化对象后，修改了JavaBean类，再次反序列化，会不会出现问题？
     *      会出现问题，抛出InvalidClassException
     *      原因是意难忘SerializableUID不一样，这个是一个文件标记符号，用于读取和存入数据的
     *      解决方案：被javaBean类添加serialVersionUID（序列号、版本号）
     *
     * transient：该关键字标记的成员不参与序列化过程
     *
     *
     *
     * 打印流： 不能读（从文件中）只能写（往文件当中）
     *
     *
     * 压缩流：
     *
     * Commons-io：有关IO操作的开源工具包，，
     *  提高IO流的开发效率
     */


    /**
     *利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
     */

    public static void ConvertStream() throws IOException {
        //1.字节流子啊读取中文的时候，是会出现乱码的，而字符流可以搞定
        FileInputStream fis = new FileInputStream("C://");
        InputStreamReader isr = new InputStreamReader(fis);

        //2.字节流里面是没有读取一整行的方法，只有字符缓冲流可以搞定
        BufferedReader br = new BufferedReader(isr);


        //最终写法
        BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("C://")));

        String s = br1.readLine();
        System.out.println(s);
    }

    /**
     * 1.创建对象
     * 2.创建序列化流的对象
     * 3.写出数据
     *      object.writeObject()
     */

}
