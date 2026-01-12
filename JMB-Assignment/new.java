import java.util.Scanner;

class JmbRestruraunt {
    Scanner sc = new Scanner(System.in);  
    String drink;
    String soup; 
    String vegetable;
    String  vegetable2;
    String paneer;
    String curd;
    String starter;
    String  starter2 ;
    String dal;
    String rice;
    String sweetdish;
     String drinkName;
     String paneerStarter;
    //   String tempVeg2 ;


    String RESET = "\u001B[0m";
    String CREAM_BACKGROUND = "\u001B[48;2;255;253;208m";
    String PEACH_BACKGROUND = "\u001B[48;2;255;218;185m";
    String BLACK_TEXT = "\u001B[30m";
    String WHITE_BACKGROUND = "\u001B[47m";
     String RED_TEXT = "\u001B[31m";


    //================ Drink / Soup ==================
    void drinkSoup() {

        while (true) {
            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n","Offering you a Welcome Drink or Soup ");
            System.out.println("Press 1. For  Welcome Drink  ");
            System.out.println("Press 2. For  Soup  ");
            int d = sc.nextInt();
            if (d==1){
                drinkName = "Welcome Drink";
            }
            else{
                drinkName = "Soup";
            }

            
            if (d == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n","````````` Welcome Drink```````` ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1. Mineral Water ","   4. Blue Lagoon    ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 2. Butter Milk ","   5. Rasna Water  ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 3. Fresh Lime Water ","   6. Strawberry Delight  ");
                System.out.println("Press No. for Drink..");
                int dk = sc.nextInt();
                 if (dk == 1) {
                 drink = " Mineral Water";
                 break;
              }
              
               else if (dk == 2) {
                drink = "Butter Milk";
                break;
               } 
               else if (dk == 3) {
                drink = "Fresh Lime Water";
                break;
               } 
               else if (dk == 4) {
                drink = " Blue Lagoon";
                break;
               } 
               else if (dk == 5) {
                drink = "Rasna Water";
                break;
               } 
               else if (dk== 6){
                drink = "Strawberry Delight";
                break;
              }
              else{
                System.out.println("Invalid Input");
              }
                break;

}
            else if (d == 2) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n","````````````Soup```````````` ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1. Tomato Soup ","   4. Mushroom Soup   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 2. Sweet corn Soup ","   5. Hot & Sour Veg Soup  ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 3. Vegetable Clear Soup ","   6. Dal Soup  ");
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
               else if (sp == 6){
                soup = "Dal Soup";
                break;
              }
              else{
                System.out.println("Invalid input");
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
            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+ "\n"," `````````Varities of Vegetable dishes````````");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s"+ RESET +"\n"," 1 Mix veg ","  6 Nav Ratan Korma   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s"+ RESET +"\n"," 2 Lohri Aloo with Mutter ","  7 Bhindi Masala   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s"+ RESET+ "\n"," 3 Aloo Mutter ","  8 Aloo Do Pyaza   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s"+ RESET +"\n"," 4 Kadi Punjabi ","  9 Aloo Palak   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s"+ RESET +"\n"," 5 Green Chana (Seasonal) ","  10 Dum Aloo   ");
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
            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n"," `````````Varities of Vegetable dishes````````");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s"+RESET+"\n"," 1 Mix veg ","  6 Nav Ratan Korma   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s"+RESET+"\n"," 2 Lohri Aloo with Mutter ","  7 Bhindi Masala   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s"+RESET+"\n"," 3 Aloo Mutter ","  8 Aloo Do Pyaza   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s"+RESET+"\n"," 4 Kadi Punjabi ","  9 Aloo Palak   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s"+RESET+"\n"," 5 Green Chana (Seasonal) ","  10 Dum Aloo   ");
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
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n"," `````````Paneer Dishes````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Paneer Butter Masala ","  6 Kadhai Paneer   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 2 Shahi Paneer ","  7 Paneer Tikka Masala   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 3 Matar Paneer ","  8 Palak Paneer   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 4 Paneer Bhurji ","  9 Paneer Pasanda   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 5 Paneer Do Pyaza ","  10 Chilli Paneer   ");
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
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n"," `````````Curd Dishes````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Plain Curd ","  4 Boondi Raita   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 2 Fruit Raita ","  5 Onion Raita   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 3 Mix Veg Raita ","  6 Cucumber Raita   ");
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

  //================= Starter 1 ==================
void getStarter() {
    while (true) {
        System.out.println("\nPress 1. for Selecting the Starters");
        int s = sc.nextInt();

        if (s == 1) {
            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n"," `````````Starters````````");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Veg Manchurian ","  4 Spring Roll   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 2 Chilli Mushroom ","  5 Veg Crispy   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 3 Paneer Chilli ","  6 Baby Corn Chilli   ");

            System.out.println("Press No. for Selecting Starter..");
            int srt = sc.nextInt();

                if (srt == 1) {
               starter = "Veg Manchurian";
              } else if (srt == 2) {
               starter = "Chilli Mushroom";
              } else if (srt == 3) {
                 starter = "Paneer Chilli";
              } else if (srt == 4) {
               starter = "Spring Roll";
             } else if (srt == 5) {
                starter = "Veg Crispy";
            } else if (srt == 6) {
              starter = "Baby Corn Chilli";
             } else {
             System.out.println("Invalid Input, Try Again...");
            continue;  // ye tabhi chalega jab aap ye code loop ke andar use kar rahe ho
}

            break; // valid input milne  per exit
        } else {
            System.out.println("Invalid press ...Try Again");
        }
    }
}

