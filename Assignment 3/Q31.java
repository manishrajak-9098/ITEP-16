  //W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit.
   //For given problem you have to take choice from user.
    //If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. 
    //If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 

import java.util.Scanner;
class Q31{
    public static void main (String args[]){
     Scanner sc = new Scanner (System.in);
     
     double temp, result ;

     System.out.println("Enter 'c' to conver fahrenheit to celsius or enter 'f' to convert celsius to fahrenheit ");
     char choice = sc.next().charAt(0);
    
     if (choice == 'c' || choice == 'C'){
     System.out.println("enter temp in fahrenheit" );
     temp = sc.nextDouble();
     result = (temp - 32)* 5/9;
     System.out.println(" temp in celsius....:"+result);}

     
     else if (choice == 'f' || choice == 'F'){
     System.out.println("enter temp in celsius");
     temp = sc.nextDouble();
     result = (temp *9/2) + 32 ;
     System.out.println(" temp in fahrenheit....:"+result);
     }
     else {
     System.out.println(" invalid choice ");
          }
        
      }
   }