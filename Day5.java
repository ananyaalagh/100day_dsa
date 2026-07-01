
// Q1
// import java.util.Arrays;
// import java.util.Scanner;

// public class Day5{
//           public static void main(String[] args){
//                    Scanner sc= new Scanner(System.in);
//                    System.out.print("Enter the number of entries in log 1:");
//                    int p=sc.nextInt();

//                    int[] arr1= new int[p];

//                    System.out.println("Integers:");
//                    for(int i=0; i<p; i++){
//                         arr1[i]=sc.nextInt();

//                    }
//                    Arrays.sort(arr1);
//                    System.out.println("Sorted integers:");
//                    for(int i=0; i<p; i++){
//                          System.out.print(arr1[i]+" ");  
//                    }
//                      System.out.print("\n");
//                    System.out.print("Enter the number of entries in log2: ");
//                    int q=sc.nextInt();

//                    int[] arr2= new int[q];

//                    System.out.println("Integers:");
//                    for(int i=0; i<q; i++){
//                     arr2[i]=sc.nextInt();
//                    }
//                     Arrays.sort(arr2);
//                    System.out.println("Sorted integers:");
//                    for(int i=0; i<q; i++){
//                     System.out.print(arr2[i]+" ");
//                    }
//                    int[] arr3= new int[p+q];
                   
//                    for(int i=0; i<p; i++){
//                                arr3[i]=arr1[i];
//                    }
//                    for(int i=0; i<q; i++){
//                     arr3[q+i]=arr2[i];
//                    }
//                    Arrays.sort(arr3);
//                    System.out.print("\n");
//                    System.out.print("Merged array:");
//                    for(int i=0; i<arr3.length; i++){
//                     System.out.print(arr3[i]+" ");
//                    }
// }
// }

// Q2
// import java.util.Arrays;

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {

//         int[] merge = new int[m + n];

//         for (int i = 0; i < m; i++) {
//             merge[i] = nums1[i];
//         }

//         for (int i = 0; i < n; i++) {
//             merge[m + i] = nums2[i];
//         }

//         Arrays.sort(merge);

//         for (int i = 0; i < merge.length; i++) {
//             nums1[i] = merge[i];
//         }
//     }
// }