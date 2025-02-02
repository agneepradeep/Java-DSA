package StackQueue;

import java.util.*;

public class StackUsingLinkedList {
    public static void main (String[] args) {
        /**Stack can be inplemented in a linked list in 2 ways
          *i - Add Last & Remove Last {Expensive Operation}
          *ii - Add First & Remove First {Better Approach}
          */
          
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addFirst(10);
        stack.addFirst(20);
        stack.addFirst(30);
        
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
    }
}