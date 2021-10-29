package com.sliconspectra.threadtopic;

class Num{
    int num = 10;

    public synchronized void decreaseNum() {
        num --;
    }
}

class MyThread4 implements Runnable{
    Num num;
    public MyThread4(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
         {
            while (num.num >= 0) {
                    num.decreaseNum();
                    System.out.println(Thread.currentThread().getName() + " num value :"+ num.num);

            }
        }
    }
}

public class ThreadTopic3 {
    public static void main(String[] args) {
        Num num = new Num();
        new Thread(new MyThread4(num)).start();
        new Thread(new MyThread4(num)).start();
        new Thread(new MyThread4(num)).start();
        new Thread(new MyThread4(num)).start();
    }
}
