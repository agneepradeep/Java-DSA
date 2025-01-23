package ArrayList;

import java.util.*;

public class OperationsOnArrayList {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        int choice = 0;
        int element, idx, arrSize;

        do{
            System.out.println("***************MENU***************");
            System.out.println("1. Add Elements at End");
            System.out.println("2. Add Elements at Specific Index");
            System.out.println("3. Print the Entire List");
            System.out.println("4. Get Element by Index");
            System.out.println("5. Update Element at Specific Index");
            System.out.println("6. Remove Element by Index");
            System.out.println("7. Size of ArrayList");
            System.out.println("8. Sort the ArrayList");
            System.out.println("-1. Exit");
            System.out.println("**********************************");
            choice = read.nextInt();
            switch (choice) {
                case 1:
                    element = read.nextInt();
                    arrayList.add(element);
                    break;
                case 2:
                    idx = read.nextInt();
                    element = read.nextInt();
                    arrayList.add(idx,element);
                    break;
                case 3:
                    System.out.println("List :"+arrayList);
                    break;
                case 4:
                    idx = read.nextInt();
                    element = arrayList.get(idx);
                    System.out.println("Element at Index "+idx+" is : "+element);
                    break;
                case 5:
                    idx = read.nextInt();
                    element = read.nextInt();
                    arrayList.set(idx, element);
                    break;
                case 6:
                    idx = read.nextInt();
                    arrayList.remove(idx);
                    break;
                case 7:
                    arrSize = arrayList.size();
                    System.out.println("Length :"+arrSize);
                    break;
                case 8:
                    Collections.sort(arrayList);
                    System.out.println("List :"+arrayList);
                    break;
                case -1:
                    break;
                default:
                    break;
            }

        } while (choice != -1);
        read.close();
    }
}
