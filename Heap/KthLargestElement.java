package Heap;

import java.util.*;

public class KthLargestElement {
    public static void main (String[] args) {
        /**Approach 1 - Sort the Array & Return the (n-k)th element. T=O(nlogn)
          *Approach 2 - Min Prority Queue of size k containing k largest elements.
          * remove the minimum of k elements and i.e. the kth largest element.
          * T=O(nlogk).
          */
        int[] arr = {10, 1, 4, 7, 2, 13, 3};
        int k = 3;
        kthLargestElement(k,arr);
    }
    
    public static void kthLargestElement(int k, int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //Smallest one with highest priority.
        int i = 0;
        while (i<k) {
            pq.add(arr[i]);
            i++;
        }
        
        while (i < arr.length) {
            if (arr[i] > pq.peek()) {
                pq.remove();
                pq.add(arr[i]);
            }
            i++;
        }
        System.out.println(pq);
    }
}