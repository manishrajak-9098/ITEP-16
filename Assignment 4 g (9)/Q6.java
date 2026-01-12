// 6) WAP to create a menu of 5 items regarding spare parts of a vehicle and
//  take individually the units and price of each part and then find out the total cost. 

import java.util.Scanner;
class Q6{
    public static void main (String...args){
        Scanner sc = new Scanner (System.in);
        System.out.println("````Select vechile spare parts details.````");
         int price = 0;
        int quantity = 0;
        int result = 0;
        int total = 0;

        while (true){
        System.out.println("\n1.tyres  ");
        System.out.println("2.indicators  ");
        System.out.println("3.seat cover  ");
        System.out.println("4.break shoo  ");
        System.out.println("5.bulb  ");
        System.out.println("select from this  ");
        int choice = sc.nextInt();
       
        if(choice >= 6){   // exit option
                System.out.println("Total Bill : " + total);
                System.out.println("Thank you!");
                break;
            }

        
        switch (choice){
            case 1 : 
            System.out.println("enter quantity :");
            quantity = sc.nextInt();
            System.out.println("enter price :");
            price = sc.nextInt();
            result = quantity*price;
            total +=result;
            System.out.println("Result :"+result); break;

            case 2 :
             System.out.println("enter quantity :");
            quantity = sc.nextInt();
            System.out.println("enter price :");
            price = sc.nextInt();
            result = quantity*price;
            total +=result;
            System.out.println("Result :"+result); break;

            case 3 :
            System.out.println("enter quantity :");
            quantity = sc.nextInt();
            System.out.println("enter price :");
            price = sc.nextInt();
            result = quantity*price;
            total +=result;
            System.out.println("Result :"+result); break;

            case 4 :
             System.out.println("enter quantity :");
            quantity = sc.nextInt();
            System.out.println("enter price :");
            price = sc.nextInt();
            result = quantity*price;
            total +=result;
            System.out.println("Result :"+result); break;

            case 5 :
             System.out.println("enter quantity :");
            quantity = sc.nextInt();
            System.out.println("enter price :");
            price = sc.nextInt();
            result = quantity*price;
            total +=result;
            System.out.println("Result :"+result); break;

            default : System.out.println("invalid data!!"); break;
        }
        }

    }
}