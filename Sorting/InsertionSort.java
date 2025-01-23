package Sorting;

import java.util.*;

public class InsertionSort {
    public static void main (String[] args) {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i<n; i++) {
            arr[i] = read.nextInt();
        }
        System.out.println("Input: "+Arrays.toString(arr));
        insertionSorting(arr);
        read.close();
    }
    
    public static void insertionSorting(int[] arr) {
        for (int j = 1; j<arr.length; j++) {
            int k = j;
            while (k>0) {
                if (arr[k]<arr[k-1]) {
                    int temp = arr[k-1];
                    arr[k-1] = arr[k];
                    arr[k] = temp;
                } else {
                    break;
                }
                k--;
            }
        }
        
        System.out.println("Output: "+Arrays.toString(arr));
    }
}