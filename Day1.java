// public class ques1{
//           public static void main(String[] args) {
//               int[] arr={1,2,4,5,6};
//               int n =arr.length;
//               int numb=3;

//           //     printing array befre insertion
//           System.out.println("Array:");
//           for(int i=0; i<arr.length; i++){
//                     System.out.print(arr[i]+" ");
//           }

//           int[] newarr= new int[arr.length+1];
//           newarr[0]=arr[0];
//           newarr[1]=arr[1];
//           newarr[2]=3;

          
//           for(int i=2; i<arr.length; i++){
//                  newarr[i+1]=arr[i];
//           }
         
//           System.out.println("\n");
//           System.out.println("Updated array:");
//           for(int i=0; i<newarr.length; i++){
//                     System.out.print(newarr[i]+" ");
//           }
// 


// Q2
// public class Solution {
//     public static void main(String[] args){
//        int[] arr= {1,2,3,4,5};
//        int target= 8;

        
//         int[] newarr= new int[2];



//             System.out.println("Array 1:");
//             for (int i=0; i<arr.length; i++){
//                 System.out.print(arr[i]+" ");
//             }

//             boolean found= false;
            
//           System.out.println("\n");
//           System.out.println("Array 2:");

//           for(int i=0; i<arr.length; i++){
//                     for(int j=i+1; j<arr.length; j++){
//                        if(arr[i]+arr[j]==8){
//                               newarr[0]=arr[i];
//                               newarr[1]=arr[j];
//                               found = true;
//                               break;
//                     }
//           }

//           if(found)
//           break;
// }

// if (found){
//           System.out.println("Numbers are:"+ newarr[0]+" "+newarr[1]);
// }     else{
//           System.out.println("No pair found");

// }
        
// }
// }




          
          


             