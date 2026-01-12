// 12) Program to convert uppercase to lowercase 

import java.util.Scanner;
class Q12{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a uppercase character . :");
        char  ch  =sc.next().charAt(0);
            char c = (char)(ch+32);
    
        System.out.println("lower case character  :"+c);
    }
}
     
