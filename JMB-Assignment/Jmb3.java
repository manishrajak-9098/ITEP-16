import java.util.Scanner;

class JmbRestruraunt {
    Scanner sc = new Scanner(System.in);  
    String drink;
    String soup; 
    String vegetable;
    String vegetable2;
    String paneer;
    String curd;
    String starter;
    String dal;
    String rice;
    String sweetdish;


    String RESET = "\u001B[0m";
    String CREAM_BACKGROUND = "\u001B[48;2;255;253;208m";
    String PEACH_BACKGROUND = "\u001B[48;2;255;218;185m";
    String BLACK_TEXT = "\u001B[30m";


    //================ Drink / Soup ==================
    void drinkSoup() {

        while (true) {
            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET,"Offering you a Welcome Drink or Soup ");
            System.out.println("Press 1. For  Welcome Drink  ");
            System.out.println("Press 2. For  Soup  ");
            int d = sc.nextInt();


            if (d == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET,"````````` Welcome Drink```````` ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1. Mineral Water "," 4. Blue Lagoon    ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2. Butter Milk ","   5. Rasna Water  ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3. Fresh Lime Water ","   6. Strawberry Delight  ");
                System.out.println("Press No. for Drink..");
                int dk = sc.nextInt();
                 if (dk == 1) {
                 drink = " Mineral Water";
              }
              
               else if (dk == 2) {
                drink = "Butter Milk";
               } 
               else if (dk == 3) {
                drink = "Fresh Lime Water";
               } 
               else if (dk == 4) {
                drink = " Blue Lagoon";
               } 
               else if (dk == 5) {
                drink = "Rasna Water";
               } 
               else {
                drink = "Strawberry Delight";
              }
                break;

}
            else if (d == 2) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET,"````````````Soup```````````` ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1. Tomato Soup "," 4. Mushroom Soup   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2. Sweet corn Soup ","   5. Hot & Sour Veg Soup  ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3. Vegetable Clear Soup ","   6. Dal Soup  ");
                System.out.println("Press No. for Soup..");
                int sp = sc.nextInt();
                 if (sp == 1) {
                 soup = " Tomato Soup ";
              }
              
               else if (sp == 2) {
                soup = "Sweet corn Soup";
               } 
               else if (sp == 3) {
                soup = "Vegetable Clear Soup";
               } 
               else if (sp == 4) {
                soup = " Mushroom Soup ";
               } 
               else if (sp == 5) {
                soup = "Hot & Sour Veg Soup";
               } 
               else {
                soup = "Dal Soup";
              }
                break;
            }
            else {
                System.out.println("Invalid Value, please try again...");
            }
        }
    }



//================ Vegetable ==================
void getVegetable() {
    while (true) {
        System.out.println("\nPress 1. for Selecting the Varities of Vegetable dishes");
        int v = sc.nextInt();

        if (v == 1) {
            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," `````````Varities of Vegetable dishes````````");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Mix veg ","  6 Nav Ratan Korma   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2 Lohri Aloo with Mutter ","  7 Bhindi Masala   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3 Aloo Mutter ","  8 Aloo Do Pyaza   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 4 Kadi Punjabi ","  9 Aloo Palak   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 5 Green Chana (Seasonal) ","  10 Dum Aloo   ");
            System.out.printf(RESET);

            System.out.println("Press No. for Selecting Vegetable..");
            int vg = sc.nextInt();

            switch (vg) {
                case 1 : vegetable = "Mix veg"; break;
                case 2 : vegetable = "Lohri Aloo with Mutter"; break;
                case 3 : vegetable = "Aloo Mutter"; break;
                case 4 : vegetable = "Kadi Punjabi"; break;
                case 5 : vegetable = "Green Chana"; break;
                case 6 : vegetable = "Nav Ratan Korma"; break;
                case 7 : vegetable = "Bhindi Masala"; break;
                case 8 : vegetable = "Aloo Do Pyaza"; break;
                case 9 : vegetable = "Aloo Palak"; break;
                case 10 : vegetable = "Dum Aloo"; break;
                default : {
                    System.out.println(" Invalid Input, Try Again...");
                    continue; 
                }
            }
            break; 
        } else {
            System.out.println("Invalid press ...Try Again");
        }
    }
}

