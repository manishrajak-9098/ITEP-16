// 1.	Problem Statement:
// Create a Java program that simulates a simple calculator. The calculator should perform basic arithmetic operations: addition, subtraction, multiplication, and division. Your task is to:
// •	Accept two integers and an operator from the user.
// •	Use exception handling to catch and manage the following runtime exceptions:
// o	ArithmeticException (e.g., division by zero)
// o	InputMismatchException (e.g., invalid input type)
// o	NullPointerException (simulate a scenario where this might occur)
// Requirements:
// •	Use Scanner for input.
// •	Wrap risky operations in try-catch blocks.
// •	Print meaningful error messages when exceptions occur.
// •	Use a finally block to print a closing message.
import java.util.*;

class Q1{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
 try{

 
        System.out.println("Enter 1 st No ");
        int a = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Operater For Airthametic Operation : ");
        String op = sc.nextLine();

        System.out.println("Enter 2nd Value");
        int b = sc.nextInt();

        int result = 0;
        if (op.equalsIgnoreCase("null")) {
         op = null;   // forcefully null set kiya
         }

        if (op.equals ("+")){
            result = a+b;
        }
        else if (op.equals("-")){
            result = a-b;
             
        }
        else if (op.equals("*")){
            result = a*b;
        }
        else if (op.equals("/")){
            result = a/b;
        }
        else if (op.equals("%")){
            result = a%b;
        }

        System.out.println("Result :  "+result);
 }catch (ArithmeticException e ){
    System.out.println ("Divided by zero is no allowed : "+e);
 }catch(InputMismatchException im){
    System.out.println ("Invalid Input type : "+im);

 }catch (NullPointerException np ){ 
    System.out.println (" simulate a scenario where this might occur : "+np);


    }
  } 
}

