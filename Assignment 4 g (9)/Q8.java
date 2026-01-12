// 8) WAP to create a medical equipment menu for retailer and whole seller where retailers sees only 5 medicines 
// and purchase of medicine units is not more than 5 whereas wholesaler sees list of 10 medicines 
// and purchase of units is not more than 100 , prices of medicine would be in double.

import java.util.Scanner;

class Q8{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("medical equpments ");
        System.out.println("enter 1 for retailer .. ");
        System.out.println("enter 2 for wholesaler .. ");
        int num = sc.nextInt();
        double price = 0;
        double total = 0;
        int quantity = 0;
        switch(num){
            case 1 : 
            System.out.println("---- Retailer Menu (Max 5 units) ----");
                System.out.println("1. Paracetamol - Rs.12");
                System.out.println("2. Amoxicillin - Rs.35");
                System.out.println("3. Cough Syrup - Rs.60");
                System.out.println("4. Vitamin-C - Rs.25");
                System.out.println("5. Pain Relief Gel - Rs.45");
                System.out.println("choose medicine..and enter no.");
                int n = sc.nextInt();
                switch (n){
                    case 1 :
                        System.out.println("enter quantity :");
                         quantity = sc.nextInt();
                          System.out.println("1. Paracetamol - Rs.12");
                        
                        if(quantity==1){
                            total = quantity*12;
                        }
                        else if (quantity==2){
                            total = quantity*(12+12);
                        }
                        else if (quantity==3){
                            total = quantity*36;
                        }
                        else if (quantity==4){
                            total = quantity*48;
                        }
                        else{
                            total = quantity*60;
                        }
                        break;
                case 2 :
                        System.out.println("enter quantity :");
                         quantity = sc.nextInt();

                        System.out.println("2. Amoxicillin - Rs.35");
                        
                        if(quantity==1){
                            total = quantity*35;
                        }
                        else if (quantity==2){
                            total = quantity*(35*2);
                        }
                        else if (quantity==3){
                            total = quantity*(35*3);
                        }
                        else if (quantity==4){
                            total = quantity*(35*4);
                        }
                        else{
                            total = quantity*(35*5);
                        }
                        break;

                 case 3 :
                        System.out.println("enter quantity :");
                         quantity = sc.nextInt();
                         System.out.println("3. Cough Syrup - Rs.60");
                        
                        if(quantity==1){
                            total = quantity*60;
                        }
                        else if (quantity==2){
                            total = quantity*(60*2);
                        }
                        else if (quantity==3){
                            total = quantity*(60*3);
                        }
                        else if (quantity==4){
                            total = quantity*(60*4);
                        }
                        else{
                            total = quantity*(60*5);
                        }
                        break;


                  case 4 :
                        System.out.println("enter quantity :");
                         quantity = sc.nextInt();
                         System.out.println("4. Vitamin-C - Rs.25");
                        
                        if(quantity==1){
                            total = quantity*25;
                        }
                        else if (quantity==2){
                            total = quantity*(25*2);
                        }
                        else if (quantity==3){
                            total = quantity*(25*3);
                        }
                        else if (quantity==4){
                            total = quantity*(25*4);
                        }
                        else{
                            total = quantity*(25*5);
                        }
                        break;
                 case 5 :
                        System.out.println("enter quantity :");
                        quantity = sc.nextInt(); 

                        System.out.println("5. Pain Relief Gel - Rs.45");
                        
                        if(quantity==1){
                            total = quantity*45;
                        }
                        else if (quantity==2){
                            total = quantity*(45*2);
                        }
                        else if (quantity==3){
                            total = quantity*(45*3);
                        }
                        else if (quantity==4){
                            total = quantity*(45*4);
                        }
                        else{
                            total = quantity*(45*5);
                        }
                        break;
                        default : System.out.println("invalid value!");


                }
                System.out.println("total bill..: "+total);

                case 2 :
                 System.out.println("---- Wholesaler Menu (Max 100 units) ----");
                 System.out.println("1. Paracetamol - Rs.12.5");
                 System.out.println("2. Amoxicillin - Rs.35.75");
                 System.out.println("3. Cough Syrup - Rs.60.0");
                 System.out.println("4. Vitamin-C - Rs.25.0");
                 System.out.println("5. Pain Relief Gel - Rs.45.5");
                 System.out.println("6. Insulin - Rs.150.25");
                 System.out.println("7. Antacid - Rs.30.40");
                 System.out.println("8. Antiseptic Cream - Rs.55.60");
                 System.out.println("9. Blood Pressure Tablet - Rs.120.0");
                 System.out.println("10. Diabetes Tablet - Rs.95.75");
                  System.out.println("choose medicine..and enter no.");
                int n2 = sc.nextInt();
                switch (n2){
                    case 1 :
                        System.out.println("enter quantity :");
                         quantity = sc.nextInt();
                          System.out.println("1. Paracetamol - Rs.12");
                        
                        if(quantity==1){
                            total = quantity*12;
                        }
                        else if (quantity==2){
                            total = quantity*(12+12);
                        }
                        else if (quantity==3){
                            total = quantity*36;
                        }
                        else if (quantity==4){
                            total = quantity*48;
                        }
                        else{
                            total = quantity*60;
                        }
                        break;
                case 2 :
                        System.out.println("enter quantity :");
                         quantity = sc.nextInt();

                        System.out.println("2. Amoxicillin - Rs.35");
                        
                        if(quantity==1){
                            total = quantity*35;
                        }
                        else if (quantity==2){
                            total = quantity*(35*2);
                        }
                        else if (quantity==3){
                            total = quantity*(35*3);
                        }
                        else if (quantity==4){
                            total = quantity*(35*4);
                        }
                        else{
                            total = quantity*(35*5);
                        }
                        break;

                 case 3 :
                        System.out.println("enter quantity :");
                         quantity = sc.nextInt();
                         System.out.println("3. Cough Syrup - Rs.60");
                        
                        if(quantity==1){
                            total = quantity*60;
                        }
                        else if (quantity==2){
                            total = quantity*(60*2);
                        }
                        else if (quantity==3){
                            total = quantity*(60*3);
                        }
                        else if (quantity==4){
                            total = quantity*(60*4);
                        }
                        else{
                            total = quantity*(60*5);
                        }
                        break;


                  case 4 :
                        System.out.println("enter quantity :");
                         quantity = sc.nextInt();
                         System.out.println("4. Vitamin-C - Rs.25");
                        
                        if(quantity==1){
                            total = quantity*25;
                        }
                        else if (quantity==2){
                            total = quantity*(25*2);
                        }
                        else if (quantity==3){
                            total = quantity*(25*3);
                        }
                        else if (quantity==4){
                            total = quantity*(25*4);
                        }
                        else{
                            total = quantity*(25*5);
                        }
                        break;

                 case 5 :
                        System.out.println("enter quantity :");
                        quantity = sc.nextInt(); 

                        System.out.println("5. Pain Relief Gel - Rs.45");
                        
                        if(quantity==1){
                            total = quantity*45;
                        }
                        else if (quantity==2){
                            total = quantity*(45*2);
                        }
                        else if (quantity==3){
                            total = quantity*(45*3);
                        }
                        else if (quantity==4){
                            total = quantity*(45*4);
                        }
                        else{
                            total = quantity*(45*5);
                        break;}


                        case 6 :
                        System.out.println("enter quantity :");
                        quantity = sc.nextInt(); 

                         System.out.println("6. Insulin - Rs.150");
                        
                        
                        if(quantity==1){
                            total = quantity*150;
                        }
                        else if (quantity==2){
                            total = quantity*(150*2);
                        }
                        else if (quantity==3){
                            total = quantity*(150*3);
                        }
                        else if (quantity==4){
                            total = quantity*(150*4);
                        }
                        else{
                            total = quantity*(150*5);
                        }break;
                        
                    case 7 :
                        System.out.println("enter quantity :");
                        quantity = sc.nextInt(); 

                 System.out.println("7. Antacid - Rs.30.40");
                    
                        if(quantity==1){
                            total = quantity*30.40;
                        }
                        else if (quantity==2){
                            total = quantity*(30.40*2);
                        }
                        else if (quantity==3){
                            total = quantity*(30.40*3);
                        }
                        else if (quantity==4){
                            total = quantity*(30.40*4);
                        }
                        else{
                            total = quantity*(30.40*5);
                        }break;
                        
                        case 8 :
                        System.out.println("enter quantity :");
                        quantity = sc.nextInt(); 

                       System.out.println("8. Antiseptic Cream - Rs.55.60");
                        
                        
                        if(quantity==1){
                            total = quantity*55.60;
                        }
                        else if (quantity==2){
                            total = quantity*(55.60*2);
                        }
                        else if (quantity==3){
                            total = quantity*(55.60*3);
                        }
                        else if (quantity==4){
                            total = quantity*(55.60*4);
                        }
                        else{
                            total = quantity*(55.60*5);
                        
                        }break;
                        
                        case 9 :
                        System.out.println("enter quantity :");
                        quantity = sc.nextInt(); 

                        System.out.println("9. Blood Pressure Tablet - Rs.120.0");
                        
                        
                        if(quantity==1){
                            total = quantity*120;
                        }
                        else if (quantity==2){
                            total = quantity*(120*2);
                        }
                        else if (quantity==3){
                            total = quantity*(120*3);
                        }
                        else if (quantity==4){
                            total = quantity*(120*4);
                        }
                        else{
                            total = quantity*(120*5);
                        }
                        break;

                         case 10 :
                        System.out.println("enter quantity :");
                        quantity = sc.nextInt(); 
                        System.out.println("10. Diabetes Tablet - Rs.95.75");
                        
                        if(quantity==1){
                            total = quantity*95.75;
                        }
                        else if (quantity==2){
                            total = quantity*(95.75*2);
                        }
                        else if (quantity==3){
                            total = quantity*(95.75*3);
                        }
                        else if (quantity==4){
                            total = quantity*(95.75*4);
                        }
                        else{
                            total = quantity*(95.75*5);
                        }
                        break;

                        default : System.out.println("invalid value !");

                        return;

                }

                System.out.println("total bill..: "+total);
                default : System.out.println("invalid value ! ");
                return;
        }




    }
}