//================= Starter 2 ==================
void getStarter2() {
    while (true) {
        System.out.println("\nPress 1. for Selecting the Starters");
        int s = sc.nextInt();

        if (s == 1) {
            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET +"\n"," `````````Starters````````");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1 Veg Manchurian ","  4 Spring Roll   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 2 Chilli Mushroom ","  5 Veg Crispy   ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 3 Paneer Chilli ","  6 Baby Corn Chilli   ");

            System.out.println("Press No. for Selecting Starter..");
            int srt = sc.nextInt();

            String tempStarter2 = null;
            switch (srt) {
                case 1: tempStarter2 = "Veg Manchurian"; break;
                case 2: tempStarter2 = "Chilli Mushroom"; break;
                case 3: tempStarter2 = "Paneer Chilli"; break;
                case 4: tempStarter2 = "Spring Roll"; break;
                case 5: tempStarter2 = "Veg Crispy"; break;
                case 6: tempStarter2 = "Baby Corn Chilli"; break;
                default: {
                    System.out.println("Invalid Input, Try Again...");
                    continue;
                }
            }

            // Duplicate check
            if (tempStarter2.equals(starter)) {
                System.out.println("You Already Selected this Starter, choose another one...");
                continue; 
            } else {
                starter2 = tempStarter2;
                break; // valid selection → exit
            }
        } else {
            System.out.println("Invalid press ...Try Again");
        }
    }
}

    //================ Dal ==================
    void getDal() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Dal dishes");
            int d = sc.nextInt();

            if (d == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET +"\n"," `````````Dal Dishes````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1 Dal Tadka ","  4 Dal Panchmel   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 2 Dal Fry ","  5 Rajma Masala   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 3 Dal Makhani ","  6 Chole Masala   ");
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
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n"," `````````Rice Dishes````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Plain Rice ","  4 Jeera Rice   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 2 Veg Pulao ","  5 Veg Biryani   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 3 Peas Pulao ","  6 Paneer Pulao   ");
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
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n"," `````````Sweet Dishes````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Gulab Jamun ","  4 Ice Cream   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 2 Rasgulla ","  5 Jalebi   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 3 Kheer ","  6 Halwa   ");
               System.out.println("Press No. for Selecting Sweet Dishes..");
                int srd = sc.nextInt();
                 if (srd == 1) {
                 sweetdish = " Gulab Jamun";
              }
              
               else if (srd == 2) {
                sweetdish = " 2 Rasgulla  ";
               } 
               else if (srd == 3) {
                sweetdish = " Kheer";
               } 
               else if (srd == 4) {
                sweetdish = "  4 Ice Cream  ";
               } 
               else if (srd == 5) {
                sweetdish = "Jalebi  ";
               } 
               else {
                sweetdish = "Halwa";
              }
                break;
            }
            else {
                System.out.println(" Invalid press ...Try Again");
            }
        }
    }



