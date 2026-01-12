// 30. WAP to reverse 5 digit number

import java.util.Scanner;
class Q30{
    public static void main (String args[]){ 
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter a 5 digit no. : "); 
        int num = sc.nextInt();

        int reverse = 0;
        for( int i=1; i<=5; i++){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
          
        System.out.println(" reverse no. :"+reverse);
    }
}