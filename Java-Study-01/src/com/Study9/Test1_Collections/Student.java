package com.Study9.Test1_Collections;

/**
 * ClassName Student
 *
 * @Date2025/3/923:59
 * @Create bysunlight
 */
public class Student {

    private String name;

    private int age;

    private int sex;


    public Student() {
    }

    public Student(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    /**
     * 获取
     * @return sex
     */
    public int getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(int sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
}
