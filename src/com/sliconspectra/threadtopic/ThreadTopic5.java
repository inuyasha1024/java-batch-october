package com.sliconspectra.threadtopic;

public class ThreadTopic5 {
    //non - thread safe
    public static final Integer num3 = 15;
    //class context
    public Integer num = 5;


    public void method() {
        //thread safe
        Integer num2 = 10;
    }
}
