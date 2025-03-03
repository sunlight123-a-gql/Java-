package com.Test.Player;

/**
 * ClassName Player
 *
 * @Date2025/3/112:41
 * @Create bysunlight
 */
public abstract class Player extends Person{

    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    abstract void study();
}
