package HashMap;

import java.util.*;

public class HashSetIntro {
    public static void main (String[] args) {
       HashSet<Integer> hs = new HashSet<>();
       
       hs.add(10);
       hs.add(20);
       hs.add(10);
       hs.add(30);
       hs.add(40);
       
       System.out.println(hs);
       System.out.println(hs.contains(15));
       for (int v: hs) {
           System.out.println(v);
       }
       hs.remove(10);
       System.out.println(hs);
       System.out.println(hs.size());
       firstRepeatingChar("Agneepradeep Verma");
    }
    
    public static void firstRepeatingChar(String st) {
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i<st.length(); i++) {
            char ch = st.charAt(i);
            if (set.contains(ch)) {
                System.out.println(ch);
                return;
            } else {
                set.add(ch);
            }
        }
        System.out.println(-1);
    }
}