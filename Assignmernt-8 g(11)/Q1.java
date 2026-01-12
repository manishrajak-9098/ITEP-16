// 1.Write a program that lets the user perform arithmetic operations on two numbers. 
// Your program must be menu driven, allowing the user to select the operation (+, -, *, or /) 
// and input the numbers. Furthermore, your program must consist of following functions:
// a). Function showChoice: This function shows the options to the user and explains how to enter data.
//  b). Function add: This function accepts two number as arguments and returns sum.
// c). Function subtract: This function accepts two number as arguments and returns their difference.
//  d). Function mulitiply: This function accepts two number as arguments and returns product.
// e). Function divide: This function accepts two number as arguments and returns quotient.
import java .util.Scanner;

class Arthemetic{

    void show () {
    System.out.println("\nAirthemetic Operatrion to be performed by using this...");
    System.out.println("Press 1 . Addition +");
    System.out.println("Press 2. Substraction -");
    System.out.println("Press 3. for Miltiplication *");
    System.out.println("Press 4 for Divide ");
    System.out.println("Press 0 for Exit /\n");
    }

    double add(double a, double b){
        return a+b;
    }
    double sub(double a, double b){
        return a-b;
    }
    double mul(double a, double b){
        return a*b;
    }
    double div(double a, double b){
        return a/b;
    }

}

class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a;
        double b ;

        Arthemetic obj = new Arthemetic();

    while (true){
        obj.show();
        System.out.println("Choose a no. for performing operation  ");
        int n = sc.nextInt();

            if (n>0 || n<=4){
        switch(n){

            case 1 : 
                System.out.println("Enter two No.");
                 a = sc.nextInt();
                 b = sc.nextInt();
                System.out.println("Addition "+ obj.add(a , b));
                break;
            case 2 : 
                System.out.println("Enter two No.");
                 a = sc.nextInt();
                 b = sc.nextInt();
                System.out.println("Subtraction "+ obj.sub(a , b));
                break;
            case 3 : 
                System.out.println("Enter two No.");
                 a = sc.nextInt();
                 b = sc.nextInt();
                System.out.println("Multiplication "+ obj.mul(a , b));
                break;
            case 4 : 
                System.out.println("Enter two No.");
                 a = sc.nextInt();
                 b = sc.nextInt();
                System.out.println("Division "+ obj.div(a , b));
                break;
            case 0 : 
                System.out.println("Exiting loop ....");
                return;
            default : 
                System.out.println("Invalid data ");
                return;


        }

            }

    }
        

    }
}