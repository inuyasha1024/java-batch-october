package com.sliconspectra.threadtopic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

class Person {
    private String id;
    private String name;
// getter, setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ThreadTopic6 {

    public static void main(String[] args) {
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {		//执行耗时任务
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "glz";
        });	//获取结果
        System.out.println("main method");
        System.out.println("test");
        System.out.println(cf.join());

        List<Person> list = new ArrayList<>();
        list.add(new Person("1", "j"));
        list.add(new Person("2", "k"));
        list.add(new Person("3", "l"));
        list.add(new Person("3", "m"));

        Map<String, List<Person>> map = list.stream().collect(Collectors.groupingBy(Person::getId, Collectors.toList()));
        System.out.println(map);
    }
}
