import java.util.*;

class Node {
    int element;
    Node next;

    Node(int element) {
        this.element = element;
        this.next = null;
    }

    public Node addFirst(int val) {
        Node temp = new Node(val);
        temp.next = this;
        return temp;
    }

    public void addLast(int val) {
        Node tempPtr = this;
        while (tempPtr.next != null) {
            tempPtr = tempPtr.next;
        }
        tempPtr.next = new Node(val);
    }

    public Node addElementAt(int val, int idx) {
        if (idx == 0) return addFirst(val);
        Node tempPtr = this;
        for (int i = 0; i < idx - 1 && tempPtr.next != null; i++) {
            tempPtr = tempPtr.next;
        }
        if (tempPtr == null) return this;
        Node tempElement = new Node(val);
        tempElement.next = tempPtr.next;
        tempPtr.next = tempElement;
        return this;
    }

    public Node removeFirst() {
        if (this.next == null) {
            return null;
        }
        return this.next;
    }
    

    public Node removeLast() {
        if (this == null || this.next == null) return null;
        Node tempPtr = this;
        while (tempPtr.next.next != null) {
            tempPtr = tempPtr.next;
        }
        tempPtr.next = null;
        return this;
    }

    public Node removeAt(int idx) {
        if (idx == 0) return removeFirst();
        Node tempPtr = this;
        for (int i = 0; i < idx - 1 && tempPtr.next != null; i++) {
            tempPtr = tempPtr.next;
        }
        if (tempPtr.next == null) {
            System.out.println("Invalid position!");
            return this;
        }
        tempPtr.next = tempPtr.next.next;
        return this;
    }

    public void printList() {
        Node tempPtr = this;
        while (tempPtr != null) {
            System.out.print(tempPtr.element + " -> ");
            tempPtr = tempPtr.next;
        }
        System.out.println("null");
    }

    public int lengthOfList() {
        int count = 0;
        Node tempPtr = this;
        while (tempPtr != null) {
            count++;
            tempPtr = tempPtr.next;
        }
        return count;
    }

    public boolean searchK(int k) {
        Node tempPtr = this;
        while (tempPtr != null) {
            if (tempPtr.element == k) return true;
            tempPtr = tempPtr.next;
        }
        return false;
    }
}

public class OperationsOnLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        while (true) {
            System.out.println("\n*** Linked List Menu ***");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove First");
            System.out.println("5. Remove Last");
            System.out.println("6. Remove at Position");
            System.out.println("7. Print List");
            System.out.println("8. Get Length");
            System.out.println("9. Search Element");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val1 = sc.nextInt();
                    head = (head == null) ? new Node(val1) : head.addFirst(val1);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    int val2 = sc.nextInt();
                    if (head == null) head = new Node(val2);
                    else head.addLast(val2);
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int val3 = sc.nextInt();
                    System.out.print("Enter position (0-based index): ");
                    int pos = sc.nextInt();
                    if (head == null && pos == 0) head = new Node(val3);
                    else if (head != null) head = head.addElementAt(val3, pos);
                    break;

                case 4:
                    if (head != null) head = head.removeFirst();
                    else System.out.println("List is empty!");
                    break;

                case 5:
                    if (head != null) head = head.removeLast();
                    else System.out.println("List is empty!");
                    break;

                case 6:
                    System.out.print("Enter position to remove (0-based index): ");
                    int remPos = sc.nextInt();
                    if (head != null) head = head.removeAt(remPos);
                    else System.out.println("List is empty!");
                    break;

                case 7:
                    if (head != null) head.printList();
                    else System.out.println("List is empty!");
                    break;

                case 8:
                    System.out.println("Length of List: " + (head != null ? head.lengthOfList() : 0));
                    break;

                case 9:
                    System.out.print("Enter value to search: ");
                    int searchVal = sc.nextInt();
                    System.out.println("Element found: " + (head != null && head.searchK(searchVal)));
                    break;

                case 10:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}