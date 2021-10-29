package com.sliconspectra.java8topic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeachTopic {

    public void foreachMethod() {
        Map<String, Integer> map = new HashMap<>();
        map.put("j", 1);
        map.put("k", 2);
        map.put("g", 3);
        map.put("f", 4);
        map.put("d", 5);

//        map.forEach((k,v) -> {
//            System.out.println("key: " +k);
//            System.out.println("value: " +v);
//        });

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new ForeachTopic().foreachMethod();
    }

}
