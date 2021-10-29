package com.sliconspectra.java8topic;

@FunctionalInterface
interface MyInterface2 {
    public int getInt(int num1, int num2);
}


public class LambdaTopic {

    public int doubleInt(MyInterface2 myInterface2, int num1, int num2) {
        return myInterface2.getInt(num1,num2) * 2;
    }


    public static void main(String[] args) {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
