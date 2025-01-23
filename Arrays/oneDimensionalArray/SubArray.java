package oneDimensionalArray;

import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
        }
        
        for (int i = 0; i<n; i++) {
            for (int j = i; j<n; j++) {
                for (int k = i; k<=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            
        }
        read.close();
    }    
}
