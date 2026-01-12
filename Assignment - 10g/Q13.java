// 13. Write a program to create UserDefined Exception(Other then classroom example).

import java.util.Scanner;
class InvalidAgeException extends Exception {
    InvalidAgeException() {                         //InvalidAgeException Constructor
        super("You are not elligible to vote");
    }
}
class Q13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    try{
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        
        if(age < 18){
            throw new InvalidAgeException();
        }
        else{
        System.out.println("You are elligible to vote");
        }
      } catch(InvalidAgeException e){
    
        System.out.println("Exception  : "+e.getMessage());
   }
  }
}
