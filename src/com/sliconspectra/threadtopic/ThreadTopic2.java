package com.sliconspectra.threadtopic;

class MyThread3 implements Runnable{
    private boolean isRunning = true;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }
}

public class ThreadTopic2 {


    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        new Thread(myThread3).start();

        while (true) {
            System.out.println("running is : "+ myThread3.isRunning());
            if(!myThread3.isRunning()){
                System.out.println("running is : "+ myThread3.isRunning());
                break;
            }
        }
    }
}
