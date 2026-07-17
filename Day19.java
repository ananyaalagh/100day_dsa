
import java.util.Scanner;


// Q1
// import java.util.Scanner;

// public class Day19 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.print("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("\nArray:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         int closest = Integer.MAX_VALUE;
//         int first = 0;
//         int second = 0;


//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {

//                 int sum = arr[i] + arr[j];

//                 if (Math.abs(sum) < Math.abs(closest)) {
//                     closest = sum;
//                     first = arr[i];
//                     second = arr[j];
//                 }
//             }
//         }

//         if (first < second) {
//             System.out.println("\nPair closest to zero: " + first + " " + second);
//         } else {
//             System.out.println("\nPair closest to zero: " + second + " " + first);
//         }
//     }
// }


// Q2
public class Day19{
          public static void main(String[] args){
                    Scanner sc=new Scanner(System.in);


                    System.out.print("Enter the size of the array:");
                    int n=sc.nextInt();

                    int[] arr=new int[n];

                    System.out.print("Enter the elements in the array:");
                    for(int i=0;i<n;i++){
                              arr[i]=sc.nextInt();
                    }

                    System.out.print("Array:");
                    for(int i=0; i<n; i++){
                              System.out.print(arr[i]+" ");
                    }


                    // MAXIMUM KADANE
                    int maxi = Integer.MIN_VALUE;

                    int msum=0;

                    int tsum=0;


                    // MINIMUM KADANE
                    int mini=Integer.MAX_VALUE;

                    int misum=0;

                    for(int i=0; i<n;i++){
                              tsum+=arr[i];

                              if(msum>maxi){
                                        maxi=msum;
                              }
                              else if(msum<0){
                                        msum=0;
                              }

                             misum+=arr[i];

                             if(misum<mini){
                              mini=misum;
                             }

                             if(misum>0){
                              misum=0;
                             }



                    
                    }
                    if(maxi<0){
                              System.out.println("Maximum sum circular subarray:"+maxi);
                    }

                    int circular=tsum-mini;
                    System.out.println("\n");
                    System.out.println("Maximum sum circular subarray:"+Math.max(maxi,circular));

                    

                    

                    


          }}


