// 1) WAP to find out average of 5 numbers

import java.util.Scanner;
class Q1{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter a 2nd number: ");
        int b = sc.nextInt();

        System.out.println("Enter a 3rd number: ");
        int c = sc.nextInt();

        System.out.println("Enter a 4th number: ");
        int d = sc.nextInt();

        System.out.println("Enter a 5th number: ");
        int e = sc.nextInt();

        int average = (a+b+c+d+e)/5;

        System.out.println("average of total no.  "+average);


    }
}