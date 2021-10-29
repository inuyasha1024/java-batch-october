package com.sliconspectra.collectiontopic.sorttopic;

import java.util.*;

class Student implements Comparable<Student> {
    Integer id;
    String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        if(this.id == student.id) {
            return this.name.compareTo(student.name);
        }else {
            return this.id - student.id;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class CollectionSort {
    public static void listSort() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(15);

        Collections.sort(list, new MyComparator());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void listSortStudent() {
        Student student1 = new Student(1, "Allen");
        Student student2 = new Student(2, "Tom");
        Student student3 = new Student(3, "Chen");
        Student student4 = new Student(2, "Chen");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.id == s2.id ? - s1.name.compareTo(s2.name) : s2.id - s1.id;
            }
        });

        System.out.println(students);
    }

    public static void hashmapSort() {
        Map<Integer, String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        map.put(1, "Allen");
        list.add(1);
        map.put(2, "Tom");
        list.add(2);
        map.put(3,"Chen");
        list.add(3);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer k1, Integer k2) {
                return map.get(k1).compareTo(map.get(k2));
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println("key = " + list.get(i) + "value = " + map.get(list.get(i)));
        }

    }

    public static void main(String[] args) {
        hashmapSort();
    }
}
