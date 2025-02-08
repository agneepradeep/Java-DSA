package Heap;

import java.util.*;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        /**Priority Queue: Removes Highest Priority Element {Score List}
          *By Default: Lower nos to be Remove First {Rank List}
          */
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(50);
        pq.add(25);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        
        //O(logn)
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        
        //O(1)
        System.out.println(pq.peek());
        
        //O(1)
        System.out.println(pq.size());
    }
}
