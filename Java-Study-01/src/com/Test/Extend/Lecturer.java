package com.Test.Extend;

/**
 * ClassName Lecturer
 *
 * @Date2025/2/2814:33
 * @Create bysunlight
 */
public class Lecturer extends Teacher{

    public Lecturer() {
    }

    public Lecturer(String id, String name, String workName) {
        super(id, name, workName);
    }

    @Override
    public void work() {
        System.out.println("负责讲课");
    }
}
