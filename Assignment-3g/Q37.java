// 37. Write a program for generating electricity Bill. Accept last month unit and current monthunit
//  from user, then calculate and print bill amount according to following condition
// For units
// 0-100 charges 2 rs/unit
// 101-200 charges 3rs/unit
// 201-300 4rs/unit
// >300 charges 5rs/unit
import java.util.Scanner;
class Q37{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int amount = 0;
    
    System.out.println ("last month units : ");
    int Lunit = sc.nextInt();

    System.out.println ("current month units : ");
    int Cunit = sc.nextInt();
    if(Cunit>Lunit){
    int ActualUnit = Cunit-Lunit;

    

    if(ActualUnit<100){
     amount = ActualUnit*2;
     System.out.println("total amount of unit : "+amount);
    }
    else if (ActualUnit>=100 || ActualUnit<=200){
        amount = ActualUnit*3;
     System.out.println("total amount of unit : "+amount);
    }
    else if (ActualUnit>200 || ActualUnit<=300){
        amount = ActualUnit*4;
     System.out.println("total amount of unit : "+amount);
    }
    else {
        amount = ActualUnit*5;
     System.out.println("total amount of unit : "+amount);
    }
    
    }
    else {
     System.out.println("enter valid unit : ");
    }
    }
}