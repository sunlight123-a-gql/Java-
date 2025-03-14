package com.Study9.Test1_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * ClassName Test
 *
 * @Date2025/3/923:58
 * @Create bysunlight
 */
public class Test {

    /**
     * 班级里面有N个学生，学生属性：姓名、年龄、性别
     * 实现随机点名
     */

    public static void main(String[] args) {
        test3();
    }

    private static void test1() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"范县","翻建","饭头","杜子腾","杜子娥","宋喝翻","猴笼图","朱怡群","源明雅");

        Random random = new Random();
        int index = random.nextInt(list.size());
        String s = list.get(index);
        System.out.println(s);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(list.get(0));
    }


    /**
     * 男生女生随机出，男生70%，女生30%
     */
    public static void test2()
    {
        ArrayList<Student> boyList = new ArrayList<>();
        ArrayList<Student> girlList = new ArrayList<>();
        Collections.addAll(boyList,new Student("小红",19,1),
                new Student("小红",19,1),
                new Student("宋小宝",19,1),
                new Student("扣吧老",19,1),
                new Student("狗冻死",19,1));

        Collections.addAll(girlList,
                new Student("小喇叭",19,0),
                new Student("泥巴",19,0),
                new Student("上岛咖",15,0));

        Random r = new Random();
        int index = r.nextInt() * 100;
        if (index >= 70)
        {
            System.out.println("抽取女生");
            Collections.shuffle(girlList);
            System.out.println(girlList.get(0));
        }else {
            System.out.println("抽取男生");
            Collections.shuffle(boyList);
            System.out.println(boyList.get(0));
        }
    }

    /**
     * 班级有5个学生
     * 被点到的学生不会再次被点到，如果全部都被点到，需要开启第二轮点名
     */
    public static void test3()
    {
        ArrayList<String>  strings = new ArrayList<>();
        ArrayList<String> st1 = new ArrayList<>();
        Collections.addAll(strings,"小明","小黄","小吕","小结","小管");
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            System.out.println("开启第" +i + "轮点名");
            for (int j = 0; j < strings.size(); j++) {
                while (true)
                {
                    int index = random.nextInt(strings.size());
                    String name = strings.get(index);
                    if (st1.contains(name))
                    {
                        continue;
                    }else {
                        st1.add(name);
                        System.out.println("第" + (j + 1) + "名，被点到的是" + name);
                        break;
                    }
                }
            }
            st1.clear();
        }
    }

}
