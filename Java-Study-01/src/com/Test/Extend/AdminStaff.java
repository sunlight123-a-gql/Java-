package com.Test.Extend;

/**
 * ClassName AdminStaff
 *
 * @Date2025/2/2814:33
 * @Create bysunlight
 */
public class AdminStaff extends Employee{

    private String workName;

    public AdminStaff() {
        System.out.println("行政专员");
    }

    public AdminStaff(String id, String name, String workName) {
        super(id, name);
        this.workName = workName;
    }

    @Override
    public void work() {
        System.out.println("负责行政方面工作");
    }
}
