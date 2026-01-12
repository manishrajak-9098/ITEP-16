// //6) WAP to swap two numbers without using third variable
//   (arithmetic operator | bitwise operator)  


import java.util.Scanner;

class Q6{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 2 no. :");
        int  a  =sc.nextInt();
        int  b  =sc.nextInt();
         
        a= a^b;
        b= a^b;
        a= a^b;
        
        System.out.println("after swapping");
        System.out.println("a :"+a+" b :"+b);
    }
}


