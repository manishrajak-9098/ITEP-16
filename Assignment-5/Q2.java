//2) WAP to print N natural number.  

import java.util.Scanner;

class Q2{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter n natural no..");
        int n = sc.nextInt();

        int i=0;
        for (i=1; i<=n; i++){
            System.out.println(i + " ");
        }
    }
}