package twoDimentionalArray;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int m = read.nextInt();
        int n = read.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = read.nextInt();
            }
        }

        int[][] transposeArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposeArr[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposeArr[i][j] + " ");
            }
            System.out.println();
        }
        read.close();
    }
}
