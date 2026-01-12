// 26) Program to convert meter to feet


import java.util.Scanner;
class Q26{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter value  in meter : ");
        float m = sc.nextInt();
    
           float f = m*3.2808f;
        System.out.println("convert meter  into feet "+f);
    }
}