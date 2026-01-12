// 5) WAP to swap two numbers using third variable

import java.util.Scanner;

class Q5{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 2 no. :");
        int  a  =sc.nextInt();
        int  b  =sc.nextInt();
         
         int temp =0;

        temp=b;
        b=a;
        a=temp ;
        
        System.out.println("after swapping");
        System.out.println("a :"+a+" b :"+b);
    }
}


