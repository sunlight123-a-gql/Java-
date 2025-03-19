package com.Study13.Thread3;

import java.util.concurrent.Callable;

/**
 * ClassName Thread3
 *
 * @Date2025/3/1422:00
 * @Create bysunlight
 */
public class Thread3 implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
