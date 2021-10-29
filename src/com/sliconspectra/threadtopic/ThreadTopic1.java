package com.sliconspectra.threadtopic;

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("class : Mythred: " + Thread.currentThread().getName());
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("class : Mythred1: " + Thread.currentThread().getName());
    }
}

public class ThreadTopic1 {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        new Thread(new MyThread2()).start();
        thread1.interrupt();
//        thread1.wait();
//        thread1.notify();
//        Thread.sleep(1000);

        System.out.println("class : main: " + Thread.currentThread().getName());
    }
}
