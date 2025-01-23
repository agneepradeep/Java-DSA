package Strings;

import java.util.*;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        str = reverseVowel(str);
        System.out.println(str);
        read.close();
    }    
    
    public static String reverseVowel(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (i < j) {
            // Find the next vowel from the left
            while (i < j && vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            // Find the next vowel from the right
            while (i < j && vowels.indexOf(arr[j]) == -1) {
                j--;
            }
            // Swap vowels
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}
