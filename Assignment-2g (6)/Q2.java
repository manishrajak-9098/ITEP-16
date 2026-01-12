// 2) WAP to find out simple interest

import java.util.Scanner;
class Q2{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Principal: ");
        int P = sc.nextInt();

        System.out.println("Rate : ");
        int R = sc.nextInt();

        System.out.println("Time : ");
        int T = sc.nextInt();


        int SI = (P*R*T)/100;

        System.out.println("simple interest  .  "+SI);


    }
}