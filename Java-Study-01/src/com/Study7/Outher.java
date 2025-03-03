package com.Study7;

/**
 * ClassName Outher
 *
 * @Date2025/3/115:37
 * @Create bysunlight
 */
public class Outher {

    private static int a = 10;


    class Inner{

        private int a = 20;

        public void show(){

            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(getInstance());
            System.out.println(Outher.this.a);
            // Outer.this"获取了外部类对象的地址值
        }
    }

    public static int getInstance()
    {
        return a;
    }

}
