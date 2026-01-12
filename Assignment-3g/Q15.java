// 15) Program to find out whether entered number lies in between 50 and 100 or not

import java.util.Scanner;
class Q15{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no. ");
        int num = sc.nextInt();

        if(num>=50 || num<=100){
            System.out.println(" no. lies in limit 50 - 100 : ");
        }
           else{
            System.out.println("no. not lies in limit  : ");
           }
    }
}