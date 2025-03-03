package com.Test.Bird;

/**
 * ClassName Dog
 *
 * @Date2025/2/2816:02
 * @Create bysunlight
 */
public class Dog extends Animal{

    @Override
    public void eat(String something) {
        System.out.println(getAge()+ "岁的"+ getColor() + "颜色的" + getName() + "两只前腿死死的抱住" + something + "啃吃");
    }

    public void lookHome()
    {
        System.out.println("狗狗看家");
    }
}
