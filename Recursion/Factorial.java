package Recursion;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int factorial = findFactorial(n);
        System.out.println(factorial);
        read.close();
    }

    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}
