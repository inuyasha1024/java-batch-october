package com.sliconspectra.designpatterntopic.singletontopic;

enum SingletonEnum {
    INSTANCE;
}

public class Singleton {
    //1.create private static instance
    private static Singleton singleton;

    //2.create private constructor
    private Singleton() {

    }

    //3.create synchronized static method to provide instance
    public synchronized static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
            return singleton;
        }else {
            return singleton;
        }

    }

    //override clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }

    public static void main(String[] args) {
        Singleton singleton1 = getInstance();
        Singleton singleton2 = getInstance();


        System.out.println(singleton1 == singleton2);
    }
}
