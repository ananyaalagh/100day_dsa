// Q1
import java.util.Arrays;
import java.util.Scanner;
public class Day6 {
          public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);

              System.out.println("Enter the size of array:");
              int n=sc.nextInt();

              int[] arr= new int[n];

              System.out.print("Enter the integers:");
              for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
              }
              Arrays.sort(arr);
              System.out.print("Array: ");
              for(int i=0; i<n; i++){
                    System.out.print(arr[i]+" ");
              }
              System.out.print("\n");
              System.out.print("Array with unique elements:");
              for(int i=n-1; i>0; i--){
                    if(arr[i]!=arr[i-1]){
                              System.out.print(arr[i]+" ");
                    }

              }



          }}

// Q2
import java.util.Scanner;
public class Day6 {
          public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);

              System.out.println("Enter the size of array:");
              int n=sc.nextInt();

              int[] arr= new int[n];

              System.out.print("Enter the integers:");
              for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
              }
              
              System.out.print("Array: ");
              for(int i=0; i<n; i++){
                    System.out.print(arr[i]+" ");
              }
              System.out.print("\n");
              int k=0;
              
              for(int i=0; i<arr.length; i++){
                    if(arr[i]!=0){
                              arr[k]=arr[i];
                              k++;
                              
                    }
              }
              
              while(k<arr.length){
                    arr[k]=0;
                    k++;
              }

              System.out.print("Enter the new array:");
              for(int i=0; i<arr.length; i++){
                    System.out.print(arr[i]+" ");
              }
          }}
