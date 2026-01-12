// 27) Program to convert  feet into meter


import java.util.Scanner;
class Q27{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter value  in feet : ");
        float f = sc.nextInt();
    
           float m = f*0.3048f;
        System.out.println("convert meter  into meter "+m);
    }
}