package com.Study13.Thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName test
 *
 * @Date2025/3/1422:00
 * @Create bysunlight
 */
public class test {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread3 t3 = new Thread3();
        FutureTask<Integer> ft = new FutureTask<>(t3);

        Thread t1 = new Thread(ft);
        t1.start();

        Integer integer = ft.get();
        System.out.println(integer);
    }

}
