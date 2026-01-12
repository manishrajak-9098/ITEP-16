// 4. Write a program to store transaction details of a customer in a file and
//  counts how many times amount is credited and debited. 

import java.io.*;
import java.util.*;

class TransactionDetail {
    String customerName;
    static int balance = 60000; // initial balance
    static int creditedCount = 0;
    static int debitedCount = 0;

    // amount credited means adding money to account
    void credit(int amount) {
        balance += amount;
        creditedCount++;
    }

    // amount debited means withdrawing money from account
    void debit(int amount) {
        balance -= amount;
        debitedCount++;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransactionDetail t = new TransactionDetail();

        try (FileWriter fw = new FileWriter("file.txt", true)) {
            while (true) {
                System.out.println("\n1. Credit");
                System.out.println("2. Debit");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("Enter credit amount: ");
                    int amount = sc.nextInt();
                    t.credit(amount);
                    fw.write("Credited: " + amount + "\n");
                    System.out.println(" Amount credited successfully!");
                } 
                else if (choice == 2) {
                    System.out.print("Enter debit amount: ");
                    int amount = sc.nextInt();
                    t.debit(amount);
                    fw.write("Debited: " + amount + "\n");
                    System.out.println(" Amount debited successfully!");
                } 
                else if (choice == 0) {
                    fw.write("\n----------------------------\n");
                    fw.write("Total Credited Transactions: " + TransactionDetail.creditedCount + "\n");
                    fw.write("Total Debited Transactions: " + TransactionDetail.debitedCount + "\n");
                    fw.write("Final Balance: " + TransactionDetail.balance + "\n");
                    fw.write("----------------------------\n");
                    System.out.println(" Transaction saved successfully!");
                    break;
                } 
                else {
                    System.out.println(" Invalid choice! Try again.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        sc.close();
   }
}