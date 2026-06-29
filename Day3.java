// Q1

import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

System.out.print("Enter array size: ");
int size = sc.nextInt();

int[] arr = new int[size];

System.out.print("Enter " + size + " integers: ");
for (int i = 0; i < size; i++) {
    arr[i] = sc.nextInt();
}

System.out.print("Array: ");
for (int i = 0; i < size; i++) {
    System.out.print(arr[i] + " ");
}
System.out.println();

System.out.print("Enter integer to find: ");
int number = sc.nextInt();

    Boolean found=false;


for(int i=0; i<arr.length; i++){
        if(arr[i]==number){
           found=true;
           System.out.println("Found at index "+i);
        }
}

if(found==false){
    System.out.println("Not in the array");

}

for(int i=0; i<arr.length; i++){
    if(arr[i]==number){
        int comp=i+1;
        System.out.println("Number of comparisons:"+comp);
    }

}
}

    }     



// Q2
class Solution {
    int missingNum(int arr[]) {
        int range=arr.length+1;
        int expectedSum=range*(range+1)/2;
        int actualSum=0;
        for(int i=0; i<arr.length; i++){
            actualSum+=arr[i];
        }
        int missing= (expectedSum-actualSum);
        return missing;
        
    }
}


