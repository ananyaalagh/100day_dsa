// Q1
// import java.util.Scanner;

// public class Day15 {
//           public static void main(String[] args){
//                      Scanner sc=new Scanner(System.in);
//                     System.out.println("Enter the number of rows:");
//                  int r=sc.nextInt();

//                  System.out.println("Enter the number of columns:");
//                  int c=sc.nextInt();

//                  int[][] m=new int[r][c];
                 
//                  System.out.println("Enter elements for the matrix:");
//                  for(int i=0; i<r; i++){
//                     for(int j=0; j<c; j++){
//                            m[i][j]=sc.nextInt();   
//                     }
//                  }

//                  System.out.println("Matrix:");
//                  for(int i=0; i<r; i++){
//                     for(int j=0; j<c; j++){
//                               System.out.print(m[i][j]+" ");
//                     }
//                     System.out.println();
//                  }

//                  int sum=0;

//                  for(int i=0; i<r; i++){
//                     for(int j=0; j<c; j++){
//                               if(i==j){
//                                         sum+=m[i][j];
//                               }
//                     }
//                  }
//                  System.out.println("Sum of diagonal elements:"+sum);


//           }
// }


// Q2
class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean row0 = false, col0 = false;

        for (int j = 0; j < n; j++)
            if (matrix[0][j] == 0) row0 = true;

        for (int i = 0; i < m; i++)
            if (matrix[i][0] == 0) col0 = true;

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

        if (row0)
            for (int j = 0; j < n; j++)
                matrix[0][j] = 0;

        if (col0)
            for (int i = 0; i < m; i++)
                matrix[i][0] = 0;
    }
}
