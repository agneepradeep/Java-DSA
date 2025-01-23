package Strings;

import java.util.*;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a word:");
        String word = read.nextLine();
        System.out.println("The word is: " + word);
        System.out.println("The word in lower case is: " + upperToLower(word));
        read.close();
    }

    public static String upperToLower(String str) {
        char[] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {
            char c = strArray[i];
            if (c>='A' && c<='Z') {
                c = (char)(c - 'A'+ 'a');
                strArray[i] = c; 
            }
        }
        return new String(strArray);
    }
}
