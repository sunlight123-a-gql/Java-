package com.Test.Player;

/**
 * ClassName pingPongPlayer
 *
 * @Date2025/3/112:47
 * @Create bysunlight
 */
public class pingPongPlayer extends Player implements english{
    public pingPongPlayer() {
    }

    public pingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    void study() {
        System.out.println("学习打乒乓球");
    }

    @Override
    public void speakEnginsh() {
        System.out.println("学习英语");
    }

}
