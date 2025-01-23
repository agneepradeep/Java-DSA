package oneDimensionalArray;

import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int n = read.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        read.close();
        System.out.println(max);

    }    
}