package Strings;

import java.util.*;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String str = read.nextLine();
        System.out.println(removeVowel(str));
        read.close();
    }    

    public static String removeVowel(String str) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) == -1) {
                sb.append(str.charAt(i));
            }
        }
                return sb.toString();
    
    }
}
