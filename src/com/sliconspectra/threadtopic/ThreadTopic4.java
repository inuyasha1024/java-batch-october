package com.sliconspectra.threadtopic;

import java.util.concurrent.*;

class MyThread5 implements Callable {

    @Override
    public Object call() throws Exception {
        return 2 + 3;
    }
}

public class ThreadTopic4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService fixThreadPool = Executors.newFixedThreadPool(1);
        Future<Integer> future = fixThreadPool.submit(new MyThread5());
        System.out.println(future.get());
        fixThreadPool.shutdown();
    }
}
