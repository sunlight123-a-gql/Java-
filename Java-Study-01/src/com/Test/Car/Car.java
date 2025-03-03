package com.Test.Car;

/**
 * ClassName Car
 *
 * @Date2025/3/113:48
 * @Create bysunlight
 */
public class Car {   //外部类

    private String carName;

    private int carAge;

    class Engine{    //内部类:表示的事物是外部类的一部分，内部类单独出现没有任何意义
        String engineName;
        int engineAge;
    }

}
