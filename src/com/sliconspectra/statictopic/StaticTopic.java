package com.sliconspectra.statictopic;

public class StaticTopic {
    public  final static String SITE_URL = "www.apple.com";

    static String str1 = "123";

    public static void test() {}

    public static void main(String[] args) {
        //StaticTopic st = new StaticTopic();
        System.out.println(str1);
        test();
    }
}
