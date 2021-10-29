package com.sliconspectra.exceptiontopic;

public class ExceptionTopic {
    public static void exceptionMethod() {
        int a = 1 / 0;
        System.out.println(a);
    }

    public static void exceptionMethod2() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            exceptionMethod2();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }finally {
            System.out.println("catch the exception");
        }
    }
}
