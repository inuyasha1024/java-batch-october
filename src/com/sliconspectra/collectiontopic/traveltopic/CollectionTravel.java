package com.sliconspectra.collectiontopic.traveltopic;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.*;

public class CollectionTravel {
    public static void listTravel() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(15);
        //List<int> list2 = new ArrayList<>();

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for(Integer i : list) {
//            list.remove(i);
//        }

        Iterator<Integer> iterator = list.iterator();
        while ((iterator.hasNext())) {
            Integer i = iterator.next();
            iterator.remove();
        }
    }

    public static void hashMapTravel() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Allen");
        map.put(2, "Tom");
        map.put(3,"Chen");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("key = " + entry.getKey() + " " + "value = " + entry.getValue());
        }


    }

    public static void main(String[] args) {
        hashMapTravel();
    }
}
