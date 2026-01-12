// 24. Write a program that accepts three digit number and find out the sum of all the individual digits

import java.util.Scanner;
class Q24{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three digit:  ");
        int num = sc.nextInt();
        int sum=0;
        int digit=0;

        if(num>=100){
            for(int i = 1; i<=3; i++){
                 digit = num%10;
                 sum=sum+digit;
                 num= num/10;
                 }
                 System.out.println(" sum of individual digits : "+sum);
                 }
          else {
            System.out.println("please enter 3 digit no.:");
        }
      }
   }