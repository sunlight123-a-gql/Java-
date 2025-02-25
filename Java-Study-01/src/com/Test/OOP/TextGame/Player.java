package com.Test.OOP.TextGame;

import java.util.Random;

/**
 * ClassName Player
 *
 * @Date2025/2/2412:45
 * @Create bysunlight
 */
public class Player {

    private String name;

    private int hp;

    public Player()
    {}

    public Player(String name,int hp)
    {
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attack(Player player)
    {
        Random random = new Random();

        int hurt = random.nextInt(20) + 1;
        int currentHp = player.hp;
        int resultHp = currentHp - hurt;
        resultHp = Math.max(resultHp, 0);
        player.setHp(resultHp);
        System.out.println(this.name + "举起了拳头，打了" + player.name + "一下，造成了" + hurt + "点伤害，" + player.name + "还剩下" + resultHp + "点血量");
    }

}
