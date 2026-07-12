// Q1
// import java.util.Scanner;
// public class Day16{
//       public static void main(String[] args){
//           Scanner sc= new Scanner(System.in);

//           System.out.print("Enter the size of array: ");
//           int n=sc.nextInt();
//           int[] arr= new int[n];
//           System.out.print("Enter the elements in the array: ");
//           for(int i=0; i<n; i++){
//                     arr[i]=sc.nextInt();
//           }
//           System.out.print("Array: ");
//           for(int i=0; i<n; i++){
//                     System.out.print(arr[i]+" ");
//           }
//           int count=1;
//           System.out.println("Frequency of each element:");
//           for(int i=0; i<n-1; i++){
//                     if(arr[i]==arr[i+1]){
//                          count++;
//                     }
//                     else{
//                               System.out.println(arr[i]+"->"+count);
//                               count=1;
//                     }

//           }
//           System.out.println(arr[arr.length-1]+"->"+count);
         
          
//       }
// }


// Q2
  
class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int left = 0;
        int right = n - 1;

        // Reverse whole array
        while (left < right) {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }

        // Reverse first k elements
        left = 0;
        right = k - 1;

        while (left < right) {
             int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            
            left++;
            right--;
        }

        // Reverse remaining elements
        left = k;
        right = n - 1;

        while (left < right) {
             int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            
            left++;
            right--;
        }
    }
}
