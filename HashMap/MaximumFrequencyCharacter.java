package HashMap;

import java.util.*;

public class MaximumFrequencyCharacter {
    public static void main (String[] args) {
        highestFrequencyCharacter("aabdccassddaaa");
    }
    public static void highestFrequencyCharacter (String s) {
        HashMap<Character,Integer> ch = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            if (!ch.containsKey(s.charAt(i))) {
                ch.put(s.charAt(i),1);
            } else {
                int frequency = ch.get(s.charAt(i));
                ch.put(s.charAt(i),frequency+1);
            }
        }
        
        char maxChar = s.charAt(0);
        int maxFreq = ch.get(maxChar);
        
        for (char c: ch.keySet()) {
            if (maxFreq < ch.get(c) ) {
                maxFreq = ch.get(c);
                maxChar = c;
            }
        }
        System.out.println("Maximum Frequency Character: "+maxChar);
    }
}
