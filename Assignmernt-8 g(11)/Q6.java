// 6.Create a class account with data members (accno, name, balance). Create function members
// a)getdata() to accept member data from user
// b)deposit(float money) to deposit money in account
// c)withdraw(float money) to withdraw money from account 
// d)display() to show account info

import java . util.Scanner;

class Account{
 private String name;
 private  int acc;
 private float bal;
 private float deposit;
 private float withdrwal;

Scanner sc = new Scanner (System.in);
    Account(String name, int acc, float bal){
        this.name = name;
        this.acc = acc;
        this.bal = bal;
        System.out.println("\nInitial balance: "+bal);
    }

void deposit(){
    System.out.println("\nEnter balance for Deposit :");
    deposit = sc.nextFloat();
    bal = bal+deposit;
}

void withdrwal(){
    System.out.println("\nEnter balance for Withdrawl :");
    withdrwal = sc.nextFloat();
    bal = bal-withdrwal;
}
void display(){
    // System.out.println(" \nDepost Amount : "+deposit );
    // System.out.println(" \nBalance after deposit : "+ );
    // System.out.println(" \n Withdrwal Amount  : "+withdrwal );
    System.out.println(" \nTotal Balance Amount  : "+bal);
}

}
class Q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Account No. :");
        int acc = sc.nextInt();

        System.out.println("Enter Balance . :");
        float bal = sc.nextFloat();

        Account obj = new Account(name, acc, bal);
        obj.deposit();
        obj.withdrwal();
        obj.display();


    }
}