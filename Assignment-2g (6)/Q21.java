// 21) Program to find out greater number between two numbers using conditional operator
import java.util.Scanner;
class Q21{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st no ");
        int a = sc.nextInt();
        System.out.println("enter 2nd no ");
        int b = sc.nextInt();

        // if(a>b){
        //     System.out.println(" no is greater : "+a);
        // }
        // else {
        //     System.out.println("no is greater : "+b);
        // }
        int c =(a>b)?a:b;

        System.out.println("no is greater: "+c);
        // System.out.println("no is greater: "+b);

    }
}