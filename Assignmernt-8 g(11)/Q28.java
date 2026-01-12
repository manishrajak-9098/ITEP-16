// 28.Create a class BankAccount with one data member(balance).
// Declare four methods
// a)BankAccount() :- which initialize the member function with 0.
// b)void deposit(double amount) :- which adds balance in amount.
// c)void withdraw(double amount) :- which deducts balance in amount.
// d)double getBalance() :- which returns the balance.
// Create a class SavingAccount with two data members(interest_rate and min_balance).

// Declare a member function
// a)	setInterestRate() :- which sets the interest and use the above methods to calculate the account balance

import java.util.Scanner;
class BankAccount{
    double balance;
    BankAccount(){
      balance = 0;    
    }
    void deposit(double amount){
        balance = balance+amount;
    }
    void withdrawl(double amount){
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    
    }
    double getBalance(){
        return balance;
    }
}
class SavingAccount extends BankAccount{
    double interest_rate;
    double min_balance;
    void setInterestRate(double rate){
        interest_rate = rate;
        balance = balance + (balance*(interest_rate/100));

    }
}
class Q28{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();

        System.out.println("Enter Amount for deposite : ");
        double amt = sc.nextDouble();
        sa.deposit(amt);

        System.out.println("Enter amount for withdrawl");
        double wd = sc.nextDouble();
        sa.withdrawl(wd);

        System.out.println("Enter rate ");
        double rate = sc.nextDouble();
        sa.setInterestRate(rate);

        System.out.println("Final Balance = " + sa.getBalance());
        // BankAccount ba = new BankAccount();
        // System.out.println("Final Balance = " +ba.getBalance());



    }
}
