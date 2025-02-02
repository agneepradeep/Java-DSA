package StackQueue;

import java.util.*;

public class ReverseElementsInQueue {
    public static void main (String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        System.out.println(queue);
        reverseKElements(queue,3);
        System.out.println(queue);
    }
    public static void reverseKElements(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        int n = queue.size();
        
        for (int i = 0; i<k; i++) {
            stack.push(queue.remove());
        }
        for (int i = 0; i<k;i++) {
            queue.add(stack.pop());
        }
        for (int i = 0; i<n-k; i++) {
            queue.add(queue.remove());
        }
    }
}