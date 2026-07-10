// Q1

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] m = new int[r][c];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int left = 0;
        int right = c - 1;
        int top = 0;
        int bottom = r - 1;

        System.out.println("\nSpiral Order:");

        while (left <= right && top <= bottom) {

            // Left to Right
            for (int j = left; j <= right; j++) {
                System.out.print(m[top][j] + " ");
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(m[i][right] + " ");
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(m[bottom][j] + " ");
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(m[i][left] + " ");
                }
                left++;
            }
        }

        sc.close();
    }
}

// Q2) Same as that of first question