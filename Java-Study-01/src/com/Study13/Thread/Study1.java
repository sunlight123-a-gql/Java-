package com.Study13.Thread;

/**
 * ClassName Study1
 *
 * @Date2025/3/1417:54
 * @Create bysunlight
 */
public class Study1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
