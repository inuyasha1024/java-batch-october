package com.sliconspectra.java8topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionTopic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Optional<Integer> optional = list.stream().filter(num -> num >= 5).findAny();
        if(optional.isPresent()) {
            System.out.println(optional.get());
        }else {
            System.out.println("no element found");
        }

    }
}
