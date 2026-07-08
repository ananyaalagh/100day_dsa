// Q1

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        // A symmetric matrix must be square
        if (r != c) {
            System.out.println("The matrix is not symmetric.");
            return;
        }

        int[][] m1 = new int[r][c];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        boolean symmetric = true;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (m1[i][j] != m1[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) {
                break;
            }
        }

        if (symmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        sc.close();
    }
}

// Q2
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }

            }
        }

        return true;
    }
}
             

             


