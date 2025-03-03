package com.Test.Extend;

/**
 * ClassName Teacher
 *
 * @Date2025/2/2814:29
 * @Create bysunlight
 */
public class Teacher extends Employee{


    private String workName;

    public Teacher() {
        System.out.println("教学专员");
    }

    public Teacher(String id, String name, String workName) {
        super(id, name);
        this.workName = workName;
    }

    @Override
    public void work() {
        System.out.println("负责教学工作");
    }
}
