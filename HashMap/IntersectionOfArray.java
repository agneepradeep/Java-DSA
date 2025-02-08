package HashMap;

import java.util.*;

public class IntersectionOfArray {
    public static void main (String[] args) {
        int[] arr1 = {5, 8, 9, 6, 3, 2, 10};
        int[] arr2 = {9, 7, 1, 5, 2, 14, 20};
        getCommonElements(arr1, arr2);
    }
    public static void getCommonElements (int[] arr1, int[] arr2) {
        /**T=O(n)+O(m)*/
        HashMap<Integer, Boolean> hs = new HashMap<>();
        
        for (int i = 0; i<arr1.length; i++) {
            hs.put(arr1[i], false);
        }
        
        for (int i = 0; i<arr2.length; i++) {
            if (hs.containsKey(arr2[i])) {
                hs.put(arr2[i], true);
            }
        }
        ArrayList<Integer> av = new ArrayList<>();
        for (Integer v: hs.keySet()) {
            if (hs.get(v)) {
                av.add(v);
            }
        }
        System.out.println(av);
    }
}
