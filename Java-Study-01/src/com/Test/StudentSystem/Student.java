package com.Test.StudentSystem;

/**
 * ClassName Student
 *
 * @Date2025/2/2720:23
 * @Create bysunlight
 */
public class Student {


    private String id;

    private String name;

    private int age;

    private String address;

    public Student() {
    }

    public Student(String id, String name, int age,String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }

}
