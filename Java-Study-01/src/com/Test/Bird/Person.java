package com.Test.Bird;

import com.Test.Extend.Buyer;

/**
 * ClassName Person
 *
 * @Date2025/2/2816:06
 * @Create bysunlight
 */
public class Person {

    private String name;

    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal,String something)
    {
        System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + animal.getColor() + "的" + animal.getAge() + "岁的" + animal.getName());
        animal.eat(something);
        if (animal instanceof  Dog)
        {
            Dog d = (Dog) animal;
            d.lookHome();
        }
        if (animal instanceof Brild)
        {
            Brild b = (Brild) animal;
            b.catchMouse();
        }
    }

}
