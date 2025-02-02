package StackQueue;

import java.util.*;

public class QueueUsingLinkedList {
    public static void main (String[] args) {
        /**Queue Can be implemented in Linked List in 2 Ways:
         * i - Add Last & Remove First {Better Approach}
         * ii- Add First & Remove Last {Costly}
         */
         
         LinkedList<Integer> queue = new LinkedList<>();
         queue.addLast(10);
         queue.addLast(20);
         queue.addLast(30);
         queue.addLast(40);
         
         System.out.println(queue.removeFirst());
         System.out.println(queue.removeFirst());
         System.out.println(queue.removeFirst());
    }
}