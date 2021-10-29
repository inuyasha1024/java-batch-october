package com.sliconspectra.java8topic;

interface MyInterace {
    public static int number = 1;

    public void method1();

    //interface can have nonabstract static method
    public static void method2(){

    }

    //interface can have nonabstract default method
    public default void method3() {
        System.out.println("this is default method");
    }
}


public class InterfaceTopic implements MyInterace {
    @Override
    public void method1() {

    }

//    @Override
//    public void method3() {
//        System.out.println("this is override method");
//    }

    public static void main(String[] args) {
        MyInterace interace = new InterfaceTopic();
        interace.method3();
    }
}