//paneer Starter 
 void getPaneerStarter() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Paneer Starter");
            int ps = sc.nextInt();

            if (ps == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n"," `````````Paneer Starter````````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Paneer Chilli ","  4 Paneer 65   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 2 Paneer Tikka ","  5 Paneer Pudina Tikka   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 3 Dragon Paneer ","  6 Paneer Achari Tikka   ");
               System.out.println("Press No. for Selecting Sweet Dishes..");
                 ps = sc.nextInt();
                 if (ps == 1) {
                 paneerStarter = "Paneer Chilli";
              }
              
               else if (ps == 2) {
                paneerStarter = " Paneer Tikka ";
               } 
               else if (ps == 3) {
                paneerStarter = "Dragon Paneer";
               } 
               else if (ps == 4) {
                paneerStarter = " Paneer 65  ";
               } 
               else if (ps == 5) {
                paneerStarter = "Paneer Pudina Tikka ";
               } 
               else if (ps==6){
                paneerStarter = " Paneer Achari Tikka ";
              }
              else {
                System.out.println("Invalid Value");
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
        getVegetable2();
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
        getVegetable2();
        getPaneer();
        getDal();
        getRice();
        getCurd();
         System.out.println("\nYou Can Choose Two Starter........");
        System.out.println("\nChoose 1st Starter........");
        getStarter();
        System.out.println("\nChoose 2nd Starter........");
        getStarter2();
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
        getVegetable2();
        getPaneer();
        getDal();
        getRice();
        getCurd();
       
         System.out.println("\nYou Can Choose Two Starter........");
        System.out.println("\nChoose 1st Starter........");
        getStarter();
        System.out.println("\nChoose 2nd Starter........");
        getStarter2();
         System.out.println("\n Choose Paneer Starter........");
        getPaneerStarter();
        getSweetDish();

}

// LADIES MENI 1
void getLadiesA(){
    drinkSoup();
    getStarter();
    getSweetDish();
    

}
// LADIES MENI 2
void getLadiesB(){
    drinkSoup();
    getStarter();
    getSweetDish();


}
// LADIES MENI 3
void getLadiesC(){
    drinkSoup();
    getStarter();
    getSweetDish();
    getPaneerStarter();


}

}

//================ Main Class (unchanged) ==================
class Jmb2{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        JmbRestruraunt jb = new JmbRestruraunt();

String RESET = "\u001B[0m";
String CREAM_BACKGROUND = "\u001B[48;2;255;253;208m";
String PEACH_BACKGROUND = "\u001B[48;2;255;218;185m";
String BLACK_TEXT = "\u001B[30m";
 String WHITE_BACKGROUND = "\u001B[47m";
String RED_TEXT = "\u001B[31m";

String vegName = "";
String thaliname = "";
String breakfastname = "";
int  breakfastPrice = 0;
String ladiesdish ="";
int ladiesdishprice = 0;
 int thaliPrice = 0;
int Quantity1 =0;
 String cosName = "";
 String cosNo = "";
String cosAddress = "";
 String breakfast = "";
 String ladiesMenu = "";

 int choice;
      
         while(true){
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET+"\n","``````````````Welcome to JMB`````````````");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+ RESET +"\n","1. VEGETARIAN MENU ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+ RESET +"\n", "2. BREAKFAST MENU ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+ RESET +"\n", "3. Only For Ladies MENU ");
         System.out.println( RESET);
          System.out.println("Hello sir/Ma'am  Choose Menu !");
         choice = sc.nextInt();
        
     
           
            if (choice == 1) {
            vegName = "Vegetable";
            break;
        } else if (choice == 2) {
            vegName = "Breakfast";
            break;
        } else if (choice == 3) {
            vegName = "Ladies Menu";
            break;
        } else {
            System.out.println("Invalid choice!");
        }
         }

            switch(choice){
                case 1 :
                        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","``````Varities of JMB Thali`````` ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+ RESET+"\n","1.  Thali 'A' --------------------->(rs 310)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+RESET +"\n", "2.  Thali 'B' --------------------->(rs 360)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s "+RESET +"\n", "3.  Thali 'C' --------------------->(rs 410)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+RESET +"\n", "4.  Thali 'D' --------------------->(rs 470)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s "+RESET +"\n", "5.  Thali 'E' --------------------->(rs 600)");
                        System.out.println( RESET);

                        System.out.println("Select Thali as per your Mood ........");
                    
                        int n = sc.nextInt();

                        if(n==1){
                            thaliPrice = 310;

                        }
                        else if (n == 2){
                            thaliPrice = 360;
                        }
                        else if (n == 3){
                            thaliPrice = 410;
                        }
                        else if (n == 4){
                            thaliPrice = 470;
                        }
                        else if (n == 5){
                            thaliPrice = 600;
                        }
                        else {
                            System.out.println("No Thali Choose");
                        }

               
               sc.nextLine();
               while (true) {
                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET +"\n","````````````Enter Custumer Name``````````");
                   cosName = sc.nextLine();
                        if (cosName.matches("[a-zA-Z ]+")) {
                        break;
                        } else {
                        System.out.println("Invalid input! Name should contain only alphabets. Try again.");
                           }
                           }

             while (true) {
                 System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n","````````````Enter Custumer No.``````````");
                 cosNo = sc.nextLine().trim();

                char first = cosNo.charAt(0);

                if ((first == '9'|| first=='8'|| first=='7'|| first =='6') && cosNo.matches("\\d{10}")) { 
                break;
                } else {
                System.out.println("Invalid mobile number! Please enter a 10-digit number starting with 6 to 9.");
                      }
                      }
            
              while (true) {
                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n","````````````Enter Custumer Address``````````");
                   cosAddress = sc.nextLine();
                   if (cosAddress.matches("[a-zA-Z ]+")) {
                   break;
                  } else {
                   System.out.println("Invalid input! Name should contain only alphabets. Try again.");
                         }
                         }
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n", "Show Your Valid Id For More Verification");
        System.out.println();
        System.out.println();
       while (true) {
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n","````````````Enter Quantity For Booking``````````");
        if (sc.hasNextInt()) {
            Quantity1 = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            if (Quantity1 > 0) {
                break;
            } else {
                System.out.println(" Quantity must be greater than 0.");
            }
        } else {
            System.out.println(" Invalid input! Please enter a number.");
            sc.next(); // discard wrong input
    }
  }
         System.out.println("Booking Successfully Completed .....");



                        if (n==1){
                            thaliname = "Thali 'A' -> (rs 310) ";
                        }
                        else if(n==2){
                            thaliname = "Thali 'B' -> (rs 360) ";
                        }
                        else if(n==3){
                            thaliname = "Thali 'C' -> (rs 410) ";
                        }
                        else if(n==4){
                            thaliname = "Thali 'D' -> (rs 470) ";
                        }
                        else if(n==5){
                            thaliname = "Thali 'E' -> (rs 600) ";
                        }
                        else {
                            System.out.println("Invalid Choice !");
                        }
                        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n"," "+thaliname+" Selected Succesfully ");
                        System.out.println("\n");
                    
                            switch(n){
                                case 1 :
                                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","Great choice ! you Selected Thali 'A' ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Soup or Welcome Drink","   Roti, Naan   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Vegitable Dish","  Butter Paratha ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1  Dal  ","  Pickle, Salad, Papad   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1  Rice "," 1 Sweet Dish or Ice cream   ");
                                    System.out.println();
                                    jb.getThaliA();

                            
                                    break;
                                case 2 :
                                     System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","Great choice ! you Selected Thali 'B' ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Soup or Welcome Drink","   Roti, Naan   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 2 Vegitable Dish","  Butter Paratha ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Dal fry  ","  Pickle, Salad, Papad   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1 Rice "," 1 Sweet Dish or Ice cream   ");
                                    jb.getThaliB();
                                    
                                    break;
                                case 3 :
                                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","Great choice ! you Selected Thali 'C' ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1 Soup or Welcome Drink","   Roti, Naan   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s "+RESET +"\n"," 2  Vegitable Dish","  Butter Paratha ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1 Paneer Dish","  1 Starter ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s "+RESET +"\n"," 1  Dal  ","  Pickle, Salad, Papad   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s "+RESET +"\n"," 1  Rice "," 1 Sweet Dish or Ice cream   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s "+RESET +"\n"," 1  Curd Dish ","   ");
                                    jb.getThaliC();

                                    break;
                                case 4 :
                                     System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected Thali 'D ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1 Soup or Welcome Drink","   Roti, Naan   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s "+RESET +"\n" ," 2  Vegitable Dish","  Butter Paratha ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s "+RESET +"\n"," 1 Paneer Dish","  2 Starter ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET+"\n"," 1  Dal  ","  Pickle, Salad, Papad   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1  Rice "," 1 Sweet Dish or Ice cream   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1  Curd Dish "," Coffee  ");
                                  
                                    jb.getThaliD();
                                    break;

                                 case 5 :
                                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","Great choice ! you Selected Thali 'E' ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1 Soup or Welcome Drink","   Roti, Naan   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 2  Vegitable Dish","  Butter Paratha ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1 Paneer Dish","  2 Starter ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1  Dal  ","  Pickle, Salad, Papad   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1  Rice "," 1 Sweet Dish or Ice cream   ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1  Curd Dish "," 1 Paneer Starter  ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %-30s"+RESET +"\n"," 1  Pasta ","  ");
                                    jb.getThaliE();
                                    break;
                                
                                 default :
                                        System.out.println("Invalid Data Input");
                                    break;
                            }
                        break;

                case 2 :
                            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","````Varities of JMB Breakfast ");
                            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","1.  BreakFast 'A'------------->   (rs 200)");
                            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","2.  BreakFast 'B'------------->   (rs 230)");
                            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","3.  BreakFast 'C'------------->   (rs 250)");
                            System.out.println( RESET);

                            System.out.println("Select BreakFast as per your Mood ........");
                            int n2 = sc.nextInt();

                            if (n2==1){
                            breakfastname = " BreakFast 'A' -> (rs 200) ";
                           }
                          else if(n2==2){
                            breakfastname = " BreakFast 'B' -> (rs 230) ";
                           }
                           else if(n2==3){
                            breakfastname = " BreakFast 'C' -> (rs 250) ";
                          }
                          else {
                            System.out.println("Invalid Choice !");
                          }

                  sc.nextLine();
                    while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET +"\n","````````````Enter Custumer Name``````````");
                    cosName = sc.nextLine();
                        if (cosName.matches("[a-zA-Z ]+")) {
                        break;
                        } else {
                        System.out.println("Invalid input! Name should contain only alphabets. Try again.");
                           }
                           }

                while (true) {
                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n","````````````Enter Custumer No.``````````");
                   cosNo = sc.nextLine().trim();

                   char first = cosNo.charAt(0);

                   if ((first == '9'|| first=='8'|| first=='7'|| first =='6') && cosNo.matches("\\d{10}"))
                   { 
                  break;
                  } else {
                  System.out.println("Invalid mobile number! Please enter a 10-digit number starting with 6 to 9.");
                      }
                      }
            
               while (true) {
                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n","````````````Enter Custumer Address``````````");
                   cosAddress = sc.nextLine();
                   if (cosAddress.matches("[a-zA-Z ]+")) {
                   break;
                   } else {
                   System.out.println("Invalid input ! Name should contain only alphabets. Try again.");
                         }
                         }
                  System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n", "Show Your Valid Id For More Verification");
                  System.out.println();

            while (true) {
                 System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n","````````````Enter Quantity For Booking``````````");
                 if (sc.hasNextInt()) {
                 Quantity1 = sc.nextInt();
                 sc.nextLine(); // consume leftover newline
                      if (Quantity1 > 0) {
                      break;
                     } else {
                      System.out.println(" Quantity must be greater than 0.");
                      }
                } else {
                System.out.println(" Invalid input! Please enter a number.");
                sc.next(); // discard wrong input
}
}
                System.out.println("Booking Successfully Completed .....");

                           if(n2==1){
                            breakfastPrice = 200;
                        }
                        else if (n2 == 2){
                            breakfastPrice = 230;
                        }
                        else if (n2 == 5){
                            breakfastPrice = 250;
                        }
                        else {
                            System.out.println("No BreakFast Choose");
                        }

                        //  String breakfast = "";
                          switch(n2){

                  case 1:
                           breakfast = PEACH_BACKGROUND + BLACK_TEXT + " Breakfast 'A'  " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Poha , Jalebi, 1 Coffee      |   1 Bread item " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Coffee / Tea                 |                " + RESET;

                             break;

                 case 2:
                            breakfast = PEACH_BACKGROUND + BLACK_TEXT + "  Breakfast 'B' " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Poha , Jalebi, 1 Coffee      |   1 Bread item " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Coffee / Tea                 |   1 Heavy Snacks " + RESET;
                           break;

                case 3:
                          breakfast = PEACH_BACKGROUND + BLACK_TEXT + " Breakfast 'C' " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Poha , Jalebi                |   1 Bread item " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Coffee / Tea                 |   2 Heavy Snacks " + RESET;
                          break;

              default:
                         breakfast = "Invalid Choice!";
                        break;        
        }
        break;

