package com.Test.Animal;

/**
 * ClassName Animal
 *
 * @Date2025/2/2812:00
 * @Create bysunlight
 */
public class Animal {

    private String name;

    private String hobby;

    public Animal() {
        System.out.println("被执行了");
    }

    public Animal(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }


    public void Eat(){

    }

    public void drink(){

    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
