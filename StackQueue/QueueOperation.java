package StackQueue;

import java.util.*;

public class QueueOperation {
    public static void main (String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.size());
    }
}
