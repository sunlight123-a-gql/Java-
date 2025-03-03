package com.Test.Player;

/**
 * ClassName teacher
 *
 * @Date2025/3/112:42
 * @Create bysunlight
 */
public abstract class teacher extends Person{

    public teacher() {
    }

    public teacher(String name, int age) {
        super(name, age);
    }

    abstract void teach();
}
