package com.Test.Player;

/**
 * ClassName basketballTeacher
 *
 * @Date2025/3/112:46
 * @Create bysunlight
 */
public class basketballTeacher extends teacher{
    public basketballTeacher() {
    }

    public basketballTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    void teach() {
        System.out.println("教别人打篮球");
    }
}
