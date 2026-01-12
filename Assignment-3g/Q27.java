// 27. Write a program that accepts six digit number and find out the sum of all the individual digits


import java.util.Scanner;
class Q26{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 digit:  ");
        int num = sc.nextInt();
        int sum=0;
        int digit=0;

        if(num>=100000){
            for(int i = 1; i<=6; i++){
                 digit = num%10;
                 sum=sum+digit;
                 num= num/10;
               }
                 System.out.println(" sum of individual digits : "+sum);
                }
        else {
            System.out.println("please enter 6 digit no.:");
           }
     }
 }