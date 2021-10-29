package com.sliconspectra.ooptopic.polymorphismtopic;

class SupperClass {
    public void method() {
        System.out.println("this is supper class method");
    }

}


interface Car {
    public void run();
}

class Toyota implements Car {
    public void run() {
        System.out.println("toyota is running");
    }
}

class Honda implements Car {
    public void run() {
        System.out.println("honda is running");
    }
}

public class PolymorphismTopic extends SupperClass {
    public void method1(String name) {
        System.out.println("this is the one parameter method");
    }

    public void method1() {
        System.out.println("this is the non parameter method");
    }

    @Override
    public void method() {
        System.out.println("this is child class method");
    }

    public void run(Car car) {
        car.run();
    }

    public static void main(String[] args) {
        Car car1 = new Toyota();
        Car car2 = new Honda();
        PolymorphismTopic polymorphismTopic = new PolymorphismTopic();
        polymorphismTopic.run(car2);

    }
}



