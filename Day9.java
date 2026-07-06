// Q1
import java.util.Scanner;

public class Day9{
          public static void main(String[] args){
                 
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter the forward code:");
          String str=sc.nextLine();
          int n= str.length();
          for(int i=n-1;i>=0; i--){
                    char ch= str.charAt(i);
                    System.out.print(ch);
          }
          }

}

// Q2
// class Solution {
//     public void reverseString(char[] s) {
//         int n=s.length;
//         int left=0;
//         int right=n-1;
//         while(left<right){
//             char temp=s[left];
//             s[left]=s[right];
//             s[right]=temp;
//             left++;
//             right--;
//         }
//     }
// }