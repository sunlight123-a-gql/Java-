package com.Test.OOP.StudentTest;

/**
 * ClassName Student
 *
 * @Date2025/2/2519:16
 * @Create bysunlight
 */
public class Student {


    private String id;

    private String name;

    private int old;


    public Student() {
    }

    public Student(String id, String name, int old) {
        this.id = id;
        this.name = name;
        this.old = old;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
     * @return old
     */
    public int getOld() {
        return old;
    }

    /**
     * 设置
     * @param old
     */
    public void setOld(int old) {
        this.old = old;
    }
}
