// 23) Program to find out whether entered number is even or odd using conditional operator

import java.util.Scanner;
class Q23{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no. ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(" no. is even : "+num);
        }
           else{
            System.out.println("no. is odd : "+num);
           }
            
        
    

    }
}