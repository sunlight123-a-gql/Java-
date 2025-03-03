package com.Test.Player;

/**
 * ClassName pingPongTeacher
 *
 * @Date2025/3/112:49
 * @Create bysunlight
 */
public class pingPongTeacher extends teacher implements english{

    public pingPongTeacher() {
    }

    public pingPongTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnginsh() {
        System.out.println("说英语");
    }

    @Override
    void teach() {
        System.out.println("教别人打乒乓球");
    }
}
