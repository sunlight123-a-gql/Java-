package com.Test.Bird;

/**
 * ClassName Test
 *
 * @Date2025/2/2816:07
 * @Create bysunlight
 */
public class Test {

    public static void main(String[] args) {
        Person person1 = new Person("老王",30);
        Person person2 = new Person("老李",25);
        Animal animal = new Dog();
        animal.setAge(2);
        animal.setName("狗");
        animal.setColor("黑");
        Animal animal1 = new Brild();
        animal1.setAge(2);
        animal1.setName("猫");
        animal1.setColor("灰");
        person1.keepPet(animal,"骨头");
        person1.keepPet(animal1,"鱼");
    }

}
