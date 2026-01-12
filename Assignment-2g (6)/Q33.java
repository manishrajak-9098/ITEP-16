

// 33. program to print sum of two integers without +

import java.util.Scanner;
class Q33{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st no ");
        int a = sc.nextInt();
        System.out.println("enter 2nd no ");
        int b = sc.nextInt();

        int sum = a-(-b);
        System.out.println("sum of no. : "+sum);
    }
}