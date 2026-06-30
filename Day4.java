// Q1
import java.util.Scanner;

public class Day4{
          public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);
              System.out.print("Enter array size:");
              int n = sc.nextInt();
               
              int[] arr= new int[n];

              System.out.print("Enter elements:");
              for(int i=0; i<arr.length; i++){
                     arr[i]= sc.nextInt();
              }

              System.out.println("Array:");
              for(int i=0; i<arr.length; i++){
                    System.out.print(arr[i]+" ");
              }


              int[] reverseArr= new int[arr.length];
                System.out.print("\n");
                System.out.print("Reversed array:");
              for(int i=0; i<arr.length; i++){
                  
                    
                    reverseArr[i]=arr[n-i-1];
                    System.out.print(reverseArr[i]+" ");

                  
              }


          }}


// Q2
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                
                nums[k]=nums[i];
                k++;

            }

        }
        return k;
    }
}

