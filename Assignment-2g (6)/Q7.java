// 7) WAP to find out volume of cylinder

import java.util.Scanner;

class Q7{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Radius . :");
        int  radius  =sc.nextInt();
        System.out.println("Enter Height . :");
        int  height  =sc.nextInt();

        double volume = Math.PI*radius*radius*height;
         

        System.out.println("volume of cylinder : "+volume);
    
    }
}

