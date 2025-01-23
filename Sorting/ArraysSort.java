package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i<n; i++) {
            arr[i] = read.nextInt();
        }
        System.out.println("Input: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Output: "+Arrays.toString(arr));
        read.close();
    }
}
