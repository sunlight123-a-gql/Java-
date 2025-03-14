package com.Study12.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName test_OutPutStream
 *
 * @Date2025/3/1314:48
 * @Create bysunlight
 */
public class test_OutPutStream {


    /**
     * 换行写   \r\n  先回车在换行
     *
     * 续写  :
     *      如果需要续写，打开续写开关就可以了
     *      开关的位置：创建对象的第二个参数
     *      默认是false，表示关闭续写，此时创建对象不会清空文件
     *      手动传递true，表示打开续写，此时创建对象不会清空文件
     */
    public static void outStream() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Java-Study-01\\src\\com\\Study12\\aaa");
        String name = "小帅";
        fileOutputStream.write(name.getBytes());
        String wrap = "\r\n";
        fileOutputStream.write(wrap.getBytes());
        String str2 = "最帅";
        fileOutputStream.write(str2.getBytes());
        fileOutputStream.close();
    }
    public static void outStream1() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Java-Study-01\\src\\com\\Study12\\aaa",true);
        String name = "没我帅";
        fileOutputStream.write(name.getBytes());
        fileOutputStream.close();
    }



    public static void main(String[] args) throws IOException {
        outStream1();
    }

}
