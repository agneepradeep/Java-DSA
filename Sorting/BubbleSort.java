package Sorting;

import java.util.*;

public class BubbleSort {
    public static void main (String[] args) {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i<n; i++) {
            arr[i] = read.nextInt();
        }
        System.out.println("Input: "+Arrays.toString(arr));
        bubbleSorting(arr);
    }
    
    public static void bubbleSorting(int[] arr) {
        int swapCount;
        do {
            swapCount = 0;
            
            for (int i = 0; i<arr.length-1; i++) {
                if (arr[i] <= arr[i+1]) {
                    continue;
                } else {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapCount++;
                }
            }
        } while (swapCount > 0);
        
        System.out.println("Output: "+Arrays.toString(arr));
    }
}