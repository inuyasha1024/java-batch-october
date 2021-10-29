package com.sliconspectra.collectiontopic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTopic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
//
//        List<Integer> list2 = new ArrayList<>(list);
//        list2.addAll(list);
        list.contains(1);
        System.out.println(list.contains(1));

//        System.out.println(list.get(0));;
//        list.remove(0);
//        System.out.println(list.isEmpty());
    }
}