//================ Vegetable2 ==================
void getVegetable2() {
    while (true) {
        System.out.println("\nPress 1. for Selecting the Varities of Vegetable dishes");
        int v = sc.nextInt();

        if (v == 1) {
            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," `````````Varities of Vegetable dishes````````");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Mix veg ","  6 Nav Ratan Korma   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2 Lohri Aloo with Mutter ","  7 Bhindi Masala   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3 Aloo Mutter ","  8 Aloo Do Pyaza   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 4 Kadi Punjabi ","  9 Aloo Palak   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 5 Green Chana (Seasonal) ","  10 Dum Aloo   ");
            System.out.printf(RESET);

            System.out.println("Press No. for Selecting Vegetable..");
            int vg = sc.nextInt();

            String tempVeg2 = null;
            switch (vg) {
                case 1 : tempVeg2 = "Mix veg"; break;
                case 2 : tempVeg2 = "Lohri Aloo with Mutter"; break;
                case 3 : tempVeg2 = "Aloo Mutter"; break;
                case 4 : tempVeg2 = "Kadi Punjabi"; break;
                case 5 : tempVeg2 = "Green Chana"; break;
                case 6 : tempVeg2 = "Nav Ratan Korma"; break;
                case 7 : tempVeg2 = "Bhindi Masala"; break;
                case 8 : tempVeg2 = "Aloo Do Pyaza"; break;
                case 9 : tempVeg2 = "Aloo Palak"; break;
                case 10 : tempVeg2 = "Dum Aloo"; break;
                default : {
                    System.out.println(" Invalid Input, Try Again...");
                    continue;
                }
            }

            // Duplicate check
            if (tempVeg2.equals(vegetable)) {
                System.out.println(" You Already Selected this Vegetable, choose another one...");
                continue; //
            } else {
                vegetable2 = tempVeg2;
                break; // valid selection -> loop exit
            }
        } else {
            System.out.println("Invalid press ...Try Again");
        }
    }
}

    //================ Paneer ==================
    void getPaneer() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Paneer dishes");
            int p = sc.nextInt();

            if (p == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," `````````Paneer Dishes````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Paneer Butter Masala ","  6 Kadhai Paneer   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2 Shahi Paneer ","  7 Paneer Tikka Masala   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3 Matar Paneer ","  8 Palak Paneer   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 4 Paneer Bhurji ","  9 Paneer Pasanda   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 5 Paneer Do Pyaza ","  10 Chilli Paneer   ");
                System.out.println("Press No. for Selecting Paneer Dishes..");
                int pn = sc.nextInt();
                 if (pn == 1) {
                 paneer = " Paneer Butter Masala";
              }
              
               else if (pn == 2) {
                paneer = "Sahi Paneer ";
               } 
               else if (pn == 3) {
                paneer = " Muttar Paneer";
               } 
               else if (pn == 4) {
                paneer = " Paneer Bhurji ";
               } 
               else if (pn == 5) {
                paneer = " Paneer Do Pyaza";
               } 
               else if (pn == 6) {
                paneer = "Kadhai Paneer";
               } 
               else if (pn == 7) {
                paneer = "Paneer Tikka Masala";
               } 
               else if (pn == 8) {
                paneer = "Palak Paneer ";
               } 
               else if (pn == 9) {
                paneer = " Paneer Pasanda";
               } 
               else {
                paneer = " Chilli Paneer";
              }
                break;
            }
            else {
                System.out.println(" Invalid press ...Try Again");
            }
        }
    }

    //================ Curd ==================
    void getCurd() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Curd dishes");
            int c = sc.nextInt();

            if (c == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," `````````Curd Dishes````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Plain Curd ","  4 Boondi Raita   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2 Fruit Raita ","  5 Onion Raita   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3 Mix Veg Raita ","  6 Cucumber Raita   ");
                 System.out.println("Press No. for Selecting Curd Dishes..");
                int cd = sc.nextInt();
                 if (cd == 1) {
                 curd = " Plain curd";
              }
              
               else if (cd == 2) {
                curd = " Fruit Raita ";
               } 
               else if (cd == 3) {
                curd = " Mix Veg Raita";
               } 
               else if (cd == 4) {
                curd = " Boondi Raita ";
               } 
               else if (cd == 5) {
                curd = " Onion Raita ";
               } 
               else {
                curd = "Cucumber";
              }
                break;
            }
            else {
                System.out.println(" Invalid press ...Try Again");
            }
        }
    }

    //================ Starter ==================
    void getStarter() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Starters");
            int s = sc.nextInt();

            if (s == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," `````````Starters````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Veg Manchurian ","  4 Spring Roll   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2 Chilli Mushroom ","  5 Veg Crispy   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3 Paneer Chilli ","  6 Baby Corn Chilli   ");
                 System.out.println("Press No. for Selecting Starter..");
                int srt = sc.nextInt();
                 if (srt == 1) {
                 starter = " Veg Manchurian";
              }
              
               else if (srt == 2) {
                starter = " Chilli Mushroom ";
               } 
               else if (srt == 3) {
                starter = " Paneer Chilli ";
               } 
               else if (srt == 4) {
                starter = "Spring Roll ";
               } 
               else if (srt == 5) {
                starter = "Veg Crispy  ";
               } 
               else {
                starter = "Baby Corn Chilli";
              }
                break;
            }
            else {
                System.out.println(" Invalid press ...Try Again");
            }
        }
    }

    //================ Dal ==================
    void getDal() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Dal dishes");
            int d = sc.nextInt();

            if (d == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," `````````Dal Dishes````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Dal Tadka ","  4 Dal Panchmel   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2 Dal Fry ","  5 Rajma Masala   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3 Dal Makhani ","  6 Chole Masala   ");
                System.out.println("Press No. for Selecting Dal Dishes..");
                int da = sc.nextInt();
                 if (da == 1) {
                 dal = " Dal Tadka";
              }
              
               else if (da == 2) {
                dal = " Dal Fry ";
               } 
               else if (da == 3) {
                dal = "Dal Makhani ";
               } 
               else if (da == 4) {
                dal = " Dal Panchmel ";
               } 
               else if (da == 5) {
                dal = "  Rajma Masala  ";
               } 
               else {
                dal = "Chole Masala";
              }
                break;
            }
            else {
                System.out.println(" Invalid press ...Try Again");
            }
        }
    }

    //================ Rice ==================
    void getRice() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Rice dishes");
            int r = sc.nextInt();

            if (r == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," `````````Rice Dishes````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Plain Rice ","  4 Jeera Rice   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2 Veg Pulao ","  5 Veg Biryani   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3 Peas Pulao ","  6 Paneer Pulao   ");
                System.out.println("Press No. for Selecting Rice..");
                int rc = sc.nextInt();
                 if (rc == 1) {
                 rice = " Plain Rice";
              }
              
               else if (rc == 2) {
                rice = " Veg Pulao ";
               } 
               else if (rc == 3) {
                rice = "Peas Pulao ";
               } 
               else if (rc == 4) {
                rice = " Jeera Rice ";
               } 
               else if (rc == 5) {
                rice = " Veg Biryani ";
               } 
               else {
                rice = " Paneer Pulao ";
              }
                break;
            }
            else {
                System.out.println(" Invalid press ...Try Again");
            }
        }
    }

    //================ Sweet Dish ==================
    void getSweetDish() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Sweet Dishes");
            int sd = sc.nextInt();

            if (sd == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," `````````Sweet Dishes````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Gulab Jamun ","  4 Ice Cream   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2 Rasgulla ","  5 Jalebi   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3 Kheer ","  6 Halwa   ");
               System.out.println("Press No. for Selecting Sweet Dishes..");
                int srd = sc.nextInt();
                 if (srd == 1) {
                 sweetdish = " Plain curd";
              }
              
               else if (srd == 2) {
                sweetdish = " Fruit Raita ";
               } 
               else if (srd == 3) {
                sweetdish = " Mix Veg Raita";
               } 
               else if (srd == 4) {
                sweetdish = " Boondi Raita ";
               } 
               else if (srd == 5) {
                sweetdish = " Onion Raita ";
               } 
               else {
                sweetdish = "Cucumber";
              }
                break;
            }
            else {
                System.out.println(" Invalid press ...Try Again");
            }
        }
    }



    //THALI A
     void getThaliA(){
        drinkSoup();
       getVegetable();
        getDal();
        getRice();
        getSweetDish();
        
    }
