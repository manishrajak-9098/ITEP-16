//24) 0	4	16	36	64	….. 1 2 3 4 5 6 7 8

import java.util.Scanner;
 class Q24{
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();

    int i=1;
    int even=0;
     int sq =0;
    for(i=1;i<=n;i++){

        // if(i%2==1)
        // sq = (i*i);
        even = 2*i -2;
        sq = even*even;
         System.out.print(sq + " ");
        
         }
         System.out.print("........ ");
        for(i=1;i<=n;i++)
        System.out.print(i+" "); 

      }
  }