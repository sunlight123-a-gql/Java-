package com.Test.Player;

/**
 * ClassName basketballPalyer
 *
 * @Date2025/2/2820:41
 * @Create bysunlight
 */
public class basketballPalyer extends Player{

    public basketballPalyer() {
    }

    public basketballPalyer(String name, int age) {
        super(name, age);
    }

    @Override
    void study() {
        System.out.println("学习打篮球");
    }
}
