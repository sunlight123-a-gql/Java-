package com.Study9.Test;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * ClassName Test
 *
 * @Date2025/3/723:51
 * @Create bysunlight
 */
public class Test {

    /**
     * 创建一个HashMap集合，存储三个键值对元素，进行遍历
     * 要求：同姓名，同年龄认为是同一个学生
     */
    public static void HashMapTest1()
    {
        HashMap<Student,String> studentStringHashMap = new HashMap<>();
        Student student1 = new Student("小明",15);
        Student student2 = new Student("小黄",18);
        Student student3 = new Student("小明",15);
        studentStringHashMap.put(student1,"山东");
        studentStringHashMap.put(student2,"东北");
        studentStringHashMap.put(student3,"江苏");

        studentStringHashMap.forEach((Student student, String s) -> {
            System.out.println(student.getName() + " ---" + student.getAge() + "---" + s);
            }
        );
    }


    public static void main(String[] args) {
        HashMapTest1();
    }

}
