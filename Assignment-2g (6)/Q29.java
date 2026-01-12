

// 29) Program to find out greater number among four numbers 

import java.util.Scanner;
class Q29{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st no ");
        int a = sc.nextInt();
        System.out.println("enter 2nd no ");
        int b = sc.nextInt();
        System.out.println("enter 3rd no ");
        int c = sc.nextInt();
        System.out.println("enter 4th no ");
        int d = sc.nextInt();

        if(a>b && a>c && a>d){
            System.out.println(" no is greater : "+a);
        }
        else  if(b>a&& b>c && b>d) {
            System.out.println("no is greater : "+b);
        }
           else if (c>a&& c>b && c>d) {
            System.out.println("no is greater : "+c);
           }
           else{
            System.out.println("no. is greater : "+d);
           }
            

    

    }
}