//for Ladies...............
       case 3 :
                        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","````Varities of JMB Ladies Menu ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","1.   'A'------------->   (rs 250)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","2.   'B'------------->   (rs 300)");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s"+RESET+"\n","3.   'C'------------->   (rs 350)");
                        System.out.println( RESET);

                        System.out.println("Select Ladies Dish as per your Mood ........");
                          int n3 = sc.nextInt();

                         if (n3==1){
                            ladiesdish = " LadiesMenu 'A' -> (rs 250) ";
                        }
                        else if(n3==2){
                            ladiesdish = " LadiesMenu 'B' -> (rs 300) ";
                        }
                        else if(n3==3){
                            ladiesdish = " LadiesMenu 'C' -> (rs 350) ";
                        }
                        else {
                            System.out.println("Invalid Choice !");
                        }

                sc.nextLine();
               while (true) {
                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET +"\n","````````````Enter Custumer Name``````````");
                   cosName = sc.nextLine();
                        if (cosName.matches("[a-zA-Z ]+")) {
                        break;
                        } else {
                        System.out.println("Invalid input! Name should contain only alphabets. Try again.");
                           }
                           }

             while (true) {
                 System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n","````````````Enter Custumer No.``````````");
                 cosNo = sc.nextLine().trim();
                 char first = cosNo.charAt(0);

                  if ((first == '9'|| first=='8'|| first=='7'|| first =='6') && cosNo.matches("\\d{10}"))
                  { 
                  break;
                  } else {
                  System.out.println("Invalid mobile number! Please enter a 10-digit number starting with 6 to 9.");
                      }
                      }
            
              while (true) {
                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n","````````````Enter Custumer Address``````````");
                   cosAddress = sc.nextLine();
                   if (cosAddress.matches("[a-zA-Z ]+")) {
                   break;
                  } else {
                   System.out.println("Invalid input ! Name should contain only alphabets. Try again.");
                         }
                         }
                  System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET+"\n", "Show Your Valid Id For More Verification");
                  System.out.println();

          while (true) {
          System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n","````````````Enter Quantity For Booking``````````");
          if (sc.hasNextInt()) {
                   Quantity1 = sc.nextInt();
                  sc.nextLine(); // consume leftover newline
                  if (Quantity1 > 0) {
                  break;
                  } else {
                  System.out.println(" Quantity must be greater than 0.");
                  }
        } else {
                System.out.println(" Invalid input! Please enter a number.");
                sc.next(); // discard wrong input
}
}
        System.out.println("Booking Successfully Completed .....");

                           if(n3==1){
                            ladiesdishprice = 250;
                        }
                        else if (n3 == 2){
                            ladiesdishprice = 300;
                        }
                        else if (n3 == 3){
                            ladiesdishprice = 350;
                        }
                        else {
                            System.out.println("No  Choose");
                        }

                        //  String breakfast = "";
                          switch(n3){

                  case 1:
                           ladiesMenu = PEACH_BACKGROUND + BLACK_TEXT + " 'A'  " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Soup /                             |   1 Sweet Dish     " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + "  Welcome Drink                       |   1  Starter       " + RESET +"\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + "  1 Snacks                            |   1 Tea/Coffee     "  + RESET;
                           jb.getLadiesA();
                             break;

                 case 2:
                         ladiesMenu = PEACH_BACKGROUND + BLACK_TEXT + " 'A'  " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Soup /                             |   1 Sweet Dish     " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + "  Welcome Drink                       |   1  Starter       " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + "  2 Snacks                            |   1 Tea/Coffee     "  + RESET;
                            jb.getLadiesB();
                            break;

                case 3:
                        ladiesMenu = PEACH_BACKGROUND + BLACK_TEXT + " 'A'  " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Soup / Welcome Drink               |   1 Sweet Dish     " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Starter                            |   1  Starter       " + RESET + "\n"
                          + CREAM_BACKGROUND + BLACK_TEXT + " 1 Snacks                             |   1 Tea/Coffee     "  + RESET;
                           jb.getLadiesC();
                          break;

              default:
                         ladiesMenu = "Invalid Choice!";
                        break;        
                 }
                  break;


             default :
                        System.out.println( "Invalid Value !");
                        break;
        }

         System.out.println();
         System.out.printf(WHITE_BACKGROUND + RED_TEXT +"%-60s"+RESET +"\n","Nice To Greeting You Sir/Ma,am ");
         System.out.println();
         System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s "+RESET +"\n"," How Many Members Are Come  Plzz Comform Again");
         int Quantity2 = sc.nextInt();
  
