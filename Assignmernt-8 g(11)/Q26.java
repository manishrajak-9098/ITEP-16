// 26.Create a class Employee with two protected data member (name, payRate).
// Declare two member function
// a)void getName() :- which accepts name.
// b)float getPay() :- which accepts the pay.
// Create a class Manager with one data member is_salaried (which should be in the form of 0(false) or 1(true).
// Declare one member function
// a)int is_salaried() :- which returns whether the manager is salaried or not. b)showDetail() :- it display the entire detail of a employee.


import java.util.Scanner;

class Employee{
Scanner sc = new Scanner(System.in);
protected String name;
protected int payrate;

void getName(){
System.out.print("Enter Employee name: ");
name = sc.nextLine();
}

void getPay(){
System.out.print("Enter Employee pay rate: ");
payrate = sc.nextInt();
  }
}
class Manager extends Employee{
int is_sl;

void setSalaried(){
System.out.print("Enter employee is salaried or not(1 for salaried or 0 for not salaried): ");
is_sl = sc.nextInt();
}
int isSalaried(){
return is_sl;
}

void showDetails(){
System.out.println("========Employee Details========");
System.out.println("Name     : "+name);
System.out.println("Pay Rate : "+payrate);
System.out.println("Salaried : "+ ((isSalaried()==1) ? "Yes" : "No") );

   }
 }

class Q26{
public static void main(String args[]){
Manager obj = new Manager();

obj.getName();
obj.getPay();
obj.setSalaried();
obj.showDetails();
}
}