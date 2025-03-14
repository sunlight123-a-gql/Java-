package com.Project.Test.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * ClassName PockerGame
 *
 * @Date2025/3/100:52
 * @Create bysunlight
 */
public class PockerGame {


    static ArrayList<Integer> list = new ArrayList<>();

    //如果原始数据的规律非常复杂，我们可以先手动排序让每一个数据跟唯一的序号产生对应关系
    //序号就是数字，规律非常简单，后续的操作都可以以序号为准
    static HashMap<Integer,String> hashMap = new HashMap<>();


    static {
        //准备牌
        String[] color = {"♣","♦","♥","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //序号
        int serialNumber = 1;
        for (String n : number) {
            for (String c : color) {
            //依次表示每一个花色
                hashMap.put(serialNumber,c+n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hashMap.put(serialNumber,"小王");
        list.add(serialNumber);
        serialNumber++;
        hashMap.put(serialNumber,"大王");
        list.add(serialNumber);

        System.out.println(hashMap);
    }

    /**
     * 完成控制台的三步：
     *      1.准备牌
     *      2.洗牌
     *      3.发牌
     *      4.整理牌
     */

    public PockerGame()
    {
        System.out.println(list);
        //洗牌
        Collections.shuffle(list);
        System.out.println(list);

        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        //遍历牌盒得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            if (i <= 2)
            {
                lord.add(serialNumber);
                continue;
            }

            //给三个玩家轮流发牌
            if (i % 3 == 0)
            {
                player1.add(serialNumber);
            }else if (i % 3 == 1)
            {
                player2.add(serialNumber);
            }else{
                player3.add(serialNumber);
            }
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(lord);

        //看牌
        lookPocker("大帅比",player1);
        lookPocker("杠脑壳",player2);
        lookPocker("蛋筒",player3);
    }


    public void lookPocker(String name,TreeSet<Integer> list)
    {
        System.out.print(name + ":" + "\t");
        for (int serialNumber : list) {
            String pocker = hashMap.get(serialNumber);
            System.out.print(pocker + "\t");
        }
        System.out.println();
    }

}
