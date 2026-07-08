





// // Q1

// import java.util.Scanner;
// public class Day11{
//           public static void main(String[] args){
//               Scanner sc=new Scanner(System.in);

//               System.out.print("Enter the number of rows for m1:");
//               int r=sc.nextInt();

//               System.out.print("Enter the number of columns for m1:");
//               int c=sc.nextInt();

//               int[][] matrix1=new int[r][c];

//               System.out.println("Enter the elements in matrix 1:");
//               for(int i=0; i<r; i++){
//                     for(int j=0; j<c;j++){
//                               matrix1[i][j]=sc.nextInt();
//                               System.out.print(matrix1[i][j]+" ");
//                     }
//                     System.out.println();
//               }

              

//               int[][] matrix2=new int[r][c];
//               System.out.print("\n ");
//               System.out.println("Enter the elements in matrix 2:");
//               for(int i=0; i<r; i++){
//                     for(int j=0; j<c;j++){
//                               matrix2[i][j]=sc.nextInt();
//                               System.out.print(matrix2[i][j]+" ");
//                     }
//                     System.out.println();
//               }

//             int[][] add= new int[r][c];
//             System.out.println("Matrix addition:");
//             for(int i=0; i<r; i++){
//                     for(int j=0; j<c; j++){
//                               add[i][j]= matrix1[i][j]+matrix2[i][j];
//                               System.out.print(add[i][j]+" ");
//                     }
//                     System.out.println();
//             }






//           }
// }



// Q2
import java.util.Scanner;
public class Day11{
          public static void main(String[] args){
                    Scanner sc= new Scanner(System.in);

                    System.out.print("Number of rows for m1:");
                    int r=sc.nextInt();

                    System.out.print("Number of columns for m1:");
                    int c=sc.nextInt();

                    int[][] m1= new int[r][c];


                    System.out.println("Enter the elements for m1:");
                    for(int i=0; i<r; i++){
                              for(int j=0; j<c; j++){
                                        m1[i][j]=sc.nextInt();
                                        System.out.print(m1[i][j]+" ");
                              }
                              System.out.println();
                    }

                    int[][] t1= new int[c][r];
                    System.out.print("Transposed matrix:");
                    for(int i=0; i<c; i++){
                              for ( int j=0; j<r; j++){
                                        t1[i][j]=m1[j][i];
                                     System.out.print(t1[i][j]+" ");
                              }
                              System.out.println();
                    }

          }
}