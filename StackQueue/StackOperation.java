package StackQueue;

import java.util.*;

class StackOperation {
    public static void main (String[] args) {
        Scanner read = new Scanner (System.in);
        Stack<Integer> stk = new Stack<>();
        int choice, element;
        do {
            System.out.println("*** Stack Menu ***");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Peek Element");
            System.out.println("4. Display Stack");
            System.out.println("5. Search Element");
            System.out.println("6. Exit");
            
            System.out.print("Type your choice: ");
            choice = read.nextInt();
            
            switch(choice) {
                case 1:
                    element = read.nextInt();
                    stk.push(element);
                    break;
                    
                case 2:
                    element = stk.pop();
                    System.out.println(element+"is poped out");
                    break;
                    
                case 3:
                    System.out.println("Peek Element: "+stk.peek());
                    break;
                    
                case 4:
                    System.out.println(stk.toString());
                    break;
                    
                case 5:
                    element = read.nextInt();
                    int idx = stk.search(element);
                    if (idx == -1) {
                        System.out.println("Element Not Found");
                    } else {
                        System.out.println("Element Found At Index: "+idx);
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 6);
        read.close();
    } 
}
