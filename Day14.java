
// Q1
// import java.util.Scanner;

// public class Day14{
//           public static void main(String[] args){
//                  Scanner sc= new Scanner(System.in);
                 
//                  System.out.println("Enter the number of rows:");
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

//                  boolean identity=true;
//                  for(int i=0; i<r; i++){
//                     for(int j=0; j<c; j++){
//                               if(i==j){
//                                    if(m[i][j]!=1){
//                                        identity=false;
//                                    }    

//                               }
//                               else{
//                                         if(m[i][j]!=0){
//                                                   identity = false;
//                                         }
//                               }
//                     }
//                  }
//                  System.out.print("\n");
//                  if(identity){
//                     System.out.println("identity matrix");
//                  }
//                  else{
//                     System.out.print("not an identity matrix");
//                  }
                 
             


//           }}



// Q2
import java.util.Scanner;
public class Day14{
          public static void main(String[] args){
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the number of rows:");
                 int r=sc.nextInt();

                 System.out.println("Enter the number of columns:");
                 int c=sc.nextInt();

                 int[][] m=new int[r][c];
                 
                 System.out.println("Enter elements for the matrix:");
                 for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                           m[i][j]=sc.nextInt();   
                    }
                 }

                 System.out.println("Matrix:");
                 for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                              System.out.print(m[i][j]+" ");
                    }
                    System.out.println();
                 }
                 
                 for(int i=0; i<r; i++){
                    for(int j=i+1; j<c; j++){
                        
                        int temp=m[i][j];
                        m[i][j]=m[j][i];
                        m[j][i]=temp;

                       
                    }}
                    System.out.println("Transposed Matrix:");

                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                             System.out.print(m[i][j] + " ");
                    }
                          System.out.println();
          }
          for(int i=0; i<r; i++){
          int left=0;
                    int right=c-1;
          while(left<right){
                    
                    
                              int temp=m[i][left];
                              m[i][left]=m[i][right];
                              m[i][right]=temp;

                              left++;
                              right--;
                    
          }
}

          System.out.println("Reversed image of matrix:");
          for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                              System.out.print(m[i][j]+" ");
                    }
                    System.out.println();
          }
                 }

          }
