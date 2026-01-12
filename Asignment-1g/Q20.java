// 19)Program to check whether entered year is a leap year or not
import java.util.Scanner;
class Q20{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any year  ");
        int y = sc.nextInt();

        if(y%4==0 || y%400==0){
            System.out.println("It is a leap year ");
        }
        else{
            System.out.println("It is not leap year ");

        }
    }
}