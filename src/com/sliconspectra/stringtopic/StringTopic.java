package com.sliconspectra.stringtopic;

public class StringTopic {

    public static void stringTest() {
        String stringA = "123";
        String stringB = "123";

        String stringC = new String("123");
        String stringD = "4567890";
        String stringE = "ab,cd,e";
//        System.out.println(stringA == stringB);
//        System.out.println(stringA == stringC);
//        System.out.println(stringA.equals(stringB));
//        System.out.println(stringA.equals(stringC));

//        System.out.println(stringA.compareTo(stringD));

        //can not get index 4
//        System.out.println(stringD.substring(1, 4));

//        System.out.println(stringE.toUpperCase());
//        String[] strs = stringE.split(",");
//        for(String str : strs) {
//            System.out.println(str);
//        }

//        System.out.println(stringA.concat(stringD));

//        for (int i = 0; i < stringE.length(); i++) {
//            System.out.println(stringE.charAt(i));
//        }
        for(char a : stringE.toCharArray()) {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        stringTest();
    }
}
