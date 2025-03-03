package com.Test.Bird;

/**
 * ClassName Brild
 *
 * @Date2025/2/2816:04
 * @Create bysunlight
 */
public class Brild extends Animal{

    @Override
    public void eat(String something) {
        System.out.println(getAge()+ "岁的"+ getColor() + "颜色的" + getName() + "眯着眼睛侧着头吃着" + something);
    }

    public void catchMouse()
    {
        System.out.println("猫抓老鼠");
    }
}
