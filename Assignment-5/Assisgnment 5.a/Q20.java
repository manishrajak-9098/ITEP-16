// 0	7	14	21	28	35	…..

import java.util.Scanner;
class Q20{
    public static void main (String args[]){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();
     
      int i = 0;
      int result = 0;

    for (i=0; i<=n; i++){
        result = i*7;
        
        System.out.print(result +"  ");
        
    }
    }
}
