// Q1
// import java.util.Arrays;
// import java.util.Scanner;
// public class Day17 {
//           public static void main(String[] args){
//                     Scanner sc= new Scanner(System.in);
                    
//                     System.out.print("Enter the size of array:");
//                     int n=sc.nextInt();
//                     int[] arr=new int[n];

//                     System.out.print("Enter the elements of the array:");
//                     for(int i=0; i<n; i++ ){
//                               arr[i]=sc.nextInt();
//                     }
//                     Arrays.sort(arr);
//                     System.out.print("Array:");
//                     for(int i=0; i<n; i++){
//                               System.out.print(arr[i]+" ");
//                     }
//                     System.out.print("\n");
//                     System.out.print("Min element:"+arr[0]);
//                     System.out.print("\n");
//                     System.out.print("Max element:"+arr[n-1]);
//                      }
// }


// Q2
import java.util.Scanner;
public class Day17 {
          public static void main(String[] args){
                    Scanner sc= new Scanner(System.in);
                    
                    System.out.print("Enter the size of array:");
                    int n=sc.nextInt();
                    int[] arr=new int[n];

                    System.out.print("Enter the elements of the array:");
                    for(int i=0; i<n; i++ ){
                              arr[i]=sc.nextInt();
                    }
                  
                    System.out.print("Array:");
                    for(int i=0; i<n; i++){
                              System.out.print(arr[i]+" ");
                    }

                    int currentSum=arr[0];
                    int maxsum=arr[0];

                    for(int i=1; i<n; i++){
                              if(currentSum+arr[i]>arr[i]){
                                  currentSum+=arr[i];
                              }else{
                                        currentSum=arr[i];
                              }
                              if(currentSum>maxsum){
                                        maxsum=currentSum;
                              }
                    }
                    System.out.print("\n");
                    System.out.print("maximum sum subarray:"+maxsum);
          }}