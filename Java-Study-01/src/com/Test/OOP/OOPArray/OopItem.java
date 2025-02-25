package com.Test.OOP.OOPArray;

/**
 * ClassName OopItem
 *
 * @Date2025/2/2513:24
 * @Create bysunlight
 */
public class OopItem {


    private String brand;

    private double price;

    private String color;

    public OopItem() {
    }

    public OopItem(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }


    public String toString() {
        return "OopItem{name = " + brand + ", price = " + price + ", count = " + color + "}";
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