//====================================================Formula od Bill Condition============================================

int extraChargePerHead =0; // agar 10% se jyada aaye to per head extra charge
int total =0;
double gst = 0;
double totalBill = 0;

if (choice==1){

int minAllowed = (Quantity1 * 1) / 100;   // 1% of booked
int maxAllowed = (Quantity1 * 110) / 100;  // 110% of booked

if (Quantity2 >= minAllowed && Quantity2 <= maxAllowed) {
                                                    //  1% - 110% range → sirf booked thali ka paisa
    total = Quantity1 * thaliPrice;
} else if (Quantity2 > maxAllowed) {
                                                   //  110% se upar → booked + (present - 110%) thali
    int extra = Quantity2 - maxAllowed;
    total = (Quantity1 + extra) * thaliPrice;
} else {
                                                  //  90% se kam aaye → booked ka hi paisa
    total = Quantity1 * thaliPrice;
}
     gst = total*0.18;
    totalBill = total+gst;
}
//=====================================================================================
else if (choice == 2){
int minAllowed = (Quantity1 * 1) / 100;   // 1% of booked
int maxAllowed = (Quantity1 * 110) / 100;  // 110% of booked

if (Quantity2 >= minAllowed && Quantity2 <= maxAllowed) {
                                                    //  1% - 110% range → sirf booked thali ka paisa
    total = Quantity1 * breakfastPrice;
} else if (Quantity2 > maxAllowed) {
                                                 //  110% se upar → booked + (present - 110%) thali
    int extra = Quantity2 - maxAllowed;
    total = (Quantity1 + extra) * breakfastPrice;
} else {
                                                   //  90% se kam aaye → booked ka hi paisa
    total = Quantity1 * breakfastPrice;
}
    gst = total*0.18;
    totalBill = total+gst;
}
//==================================================================================
else  {
 int minAllowed = (Quantity1 * 1) / 100;   // 1% of booked
 int maxAllowed = (Quantity1 * 110) / 100;  // 110% of booked

if (Quantity2 >= minAllowed && Quantity2 <= maxAllowed) {
                                                    //  1% - 110% range → sirf booked thali ka paisa
    total = Quantity1 * ladiesdishprice;
} else if (Quantity2 > maxAllowed) {
                                                 //  110% se upar → booked + (present - 110%) thali
    int extra = Quantity2 - maxAllowed;
    total = (Quantity1 + extra) * ladiesdishprice;
} else {
                                                   //  90% se kam aaye → booked ka hi paisa
    total = Quantity1 * ladiesdishprice;
     }
    gst = total*0.18;
    totalBill = total+gst;  
  }
 //======================================Bill Print===============================================

