 //22) 1	8	27	64	125	…..


import java.util.Scanner;
class Q22{
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();

    int i=1;
    int sq;
    for(i=1;i<=n;i++){
        sq = i*i*i;

        System.out.print(sq + " ");
         }
      }
  }