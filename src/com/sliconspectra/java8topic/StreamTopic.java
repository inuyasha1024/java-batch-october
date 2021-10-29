package com.sliconspectra.java8topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamTopic {
    public void filterMethod() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> listNew = list.stream().filter(num -> !(num % 2 == 0)).collect(Collectors.toList());
        System.out.println(listNew);
        System.out.println("----------------------------------");
        System.out.println(list);
    }

    public void mapMethod() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.stream().map(num -> {
            System.out.println(num);
            return num;
        }).collect(Collectors.toList());
    }

    public void joinMethod() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        String res = list.stream().collect(Collectors.joining("+"));
        System.out.println(res);
    }

    class Person{
        String gender;
        String name;

        public Person(String gender, String name) {
            this.gender = gender;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "gender='" + gender + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public void groupByMethod() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("M", "J"));
        list.add(new Person("F", "K"));
        list.add(new Person("F", "H"));
        list.add(new Person("M", "D"));
        list.add(new Person("F", "E"));

        Map<String, Integer> map =
                list.stream().collect(Collectors.groupingBy(person -> person.gender, Collectors.summingInt(person -> 1)));

        System.out.println(map);
    }



    public static void main(String[] args) {
        new StreamTopic().groupByMethod();

    }
}
