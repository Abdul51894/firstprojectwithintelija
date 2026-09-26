package com.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {

    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(2);
        for(int i = 1; i <= 10; i++) {
            int taskId = i;
            ex.execute(
                    () ->{
                        System.out.println("Task " + taskId + " is running in thread " + Thread.currentThread().getName());
                    }
            );
        }
        ex.shutdown();
    }
}
