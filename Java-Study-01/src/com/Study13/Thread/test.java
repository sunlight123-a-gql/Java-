package com.Study13.Thread;

/**
 * ClassName test
 *
 * @Date2025/3/1417:55
 * @Create bysunlight
 */
public class test {
    public static void main(String[] args) {
        Study1 t1 = new Study1();
        Study1 t2 = new Study1();
        //开启线程
        t1.start();
        t2.start();
    }
}
