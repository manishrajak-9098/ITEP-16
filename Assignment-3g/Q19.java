// 19) Program to take nationality as ‘I’ or ‘i’ for Indian from user,
//  and if it is an Indian the take age from it and checks whether he or she is eligible to vote or not.

import java.util.Scanner;
class Q19{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your  nationality   ");
        char n = sc.next().charAt(0);

        if(n=='i'|| n=='I'){
            System.out.println(" you are Indian : ");
            System.out.println(" enter your age : ");
            int age = sc.nextInt();
            if(age>=18){
                System.out.println("you are eligible for vote :");
            }
            else{
                System.out.println("you are not eligible for vote : ");
            }
        }
        else{
            System.out.println(" Not an Indian, invalid user : ");

        }
    }
}