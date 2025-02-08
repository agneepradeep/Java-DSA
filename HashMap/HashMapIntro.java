package HashMap;

import java.util.*;

public class HashMapIntro {
    public static void main (String[] args) {
        /**All Operations is T=O(1)*/
        HashMap<String, Integer> population = new HashMap<>();
        //add
        population.put("India",138);
        population.put("USA",33);
        population.put("Nepal",2);
        
        //get
        System.out.println(population.get("India"));
        //to check a key is present in hashmap or not.
        System.out.println(population.containsKey("India"));
        //to print size
        System.out.println(population.size());
        //to print()
        System.out.println(population.entrySet());
        System.out.println(population.keySet());
        System.out.println(population.values());
        System.out.println(population);
        
        //to Iterate;
        for (String s: population.keySet()) {
            System.out.println(s);
        }
        //remove
        population.remove("Nepal");
        System.out.println(population);

    }
}
