// 13) Program to convert lowercase to uppercase 

import java.util.Scanner;
class Q13{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a lowercase character . :");
        char  ch  =sc.next().charAt(0);
            char c = (char)(ch-32);
    
        System.out.println("upper case character  :"+c);
    }
}
     
