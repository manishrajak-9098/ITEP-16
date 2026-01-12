
// a)	User needs to enter some basic details(like mail-Id, password, full name and age).
// b)	Shows menu displaying the options of opening:
// i.	Joint account
// 1.	Details of spouse
// 2.	Age of spouse
// 3.	Minimum amount to be deposited 5000/-
// ii.	Saving account
// 1.	Nominee name
// 2.	Nominee age
// 3.	Minimum amount to be deposited 2000/-
// iii.	Child account
// 1.	Child Name
// 2.	Guardian/Father’s age
// 3.	Minimum amount to be deposited 1000/-
// C) Shows menu displaying the options of (Asks for password to perform the operation): 
// i.	Deposit
// 1.	Joint Account
// 2.	Saving Account
// 3.	Child Account
// ii.	Withdraw
// 1.	Joint Account
// 2.	Saving Account
// 3.	Child Account
// D) Display details of :
// a)	Account Holder
// b)	Transaction performed
// c)	Deactivate Account
// Note: Every time you need to clear the screen after performing specific menu option
// Menu will be colorful
// Password Not shown on the screen while writing

import java.util.Scanner;
import java.io.Console;

    class Account {
        String userName;
        int userAge;
        String userPass;
        String usergmail;
 
        //Joint Account 
        String jsName;
        String jsPass;
        int jsAge;
        String jsEmail;
        int jAmt;

        //Saving Account
        String noName;
        String sPass;
        int  sAge;
        String sgmail;
        int sAmt;

        //Child Account
        String cName;
        int cAge;
        int cAmt;


       




    Account(String  userName, int userAge, String userPass, String usergmail ){
        this.userName = userName;
        this.userAge = userAge;
        this.userPass = userPass;
        this.usergmail = usergmail;
    }

void deposit(){
     Scanner sc = new Scanner(System.in);
     Console console = System.console();
     char[] passwordArray = console.readPassword("Enter your password: ");
     String pswd = new String(passwordArray);
        if (userPass.equals(pswd)) {
            System.out.print("Enter amount to deposit: ");
            int dAmt = sc.nextInt();
            System.out.println("Deposit for which account: ");
            System.out.println("1. Joint Account");
            System.out.println("2. Saving Account");
            System.out.println("3. Child Account");
            System.out.print("Enter your choice(1-3): ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    jAmt = jAmt+ dAmt;
                    System.out.println("Amount " + dAmt + " successfully deposited in Joint account");
                    break;

                case 2:
                    sAmt += dAmt;
                    System.out.println("Amount " + dAmt + " successfully deposited in Saving account");
                    break;

                case 3:
                    cAmt += dAmt;
                    System.out.println("Amount " + dAmt + " successfully deposited in Child account");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        } else {
            System.out.println("Incorrect password!");
        }

    }

    void withdrwal(){
            Scanner sc = new Scanner(System.in);
        Console console = System.console();
        char[] passwordArray = console.readPassword("Enter your password: ");
        String pswd = new String(passwordArray);

        if (userPass.equals(pswd)) {
            System.out.print("Enter amount to Withdraw: ");
            int wAmt = sc.nextInt();
            System.out.println("Withdraw from which account ");
            System.out.println("1. Joint Account");
            System.out.println("2. Saving Account");
            System.out.println("3. Child Account");
            System.out.print("Enter your choice(1-3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (wAmt <= jAmt) {
                        jAmt =jAmt-wAmt;
                        System.out.println("Amount " + wAmt + " withdrawn from Joint account");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 2:
                    if (wAmt <= sAmt) {
                        sAmt =sAmt - wAmt;
                        System.out.println("Amount " + wAmt + " withdrawn from Saving account");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 3:
                    if (wAmt <= cAmt) {
                        cAmt =cAmt-wAmt;
                        System.out.println("Amount " + wAmt + " withdrawn from Child account");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                default:
                    System.out.println("Enter correct choice");
            }
        } else {
            System.out.println("Incorrect password!");
        }
    }

    void display(){
        
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        char[] passwordArray = console.readPassword("Enter your password: ");
        String pswd = new String(passwordArray);
        if (userPass.equals(pswd)) {
            System.out.println("\n--- Account Details ---");
            System.out.println("Name: " + userName);
            System.out.println("Age: " + userAge);
            System.out.println("Joint Balance: " + jAmt);
            System.out.println("Saving Balance: " + sAmt);
            System.out.println("Child Balance: " + cAmt);
        } else {
            System.out.println("Incorrect password!");
        }
    }
     void deactivate() {
        jAmt = sAmt = cAmt = 0;
        System.out.println("All accounts deactivated successfully.");
    }
}

class Q24{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        
        String userName;
        int userAge;
        String usergmail;


        while (true){
        System.out.println("Enter Your full name");
         userName = sc.nextLine();
          if (userName.matches("[a-zA-Z ]+")){
            break;
          }
          else{
            System.out.println("Invalid Input ! . Name contains only Alphabets");
          }

        }
        
        while(true){
            System.out.println("Enter Your Age");
             userAge = sc.nextInt();
            if(userAge>18 && userAge<125){
                break;
            }
            else{
                System.out.println("Invalid Input!!. Age contain More than 10 and less than 125");

            }
        }
        sc.nextLine();
        while (true){
            System.out.println("Enter your Email ID ");
             usergmail = sc.nextLine();

             // Regex: checks if input ends with @gmail.com and has valid characters before
            // it
            if (usergmail.matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
                break; // valid, exit loop
        }
        else{
            System.out.println(" Invalid Gmail Id ! It contians @gmail.com to Corret id");
        }
          }

         char[] passwordArray = console.readPassword("Enter your password: ");
        String userPass = new String(passwordArray);

        Account ac = new Account(userName, userAge,  userPass, usergmail);

        System.out.println("Account opening Options");
        System.out.println("1.Joint Account ");
        System.out.println("2.Saving Account");
        System.out.println("3.Child Account ");
        int choice = sc.nextInt();

        switch (choice){

// 1.	Details of spouse
            case 1 :
                System.out.println();
                sc.nextLine(); 
                while(true){
                System.out.println("Enter your Spouse Name");
                ac.jsName = sc.nextLine();
         if (ac.jsName.matches("[a-zA-Z ]+")){
            break;
          }
          else{
            System.out.println("Invalid Input ! . Name contains only Alphabets");
          }
                }

                     while (true) {
                    System.out.print("Enter your spouse age: ");
                    if (sc.hasNextInt()) { // check if input is an integer
                        ac.jsAge = sc.nextInt();

                        if (ac.jsAge > 18 && ac.jsAge < 125) { // reasonable age check
                            break; // valid, exit loop
                        } else {
                            System.out.println("Invalid age! Age must be greater than 18. Try again.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter numbers only.");
                        sc.next(); // discard wrong input
                    }
                }
                 ac.jAmt = 5000;
                break;
        

        case 2 :
                System.out.println();
                sc.nextLine(); 
                while(true){
                System.out.println("Enter Nomine Name");
                ac.noName = sc.nextLine();
         if (ac.noName.matches("[a-zA-Z ]+")){
            break;
          }
          else{
            System.out.println("Invalid Input ! . Name contains only Alphabets");
          }
      }
      while(true){
        System.out.println("Enter a age of Nomine ");
        if (sc.hasNextInt()) { // check if input is an integer
                        ac.sAge = sc.nextInt();

                        if (ac.sAge > 18 && ac.sAge < 125) { // reasonable age check
                            break; // valid, exit loop
                        } else {
                            System.out.println("Invalid age! Age must be greater than 18. Try again.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter numbers only.");
                        sc.next(); // discard wrong input
                    }
                }
                 ac.sAmt = 2000;
                break;

         case 3 :  
         System.out.println();
         sc.nextLine();
         while(true){
            System.out.println("Enter Child name");
               ac.cName = sc.nextLine();
         if (ac.cName.matches("[a-zA-Z ]+")){
            break;
          }
          else{
            System.out.println("Invalid Input ! . Name contains only Alphabets");
          }
      }
        while(true){
            System.out.println("Enter Gardians Age ");
             if (sc.hasNextInt()) { // check if input is an integer
                        ac.cAge = sc.nextInt();

                        if (ac.cAge > 18 && ac.cAge < 125) { // reasonable age check
                            break; // valid, exit loop
                        } else {
                            System.out.println("Invalid age! Age must be greater than 18. Try again.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter numbers only.");
                        sc.next(); // discard wrong input
                    }
                }
            
                 ac.cAmt = 1000;
                break;
                
            default:
                System.out.println("Give valid input ");
                break;
        }

        while (true) {
            System.out.println();
            System.out.println("Enter 1. Deposit ");
            System.out.println("Enter 2. Withdraw ");
            System.out.println("Enter 3. Display detail ");
            System.out.println("Enter 4. Deactivate account ");
            System.out.println("Enter 5. Exit ");
            System.out.print("Enter your choice(1-5): ");
            int ch = sc.nextInt();

            switch(ch){
                case 1 : 
                System.out.println("");
                ac.deposit();
                break;

                case 2 :
                    System.out.println("");
                    ac.withdrwal();
                    break;

                case 3 :
                    System.out.println();
                    ac.display();
                    break;
                case 4 : 
                System.out.println();
                ac.deactivate();
                break;

                case 5 :
                    System.out.println();
                   System.out.println("Exiting Menu....");
               return;

               default : 
               System.out.println("Invalid data !!");
               return;
  
               }
            }
         }      
     }



































































































































