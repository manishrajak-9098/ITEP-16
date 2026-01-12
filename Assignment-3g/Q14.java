// 14) Program to check whether first number is divisible by second or not

import java.util.Scanner;
class Q14{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a 1st no for divisible . ");
        int num1 = sc.nextInt();
        System.out.println("enter a 2nd no for divide. ");
        int num2 = sc.nextInt();

        if(num1%num2==0){
            System.out.println(" 1st no. is divisible second : ");
        }
           else{
            System.out.println("no. is not  divisible  : ");
           }
    }
}
