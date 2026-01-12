// 26. Write a program that accepts five digit number and find out the sum of all the individual digits


import java.util.Scanner;
class Q26{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 digit:  ");
        int num = sc.nextInt();
        int sum=0;
        int digit=0;

        if(num>=10000){
            for(int i = 1; i<=5; i++){
                 digit = num%10;
                 sum=sum+digit;
                 num= num/10;
               }
                 System.out.println(" sum of individual digits : "+sum);
                }
        else {
            System.out.println("please enter 5 digit no.:");
           }
     }
 }