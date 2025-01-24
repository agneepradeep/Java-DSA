package Recursion;

import java.util.*;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        printIncreasing(n);
        read.close();
    }

    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print("1");
            return;
        } else {
            printIncreasing(n - 1);
            System.out.print(" "+n);
            return;
        }
    }
}