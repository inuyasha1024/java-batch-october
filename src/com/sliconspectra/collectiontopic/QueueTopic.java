package com.sliconspectra.collectiontopic;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTopic {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        System.out.println(queue.peek());
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
