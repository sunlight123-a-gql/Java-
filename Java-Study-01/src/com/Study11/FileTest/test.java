package com.Study11.FileTest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName test
 *
 * @Date2025/3/121:00
 * @Create bysunlight
 */
public class test {

    /**
     * 在当前模块下的aaa文件夹中创建一个a.text的文件
     */

    public static void createFile()
    {
        String path = "C:/Users/sunlight/Desktop/aaa/a.txt";

        try {
            File file = new File(path);
            File parentDir = file.getParentFile();
            if (parentDir != null && !parentDir.exists()) {
                if (parentDir.mkdirs()) {
                    System.out.println("父目录创建成功");
                } else {
                    System.out.println("父目录创建失败");
                    return;
                }
            }
            if (file.createNewFile()) {
                System.out.println("文件创建成功" + file.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 定义一个方法找某个文件夹中，是否有以avi结尾的电影
     */
    public static void exist(File file)
    {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getName().equals("avi"))
            {
                System.out.println("存在");
            }
        }
        return;
    }

    /**
     * 找到电脑但这个所有以avi结尾的电影(需要考虑子文件夹)
     */
    public static void haveAVI(File src)
    {
        File file = new File("C:\\");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile())
            {
                String name = file.getName();
                if (name.endsWith(".avi"))
                {
                    System.out.println(file1);
                }
            }else {
                haveAVI(file);
            }
        }
    }


    /**
     * 删除文件夹：
     * 包含文件夹下面的所有内容都需要删除  -- 采用递归方式
     *
     * 1.先找到文件夹下的内容
     * 2.如果是文件就删除
     * 3.如果是文件夹就递归
     * 4.删除自己
     * @param file
     */
    public static void deleteFile(File file)
    {
        File[] f = file.listFiles();
        for (File f1 : f) {
            if (f1.isFile())
            {
                f1.delete();
            }else {
                deleteFile(file);
            }
        }
        file.delete();
    }


    /**
     * 作用：统计一个文件夹的大小
     *
     * 参数：要统计的文件夹
     *
     * 返回值：统计之后的文件夹大小的结果
     */
    public static long getLen(File file)
    {
        long len = 0;
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile())
            {
                len += file1.length();
            }else {
                len = len + getLen(file1);
            }
        }
        return len;
    }


    public static Map<String,Integer> getCount(File src)
    {
        //定义集合来统计
        HashMap<String,Integer> hm = new HashMap<>();
        if (src.exists() && src.isDirectory()) {
            //进入文件夹
            File[] files = src.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    String[] arr = name.split("\\.");
                    if (arr.length >= 2) {
                        String endName = arr[arr.length - 1];
                        if (hm.containsKey(endName)) {
                            Integer count = hm.get(endName);
                            hm.put(endName, count + 1);
                        } else {
                            hm.put(endName, 1);
                        }
                    }
                } else {
                    Map<String, Integer> count = getCount(file);
                    for (Map.Entry<String, Integer> entry : count.entrySet()) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        hm.put(key, hm.getOrDefault(key, 0) + value);
                    }
                }
            }
        }
        return hm;
    }


    public static void main(String[] args) {
        File file = new File("C:\\Users\\sunlight\\Desktop\\Oracle课件");
        System.out.println(getLen(file));
    }


}
