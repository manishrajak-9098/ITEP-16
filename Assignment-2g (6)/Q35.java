// 35. Program to multiply a number by 2 without using x sign
//      ex : input 4 output 8

import java.util.Scanner;
class Q35{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no.  ");
        int n = sc.nextInt();

        int mul = n+n+2-2;
        System.out.println(n+"  Multiply by 2 : "+mul);

    }
}
