package oneDimensionalArray;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();    
        }

        reverse(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        read.close();
    }
            
    public static void reverse(int[] arr) {
        int leftPointer = 0;
        int rightPointer = arr.length-1;

        while (leftPointer < rightPointer) {
            int tempLeftElement = arr[leftPointer];
            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = tempLeftElement;
            leftPointer++;
            rightPointer--;
        }

    }
}
