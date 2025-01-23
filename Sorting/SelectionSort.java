package Sorting;

import java.util.*;

public class SelectionSort {
    public static void main (String[] args) {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i<n; i++) {
            arr[i] = read.nextInt();
        }
        System.out.println("Input: "+Arrays.toString(arr));
        selectionSorting(arr);
        read.close();
    }
    
    public static void selectionSorting(int[] arr) {
        
        for (int i = 0; i<arr.length; i++) {
            int currentMinValue = arr[i];
            int currentMinIndex = i;
            
            for (int j = i+1; j<arr.length; j++) {
                if (arr[j] < currentMinValue) {
                    currentMinValue = arr[j];
                    currentMinIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = currentMinValue;
            arr[currentMinIndex] = temp;
        }
        
        System.out.println("Output: "+Arrays.toString(arr));
    }
}
