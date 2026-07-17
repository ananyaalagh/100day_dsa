// Q1
// import java.util.Scanner;

// public class Day20 {
//           public static void main(String[] args){
//                     Scanner sc= new Scanner(System.in);
                    
//                     System.out.print("Enter the size of the array:");
//                     int n= sc.nextInt();
                    
//                     int[] arr= new int[n];
//                     System.out.print("Enter the elements of the array:");
//                   for(int i=0; i<n; i++){
//                     arr[i]=sc.nextInt();
//                   }

//                   System.out.print("Array:");
//                   for(int i=0; i<n; i++){
//                     System.out.print(arr[i]+" ");
//                   }

// int count=0;
//                   for(int i=0; i<n; i++){
//                     int sum=0;
//                     for(int j=i+1; j<n; j++){
//                            sum=arr[i]+arr[j];
//                            if(sum==0){
//                               count++;
//                            }

                           
                           

//                     }

//                   }

//                   System.out.print("\n");
//                   System.out.print("Number of subbarray sums which are equal to zero:"+count);
//                 }
// }



// Q2

import java.util.Scanner;
public class Day20{
     public static void main(String[] args){
          Scanner sc =new Scanner(System.in);
          
          System.out.print("Enter the size of array:");
          int n=sc.nextInt();

           int[] arr= new int[n];

                    System.out.print("Enter the elements of the array:");
                  for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
                  }

                  System.out.print("Array:");
                  for(int i=0; i<n; i++){
                    System.out.print(arr[i]+" ");
                  }
    int sum=0;
                  for(int i=0; i<n;i++){
                    for(int j=i+1;j<n;j++){
                              for(int k=j+1; k<n;k++){
                                    sum=arr[i]+arr[j]+arr[k];
                                    
                                    if(sum==0){
                                        System.out.print("\n");
                                         System.out.println("[" + arr[i] + " " + arr[j] + " " + arr[k] + "]");
                                    }
                                    
                              }
                    }
                  }
     }
}