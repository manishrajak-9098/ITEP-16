// 10) check if both numbers are equals or not, if not then find out the greatest number

import java.util.Scanner;
class Q10{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st no ");
        int a = sc.nextInt();
        System.out.println("enter 2nd no ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(" no is greater : "+a);
        }
        else if (a==b){
            System.out.println("both no. are  equal : ");
        }
        else {
            System.out.println(" no is greater : "+b);

        }

        

    }
}