package com.Study12.Test.Buffered;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName test
 *
 * @Date2025/3/1413:53
 * @Create bysunlight
 */
public class test {

    /**
     * 将出师表这个文件顺序恢复
     */
    public static void reCue() throws IOException {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader bi = new BufferedReader(new FileReader("Java-Study-01\\src\\com\\Study12\\Test\\Buffered\\csb.txt"));
        String len;
        while ((len = bi.readLine()) != null)
        {
           list.add(len);
        }
        bi.close();
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int i1 = Integer.parseInt(s1.split("\\.")[0]);
                int i2 = Integer.parseInt(s2.split("\\.")[0]);
                return i1 -i2;
            }
        });

        BufferedWriter bw = new BufferedWriter(new FileWriter("Java-Study-01\\src\\com\\Study12\\Test\\Buffered\\csb_sorted.txt"));
        // 使用 try-with-resources 语句自动关闭 FileWriter
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        reCue();
    }

}