while (true) {
    System.out.println("Hello Sir ,Please Confirm  What you Booked Breakfast / Vegetable / Ladies Menu ");
    System.out.println("Press 1 for Breakfast Or Press 2 for Vegetables Or Press 3 For Ladies Menu");
    int bv = sc.nextInt();

    switch (bv){
       case 1 : 
        System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET +"\n\n", "====================== JMB BILL =====================");
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer Name                   : " + cosName);
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer No                     : " + cosNo);
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer Address                : " + cosAddress);
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Thali Selected                  : " + breakfastname);
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Quantity                        : " + Quantity2);
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "----------------------------------------------------");
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "BreakFast Type                  : " + breakfast);
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "----------------------------------------------------");
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Total Amount                    : Rs " + total);
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Total Bill Amount (Gst)          : Rs " + totalBill);
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "====================================================");

        break; // breakfast ka bill print hone ke baad loop se bahar nikalna hoga

        case 2: 
              System.out.println("Plzz Confirm Which Type Of Thali You Book ! ");
              System.out.println("Press 1 for Thali 'A' / 2 For Thali 'B'  / 3 For Thali 'C' / 4 For Thali 'D' / 5 For Thali 'E' ");
              
              int confirm_no;
              while (true) {   // sirf thali ke liye loop
                  confirm_no = sc.nextInt();
                  
                  switch(confirm_no){
                      case 1 : 
                          // === Thali A ka bill ===
                         System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET +"\n","====================== JMB BILL ====================");
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer Name            : " + cosName);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer No              : " + cosNo);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer Address         : " + cosAddress);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Thali Selected           : " + thaliname);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Quantity                 : " + Quantity2);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","----------------------------------------------------");
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Vegetable Dish 1         : " + jb.vegetable);
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Dal                      : " + jb.dal);
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Rice                     : " + jb.rice);
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Sweet Dish               : " + jb.sweetdish);
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," Roti , Nan, Butter Paratha,");
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," Pickle, Salad, Papad,");
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","----------------------------------------------------");
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","Total Amount    : Rs " + total);
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","Total Bill Amount (Gst)   : Rs " + totalBill);
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","====================================================");
                          break;

                      case 2 :
                          // === Thali B ka bill ===
                        
                          System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET +"\n","====================== JMB BILL ====================");
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer Name            : " + cosName);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer No              : " + cosNo);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer Address         : " + cosAddress);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Thali Selected           : " + thaliname);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Quantity                 : " + Quantity2);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","----------------------------------------------------");
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Vegetable Dish 1         : " + jb.vegetable);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Vegetable Dish 2         : " + jb.vegetable2);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Dal                      : " + jb.dal);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Rice                     : " + jb.rice);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Sweet Dish               : " + jb.sweetdish);
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," Roti , Nan, Butter Paratha,");
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," Pickle, Salad, Papad,");
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","----------------------------------------------------");
                         System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","Total Amount    : Rs " + total);
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","Total Bill Amount (Gst)   : Rs " + totalBill);
                        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","====================================================");
                          break;

                      case 3 :
                          // === Thali C ka bill ===
                           System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET +"\n","====================== JMB BILL ====================");
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer Name            : " + cosName);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer No              : " + cosNo);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer Address         : " + cosAddress);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Thali Selected           : " + thaliname);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Quantity                 : " + Quantity2);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","----------------------------------------------------");
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Vegetable Dish 1         : " + jb.vegetable);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Vegetable Dish 2         : " + jb.vegetable2);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Paneer Dish              : " + jb.paneer);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Curd Dish                : " + jb.curd);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Dal                      : " + jb.dal);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Rice                     : " + jb.rice);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Starter 1                : " + jb.starter);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Sweet Dish               : " + jb.sweetdish);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," Roti , Nan, Butter Paratha,");
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," Pickle, Salad, Papad,");
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","----------------------------------------------------");
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","Total Amount    : Rs " + total);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","Total Bill Amount (Gst)   : Rs " + totalBill);
                           System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","====================================================");
                        
                          break;

                      case 4 :
                          // === Thali D ka bill ===
                          System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET +"\n","====================== JMB BILL ====================");
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer Name            : " + cosName);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer No              : " + cosNo);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer Address         : " + cosAddress);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Thali Selected           : " + thaliname);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Quantity                 : " + Quantity2);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","----------------------------------------------------");
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Vegetable Dish 1         : " + jb.vegetable);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Vegetable Dish 2         : " + jb.vegetable2);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Paneer Dish              : " + jb.paneer);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Curd Dish                : " + jb.curd);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Dal                      : " + jb.dal);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Rice                     : " + jb.rice);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Starter 1                : " + jb.starter);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Starter 2                : " + jb.starter2);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Sweet Dish               : " + jb.sweetdish);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," Roti , Nan, Butter Paratha,");
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," Pickle, Salad, Papad,");
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","----------------------------------------------------");
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","Total Amount    : Rs " + total);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","Total Bill Amount (Gst)   : Rs " + totalBill);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","===================================================="); 
                        
                          break;

                      case 5 :
                          // === Thali E ka bill ===
                          System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET +"\n","====================== JMB BILL ====================");
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer Name            : " + cosName);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer No              : " + cosNo);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Customer Address         : " + cosAddress);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Thali Selected           : " + thaliname);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Quantity                 : " + Quantity2);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","----------------------------------------------------");
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Vegetable Dish 1         : " + jb.vegetable);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Vegetable Dish 2         : " + jb.vegetable2);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Paneer Dish              : " + jb.paneer);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Curd Dish                : " + jb.curd);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Dal                      : " + jb.dal);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Rice                     : " + jb.rice);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Starter 1                : " + jb.starter);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Starter 2                : " + jb.starter2);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Paneer Starter           : " + jb.paneerStarter);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Sweet Dish               : " + jb.sweetdish);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," Roti , Nan, Butter Paratha,");
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," Pickle, Salad, Papad,");
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","----------------------------------------------------");
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","Total Amount    : Rs " + total);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","Total Bill Amount (Gst)   : Rs " + totalBill);
                          System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET+"\n","====================================================");
                          break;

                      default : 
                          System.out.println("Invalid input ! Plzz Re-Enter Sir/Ma'am ");
                          continue; // galat input par thali loop dobara chalega
                  }
                  break; // sahi thali milne ke baad thali wala loop se niklo
              }
              break; // thali print hone ke baad main loop se bhi niklo
    
    case 3 :
             System.out.println("Plzz Confirm Which Type Of Thali You Book ! ");
              System.out.println("Press 1 for 'A' / 2 For  'B'  / 3 For  'C'  ");
              
              int confirm_no2;
              while (true) {   // sirf thali ke liye loop
                  confirm_no2 = sc.nextInt();
                  
                  
                  switch(confirm_no2){
                      case 1 :  
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET +"\n\n", "====================== JMB BILL =====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer Name                 : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer No                   : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer Address              : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Dish Selected                : " + ladiesdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Quantity                      : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Starter 1                : " + jb.starter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," 1 Tea ,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," 1 Snacks");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Total Amount                  : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Total Bill Amount (Gst)        : Rs " + totalBill);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "====================================================");
                            break;

                      case 2 :  
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET +"\n\n", "====================== JMB BILL =====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer Name                 : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer No                   : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer Address              : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Thali Selected                : " + ladiesdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Quantity                      : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Starter 1                : " + jb.starter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," 1 Coffee ,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," 2 Snacks");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Total Amount                  : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Total Bill Amount (Gst)        : Rs " + totalBill);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "====================================================");
                            break;

                      case 3 :  
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET +"\n\n", "====================== JMB BILL =====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer Name                 : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer No                   : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Customer Address              : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Thali Selected                : " + ladiesdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Quantity                      : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Starter 1                : " + jb.starter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Paneer Starter           : " + jb.paneerStarter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," 1 Coffee ,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n"," 2 Snacks"); 
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "Total Amount                  : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n","Total Bill Amount (Gst)        : Rs " + totalBill);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET +"\n", "====================================================");
                            break;
                            
                      default : 
                          System.out.println("Invalid input ! Plzz Re-Enter Sir/Ma'am ");
                          continue; // galat input par Ladiesmenu loop dobara chalega
                          }
                          break; // sahi ladies menu  milne ke baad ladies wale loop se niklo
                          }
                           break; //  print hone ke baad main loop se bhi niklo
    


               default : 
              System.out.println(" Invalid Input Plzz ReChoose");
              continue; // main loop dobara chalega
               }
               break; // main loop se nikal jao (sahi bill print hone ke baad)
          }
     
   }
 }
