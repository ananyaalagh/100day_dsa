
        // Q1

import java.util.Scanner;

public class Day8{
          public static int power(int a, int b){
                    if(b==0){
                              return 1;
                    }
                    if(b==1){
                              return a;
                    }
                   return a*power(a,b-1);
           }
                    
          public static void main(String[] args){
                    Scanner sc= new Scanner(System.in);
                    System.out.print("a:");
                    int a=sc.nextInt();

                    System.out.print("b:");
                    int b=sc.nextInt();

                    int result= power(a,b);
                    System.out.print("Ans:"+ result);
          }}  

