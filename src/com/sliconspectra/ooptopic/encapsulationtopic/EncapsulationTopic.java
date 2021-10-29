package com.sliconspectra.ooptopic.encapsulationtopic;


class Test {
    private int a = 1;
    public int b = 2;
    protected int c = 3;
    //default
    int d = 4;
    public void test1() {
        Test test = new Test();
        System.out.println(test.a);

    }
}

public class EncapsulationTopic {

    int e = 5;
    protected int f = 6;

    public void test1() {
        Test test = new Test();
        System.out.println(test.b);
        System.out.println(test.c);
        System.out.println(test.d);
    }
}
