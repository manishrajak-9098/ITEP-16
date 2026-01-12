/*Q4. Calculate the sum of following series
    1 2 3 .....n */ 

import java.util.Scanner;

class Q4 {
    public static void main (String []args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter n");
    int n = sc.nextInt();

    int sum=0;
     int i=1;
     while(i<=n){
        sum = sum+i;


        i++;
           }
              System.out.println(sum+"\t");
       }
    }