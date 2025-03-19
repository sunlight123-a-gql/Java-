package com.Study13.Thread2;

/**
 * ClassName Thread2
 *
 * @Date2025/3/1417:59
 * @Create bysunlight
 */
public class Thread2 implements Runnable {


    /**
     * 多线程的第二种实现方式：
     */

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " " + i);
        }
    }

}
