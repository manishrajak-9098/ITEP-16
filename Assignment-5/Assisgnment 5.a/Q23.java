//23) 1	9	25	49	81	…..
 
 import java.util.Scanner;
 class Q23{
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();

    int i=1;
    int odd=2;
     int sq =0;
    for(i=1;i<=n;i++){

        // if(i%2==1)
        // sq = (i*i);
        odd = 2*i-1;
        sq = odd*odd;
         System.out.print(sq + " ");
        
         }
      }
  }