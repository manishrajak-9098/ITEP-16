// 14) Program to find out total and percentage by getting marks of 5 subjects

import java.util.Scanner;
class Q14{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter marks of subject 1 . :");
        int  a  =sc.nextInt();
        System.out.println("Enter marks of subject 2 . :");
        int  b  =sc.nextInt();
        System.out.println("Enter marks of subject 3 . :");
        int  c   =sc.nextInt();
        System.out.println("Enter marks of subject 4 . :");
        int  d   =sc.nextInt();
        System.out.println("Enter marks of subject 5 . :");
        int  e  =sc.nextInt();

        double percentage = (a+b+c+d+e)/5;
        System.out.println("percentage . :"+percentage);
    }
}