package com.Project.Test.doudizhu.util;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {

    public static String getCode(){

        //自己练习
        //创建一个集合添加所偶的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
        }
        for (int i = 0; i < 26; i++) {
            list.add((char)('A' + i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        //要随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            stringBuilder.append(c);
        }
        int randomNum = r.nextInt(10);
        stringBuilder.append(randomNum);
        return stringBuilder.toString();


    }
}