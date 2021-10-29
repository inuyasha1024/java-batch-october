package com.sliconspectra.java8topic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTopic {
    public void threadPoolMethod() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Integer> future = executorService.submit(() -> 2);
        System.out.println(future.get());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new FutureTopic().threadPoolMethod();
    }
}
