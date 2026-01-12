// 25) Program to convert persons height from inches to cm

import java.util.Scanner;
class Q25{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter height of person in inches : ");
        float h = sc.nextInt();
        // System.out.println("convert height inches into cm ");
           float cm = h*2.54f;
        System.out.println("convert height inches into cm "+cm);
    }
}