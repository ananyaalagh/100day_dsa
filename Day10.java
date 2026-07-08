// Q1
// import java.util.Scanner;
// public class Day10{
//           public static void main(String[] args){
//                     Scanner sc =new Scanner(System.in); 
//                     System.out.print("Enter the string:");
//                     String str= sc.nextLine();
//                     String rev="";
//                       int n= str.length();
//                     for(int i=n-1;i>=0;i--){
//                               char ch= str.charAt(i);
//                               rev= rev+ch;

//                     } 
//                     if(str.equals(rev)){
//                               System.out.print("YES it is a palindrome");
//                     }
//                     else{
//                               System.out.print("NO it is not a palindrome");
//                     } 

//           }
// }

// Q2
import java.util.Arrays;
import java.util.Scanner;

public class Day10 {
          public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);

                    // Array 1
                    System.out.print("Enter Array 1 size: ");
                    int n = sc.nextInt();

                    int[] arr1 = new int[n];

                    System.out.print("Enter " + n + " integers for Array 1: ");
                    for (int i = 0; i < n; i++) {
                              arr1[i] = sc.nextInt();
                    }

                    // Array 2
                    System.out.print("Enter Array 2 size: ");
                    int m = sc.nextInt();

                    int[] arr2 = new int[m];

                    System.out.print("Enter " + m + " integers for Array 2: ");
                    for (int i = 0; i < m; i++) {
                              arr2[i] = sc.nextInt();
                    }

                    // Print Array 1
                    System.out.print("Array 1: ");
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr1[i] + " ");
                    }

                    System.out.println();

                    // Print Array 2
                    System.out.print("Array 2: ");
                    for (int i = 0; i < m; i++) {
                              System.out.print(arr2[i] + " ");
                    }

                    // Printing sorted arrays
                    // Sort both arrays
                    Arrays.sort(arr1);
                    Arrays.sort(arr2);

                    // Print sorted Array 1
                    System.out.print("\nSorted Array 1: ");
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr1[i] + " ");
                    }

                    System.out.println();

                    // Print sorted Array 2
                    System.out.print("Sorted Array 2: ");
                    for (int i = 0; i < m; i++) {
                              System.out.print(arr2[i] + " ");
                    }

                    int i = 0;
                    int j = 0;
                    System.out.println(" ");
                    System.out.println("Intersection:");
                    while (i < n && j < m) {
                              if (arr1[i] == arr2[j]) {
                                        if (i == 0 || arr1[i] != arr1[i - 1]) {
                                                  System.out.print(arr1[i] + " ");
                                        }

                                        i++;
                                        j++;
                              } else if (arr1[i] < arr2[j]) {
                                        i++;
                              } else {
                                        j++;
                              }
                    }
          }
}
