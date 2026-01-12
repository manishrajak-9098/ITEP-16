// 20) Program to get marks of 5 subjects from user and checks whether percentage lies in between 75 and 100 or not


import java.util.Scanner;
class Q20{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter marks of subject 1 . :");
        int  a  =sc.nextInt();
        System.out.println("Enter marks of subject 2 . :");
        int  b  =sc.nextInt();
        System.out.println("Enter marks of subject 3 . :");
        int  c   =sc.nextInt();
        System.out.println("Enter marks of subject 4 . :");
        int  d   =sc.nextInt();
        System.out.println("Enter marks of subject 5 . :");
        int  e  =sc.nextInt();

        double percentage = (a+b+c+d+e)/5;
        System.out.println("percentage . :"+percentage);

        if(percentage>=75 && percentage<=100){
        System.out.println("percentage lies between 75 to 100 . :");

        }
        else{
        System.out.println("percentage not lies between 75 to 100 . :");

        }
    }
}