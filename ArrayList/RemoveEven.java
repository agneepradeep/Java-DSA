package ArrayList;

import java.util.*;

public class RemoveEven {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = read.nextInt();
        int element;
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            element = read.nextInt();
            arrayList.add(element);
        }
        
        System.out.println("Original List: "+arrayList);
        for (int i = n-1; i >= 0; i--) {  //Since its a kind of linked list, deletion from start is costly and deletion from end is cheap.
            if (arrayList.get(i)%2==0) {
                arrayList.remove(i);
            }
        }
        System.out.println("Modified List: "+arrayList);
        read.close();

    }
}