//THALI B
    void getThaliB(){
      Scanner sc = new Scanner(System.in);
        drinkSoup();  
        System.out.println("\nYou Can Choose Two Vegetable Dishes........");
        System.out.println("\nChoose 1st Vegetable Dishes........");
        getVegetable();
        System.out.println("\nChoose 2nd Vegetable Dishes........");
        getVegetable2();
        getDal();
        getRice();
        getSweetDish();
    
    }
//THALI C    
void getThaliC(){
     Scanner sc = new Scanner(System.in);
        drinkSoup();  
        System.out.println("\nYou Can Choose Two Vegetable Dishes........");
        System.out.println("\nChoose 1st Vegetable Dishes........");
        getVegetable();
        System.out.println("\nChoose 2nd Vegetable Dishes........");
        getVegetable();
        getPaneer();
        getDal();
        getRice();
        getCurd();
        getStarter();
        getSweetDish();

} 
// THALI D
void getThaliD(){
     Scanner sc = new Scanner(System.in);
        drinkSoup();  
        System.out.println("\nYou Can Choose Two Vegetable Dishes........");
        System.out.println("\nChoose 1st Vegetable Dishes........");
        getVegetable();
        System.out.println("\nChoose 2nd Vegetable Dishes........");
        getVegetable();
        getPaneer();
        getDal();
        getRice();
        getCurd();
         System.out.println("\nYou Can Choose Two Starter........");
        System.out.println("\nChoose 1st Starter........");
        getStarter();
        System.out.println("\nChoose 2nd Starter........");
        getStarter();
        getSweetDish();

}

