// 25. Write a program that accepts four digit number and find out the sum of all the individual digits

import java.util.Scanner;
class Q25{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four digit:  ");
        int num = sc.nextInt();
        int sum=0;
        int digit=0;

        if(num>=1000){
            for(int i = 1; i<=4; i++){
                 digit = num%10;
                 sum=sum+digit;
                 num= num/10;
               }
                 System.out.println(" sum of individual digits : "+sum);
                }
        else {
            System.out.println("please enter 4 digit no.:");
           }
     }
 }