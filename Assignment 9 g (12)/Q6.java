/*
 * 6. Banking System
Build a class Bank with a non-static inner class Account. Each account should store account number, holder name, and balance.
 The Bank class should:
•	Create new accounts
•	Deposit and withdraw money
•	Display account details
Add a static nested class AuditTrail to:
•	Log transactions
•	Generate a summary of all account activities

 */

import java.util.*;
class Bank {
    static int nextAccountNumber = 1001;

    // Inner class: Account
    class Account {
        int accountNumber;
        String holderName;
        double balance;

        Account(String name, double amount) {
            accountNumber = nextAccountNumber++;
            holderName = name;
            balance = amount;
            AuditTrail.log("Account created: " + accountNumber + ", Name: " + name + ", Balance: " + balance);
        }

        void deposit(double amt) {
            balance += amt;
            AuditTrail.log("Deposited ₹" + amt + " in account " + accountNumber);
        }

        void withdraw(double amt) {
            if (amt <= balance) {
                balance -= amt;
                AuditTrail.log("Withdrawn ₹" + amt + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient balance for account " + accountNumber);
            }
        }

        void display() {
            System.out.println(accountNumber + " | " + holderName + " | ₹" + balance);
        }
    }

    // Static nested class: AuditTrail
    static class AuditTrail {
        static void log(String msg) {
            System.out.println();
            System.out.println("LOG: " + msg);
        }

        static void generateSummary() {
            System.out.println("\n----- All Transactions Summary -----");
            System.out.println("Check logs above for all operations.");
            System.out.println("-----------------------------------\n");
        }
    }
}

// Main class
public class Q6 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        Bank.Account acc1 = bank.new Account("Manish", 5000);
        Bank.Account acc2 = bank.new Account("Jeetendra", 7000);

        // Deposit & Withdraw
        acc1.deposit(2000);
        acc2.withdraw(3000);
        acc1.withdraw(8000); // Insufficient balance

        
        System.out.println("\n--- Account Details ---");
        acc1.display();
        acc2.display();


        Bank.AuditTrail.generateSummary();
    }
}
