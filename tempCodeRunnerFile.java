import java.lang.*;
import java.util.Scanner;
public class Day19{
          public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);  
                 
                 System.out.print("Enter the size of array:");
                 int n=sc.nextInt();

                 int[] arr=new int[n];

                 System.out.print("Enter the elements of the array:");
                 for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
                 }
          System.out.print("\n");
                 System.out.print("Array:");
                 for(int i=0; i<n; i++){
                    System.out.print(arr[i]+" ");
                 }
          
          int closest=Integer.MAX_VALUE;
          int first=0;
          int second=0;
          for(int i=0; i<n-1; i++){
                 for(int j=i+1; j<n; j++){
                     int sum=arr[i]+arr[j];
                     
                     if(Math.abs(sum)<Math.abs(closest)){
                              closest=sum;
                              first=arr[i];
                              second=arr[j];
                     }

                 }
               
          }
          System.out.println(first + " " + second);

          }


          
}