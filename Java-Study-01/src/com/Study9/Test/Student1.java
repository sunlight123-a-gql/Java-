package com.Study9.Test;

/**
 * ClassName Student1
 *
 * @Date2025/3/919:11
 * @Create bysunlight
 */
public class Student1 implements Comparable<Student1>{

    private String name;

    private int age;


    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student1 student) {


        //要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名同年龄视为同一人

        //this: 表示当前要添加的元素
        //0：表示已经在红黑树中存在的元素

        //返回值
        //负数： 表示当前要添加的元素是小的，存左边
        //正数： 表示要添加的元素是大的。存右边
        //0： 表示当前要添加的元素是已经存在的，舍弃

        int i = this.getAge() - student.getAge();
        i = i == 0? this.getName().compareTo(student.getName()):i;
        return i;
    }
}
