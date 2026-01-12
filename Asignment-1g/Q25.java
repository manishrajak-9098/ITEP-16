// 24) WAP to find out the sum of N natural number.

import java.util.Scanner;

class Q25{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter n natural no..");
        int n = sc.nextInt();

       int sum = 0;
       int i=1;
       for(i=1;i<=n;i++){
           
           sum = i +sum;

             }
           System.out.print(sum );
           }

         }