// 22) Program to find out greater number among three numbers using conditional operator

import java.util.Scanner;
class Q22{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st no ");
        int a = sc.nextInt();
        System.out.println("enter 2nd no ");
        int b = sc.nextInt();
        System.out.println("enter 3rd no ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(" no is greater : "+a);
        }
        else  if(b>a&& b>c) {
            System.out.println("no is greater : "+b);
        }
           else{
            System.out.println("no is greater : "+c);
           }
            
        // int c =(a>b)?a:b;
        //         ? 

        // System.out.println("no is greater: "+a);
    

    }
}