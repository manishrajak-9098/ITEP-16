//26) 0	8	64	216	…………


import java.util.Scanner;
 class Q26{
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
        sq = even*even*even;
         System.out.print(sq + " ");
        
         }
        
      }
  }