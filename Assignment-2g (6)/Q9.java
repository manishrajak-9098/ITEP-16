// 9) WAP to find out area of triangle 
//    (by herons formula)

import java.util.Scanner;

class Q9{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 1 side . :");
        int  a  =sc.nextInt();
        System.out.println("Enter 2 side . :");
        int  b  =sc.nextInt();
        System.out.println("Enter 3 side . :");
        int  c  =sc.nextInt();
        System.out.println("Enter semi perimeter . :");
        int  s  =sc.nextInt();

        double area  = Math.sqrt(s*(s-a)*(s-b)*(s-c));
         

        System.out.println(" area of triangle : "+area);
        
    
    }
}
