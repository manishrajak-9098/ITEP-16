// 23. A cashier has some amount of money(e.g. 4526).Write a program to calculate out how many currency of 
// Rs.1000,Rs.500,Rs100, Rs50, Rs20, Rs10, Rs5, Rs2, Rs1 required.sz

import java.util.Scanner;

class Q23{

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int amount;

        System.out.print("Enter the amount: ");
        amount = input.nextInt();

        int notes500, notes200, notes100, notes50, notes20, notes10, notes5, notes2, notes1 = 0;

         notes500 = amount/500;
         amount = amount%500;

         notes200 = amount/200;
         amount = amount%200;

         notes100 = amount/100;
         amount = amount%100;

         notes50 = amount/50;
         amount = amount%50;

         notes20 = amount/20;
         amount = amount%20;

         notes10 = amount/10;
         amount = amount%10;

         notes5 = amount/5;
         amount = amount%5;

         notes2 = amount/2;
         amount = amount%2;
       
         notes1 = amount/1;
         amount = amount%1;
          
        System.out.println("notes 500..:" + notes500);
        System.out.println("notes 200..:" + notes200);
        System.out.println("notes 100..:" + notes100);
        System.out.println("notes 50..:" + notes50);
        System.out.println("notes 20..:" + notes20);
        System.out.println("notes 10..:" + notes10);
        System.out.println("notes 5..:" + notes5);
        System.out.println("notes 2..:" + notes2);
        System.out.println("notes 1..:" + notes1);

        }
    }

       