//THALI E
void getThaliE(){
  Scanner sc = new Scanner(System.in);
        drinkSoup();  
        System.out.println("\nYou Can Choose Two Vegetable Dishes........");
        System.out.println("\nChoose 1st Vegetable Dishes........");
        getVegetable();
        System.out.println("\nChoose 2nd Vegetable Dishes........");
        getVegetable();
        getPaneer();
        getDal();
        getRice();
        getCurd();
       
         System.out.println("\nYou Can Choose Two Starter........");
        System.out.println("\nChoose 1st Starter........");
        getStarter();
        System.out.println("\nChoose 2nd Starter........");
        getStarter();
         System.out.println("\n Choose Paneer Starter........");
        getStarter();
        getSweetDish();

}
}

//================ Main Class (unchanged) ==================
class Jmb3{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        JmbRestruraunt jb = new JmbRestruraunt();

String RESET = "\u001B[0m";
String CREAM_BACKGROUND = "\u001B[48;2;255;253;208m";
String PEACH_BACKGROUND = "\u001B[48;2;255;218;185m";
String BLACK_TEXT = "\u001B[30m";
String vegName = "";


        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET, "``````````````Welcome to JMB`````````````");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+ RESET ,"1. VEGETARIAN MENU ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+ RESET, "2. BREAKFAST MENU ");
         System.out.println( RESET);
          System.out.println("\nHello sir/Ma'am  Choose Menu !");
        int choice = sc.nextInt();
        if(choice==1 || choice==2){
            if (choice == 1) {
            vegName = "Vegetable";
        } else if (choice == 2) {
            vegName = "Breakfast";
        } else {
            System.out.println("Invalid choice!");
        }


            switch(choice){
                case 1 :
                        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s%n"+RESET,"``````Varities of JMB Thali`````` ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+ RESET,"1.  Thali 'A' --------------------->($ 310)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET, "2.  Thali 'B' --------------------->($ 360)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET, "3.  Thali 'C' --------------------->($ 410)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET, "4.  Thali 'D' --------------------->($ 470)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET, "5.  Thali 'E' --------------------->($ 600)");
                        System.out.println( RESET);

                        System.out.println("Select Thali as per your Mood ........");
                    
                        int n = sc.nextInt();
                    
                            switch(n){
                                case 1 :
                                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected Thali 'A' ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Soup or Welcome Drink","   Roti, Naan   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Vegitable Dish","  Butter Paratha ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Dal  ","  Pickle, Salad, Papad   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Rice "," 1 Sweet Dish or Ice cream   ");
                                    System.out.println();
                                    jb.getThaliA();

                            
                                    break;
                                case 2 :
                                     System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected Thali 'B' ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Soup or Welcome Drink","   Roti, Naan   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2 Vegitable Dish","  Butter Paratha ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Dal fry  ","  Pickle, Salad, Papad   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Rice "," 1 Sweet Dish or Ice cream   ");
                                    jb.getThaliB();
                                    
                                    break;
                                case 3 :
                                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected Thali 'C' ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Soup or Welcome Drink","   Roti, Naan   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2  Vegitable Dish","  Butter Paratha ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Paneer Dish","  1 Starter ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Dal  ","  Pickle, Salad, Papad   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Rice "," 1 Sweet Dish or Ice cream   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Curd Dish ","   ");
                                    jb.getThaliC();

                                    break;
                                case 4 :
                                     System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected Thali 'C' ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Soup or Welcome Drink","   Roti, Naan   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2  Vegitable Dish","  Butter Paratha ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Paneer Dish","  2 Starter ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Dal  ","  Pickle, Salad, Papad   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Rice "," 1 Sweet Dish or Ice cream   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Curd Dish "," Coffee  ");
                                  
                                    jb.getThaliD();
                                    break;

                                 case 5 :
                                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected Thali 'C' ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Soup or Welcome Drink","   Roti, Naan   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2  Vegitable Dish","  Butter Paratha ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Paneer Dish","  2 Starter ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Dal  ","  Pickle, Salad, Papad   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Rice "," 1 Sweet Dish or Ice cream   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Curd Dish "," 1 Paneer Starter  ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1  Pasta ","  ");
                                    jb.getThaliE();
                                    break;
                                
                                 default :
                                        System.out.println("Invalid Data Input");
                                    break;
                            }
                        break;

                        

                case 2 :
                         System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"````Varities of JMB Breakfast ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"1. Normal Breakfast ($ 200)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"2. Special Breakfast  ($ 230)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"3. Premium  Breakfast ($ 250)");
                        System.out.println( RESET);

                        System.out.println("Select BreakFast as per your Mood ........");
                          int n2 = sc.nextInt();

                          switch(n2){
                            case 1 :
                                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected  Normal Breakfast ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Poha , Jalebi, 1 Coffee","  1 Bread item ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Coffee / Tea","  ");

                                    break;
                            case 2 :
                                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected  Special Breakfast ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Poha , Jalebi, 1 Coffee","  1 Bread item");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Coffee / Tea","1 Heavy Snaks ");
                                   
                                    break;
                             case 3 :
                                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected  Special Breakfast ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Poha , 1 Jalebi","  1 Bread item");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Coffee / Tea","2 Heavy Snaks ");
                                   
                                    break;
                          }

                     break;
                default :
                        System.out.println( "Invalid Valid !");


            }
        }


    
    }
}