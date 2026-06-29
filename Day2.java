// Q1
public class Day2{
          public static void main(String[] args) {
              int[] arr={1,2,3,4,5,6};
              int n=arr.length;
          System.out.println("Intial Array:");
              for(int i=0; i<n; i++){
                    System.out.print(arr[i]+" ");
              }
          System.out.print("\n");

          int[] newarr=new int[n-1];
          newarr[0]=1;
          newarr[1]=2;
          
           System.out.println("Array after deletion:");
         for(int i=3; i<n; i++){
             newarr[i-1]=arr[i];     
          }
          
           System.out.println("Array after deletion:");
        for(int i = 0; i < newarr.length; i++){
            System.out.print(newarr[i] + " ");

          


          }
}
}


// Q2
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                int profit= prices[j]-prices[i];
                if(profit>maxprofit){
                    maxprofit=profit;
                }

            }
        }
        return maxprofit;
        
    }
}








