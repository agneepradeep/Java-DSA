package Recursion;

import java.util.*;

public class FindElement {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
        }
        int x = read.nextInt();
        
        int index = findFirstIndexRecursively(arr, 0, x);
        if (index == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at Index: " + index);
        }
        read.close();
    }
    
    public static int findFirstIndexRecursively(int[] arr, int i, int x) {
        if (i == arr.length) {
            return -1; // Base case: element not found
        }
        if (arr[i] == x) {
            return i; // Element found
        }
        return findFirstIndexRecursively(arr, i + 1, x); // Recur for next index
    }
}

