package com.Study13.Thread2;

/**
 * ClassName test
 *
 * @Date2025/3/1417:59
 * @Create bysunlight
 */
public class test {

    public static void main(String[] args) {

        Thread2 t1 = new Thread2();
        Thread2 t2 = new Thread2();

        Thread r1 = new Thread(t1);
        Thread r2 = new Thread(t2);

        r1.setName("线程1");
        r2.setName("线程2");
        r1.start();
        r2.start();

    }
}
