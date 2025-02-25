package com.Test.OOP.TextGame;

/**
 * ClassName KO
 *
 * @Date2025/2/2412:47
 * @Create bysunlight
 */
public class KO {



    public static void main(String[] args) {
        Player player1 = new Player("乔峰",200);
        Player player2 = new Player("鸠摩智",200);

        //开始格斗，回合制游戏
        while (true)
        {
            //player1攻击player2
            player1.attack(player2);
            //判断血量是否见底
            if (player2.getHp() == 0)
            {
                System.out.println(player1.getName() + "K.O了" + player2.getName());
                break;
            }

            player2.attack(player1);
            if (player1.getHp() == 0)
            {
                System.out.println(player2.getName() + "K.O了" + player1.getName());
                break;
            }
        }
    }
}
