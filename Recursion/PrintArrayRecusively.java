package Recursion;

import java.util.*;

class PrintArrayRecursively {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = read.nextInt();
        }
        printArrayRecursively(arr,n-1);
        read.close();
    }
    
    public static void printArrayRecursively(int[] arr, int n) {
        if (n == 0) {
            System.out.print(arr[n]);
            return;
        } else {
            printArrayRecursively(arr,n-1);
            System.out.print(" "+arr[n]);
        }
    }
}
