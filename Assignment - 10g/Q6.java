// 6.Write a program to store your shopping details in a binary file(shopping.dat) with information itemName, price, quantity. (Use ObjectOutputStream to store Item class object )

import java.io.*;
import java.util.*;

class Item implements Serializable {  
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            FileOutputStream fout = new FileOutputStream("C:\\MPIF-itep java assignment 1\\Assignment - 10g\\myfolder\\shopping.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout);

            System.out.print("Enter number of items: ");
            int n = sc.nextInt();

        
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for item " + (i + 1) + ": ");
                sc.nextLine(); 
                System.out.print("Item Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Quantity: ");
                int qty = sc.nextInt();

                Item item = new Item(name, price, qty);
                oout.writeObject(item);
            }

            oout.close();
            fout.close();
            System.out.println("\nShopping details stored successfully ");

        } catch (Exception e) {
            System.out.println("Exception  " + e);
        }
    }
}
