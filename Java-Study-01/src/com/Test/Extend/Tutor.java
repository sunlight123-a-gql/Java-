package com.Test.Extend;

/**
 * ClassName Tutor
 *
 * @Date2025/2/2814:33
 * @Create bysunlight
 */
public class Tutor extends Teacher{

    public Tutor() {
    }

    public Tutor(String id, String name, String workName) {
        super(id, name, workName);
    }

    @Override
    public void work() {
        System.out.println("负责助学");
    }
}
