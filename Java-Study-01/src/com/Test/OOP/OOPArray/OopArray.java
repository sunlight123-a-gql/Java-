package com.Test.OOP.OOPArray;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName OopArray
 *
 * @Date2025/2/2513:22
 * @Create bysunlight
 */
public class OopArray {

    /**
     * 定义数组存储3个商品对象
     *  商品的属性： 商品的id、名字、价格、库存
     *  创建三个商品对象，并把商品对象存入到数组当中去
     */
    public static void main(String[] args) {
      /*  OopItem[] goods = new OopItem[3];
        OopItem g1 = new OopItem("001","华为手机",5999.0,100);
        OopItem g2 = new OopItem("002","保温杯",299,50);
        OopItem g3 = new OopItem("003","枸杞",12.9,200);

        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;

        for (int i = 0; i < goods.length; i++) {
            OopItem good = goods[i];
            System.out.println(good.getId() + good.getName() + good.getPrice() + good.getCount());
        }*/
        OopItem[] goods = new OopItem[3];
        for (int i = 0; i < goods.length; i++) {
            OopItem goodsItem = new OopItem();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的车子品牌：");
            String brand = scanner.next();
            goodsItem.setBrand(brand);
            System.out.println("请输入你的车子价格：");
            int price = scanner.nextInt();
            goodsItem.setPrice(price);
            System.out.println("请输入你的车子的颜色");
            String color = scanner.next();
            goodsItem.setColor(color);

            goods[i] = goodsItem;
        }
        for (int i = 0; i < goods.length; i++) {
            OopItem good = goods[i];
            System.out.println(good.getBrand() + good.getPrice() + good.getColor());
        }
    }



}
