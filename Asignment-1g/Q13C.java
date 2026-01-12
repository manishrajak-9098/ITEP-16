// 3) Series Programs

import java.util.Scanner;

class Series{
    void fabanacci(){
        int n1=1;
        int n2=2;
        int n3=0;
       
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a value: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(" series print : "+n1);
            
            n3= n2*n1;
            n1=n2;
            n2=n3;

        }
    }
}
class Q13C{
 public static void main(String[] args) {
       
        Series s = new Series();
        s.fabanacci();
 }      
}
