import java.util.Scanner ;
class JmbRestruraunt{
 String RESET = "\u001B[0m";

 String CREAM_BACKGROUND = "\u001B[48;2;255;253;208m";
 String PEACH_BACKGROUND = "\u001B[48;2;255;218;185m";
//TEXT 
    String BLACK_TEXT = "\u001B[30m";
//  String RED_TEXT = "\u001B[31m";

// Welcome Drink or soup 
    void drinkSoup(){

         Scanner sc = new Scanner(System.in);
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET,"Offering you a Welcome Drink or Soup ");
        System.out.println("Press 1. For  Welcome Drink  ");
        System.out.println("Press 2. For  Soup  ");
        int d = sc.nextInt();
        if(d==1){
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET,"````````` Welcome Drink```````` ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1. Mineral Water "," 4. Blue Lagoon    ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2. Butter Milk ","   5. Rasna Water  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3. Fresh Lime Water ","   6. Strawberry Delight  ");
        }
        else if (d==2){
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET,"````````````Soup```````````` ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1. Tomato Soup "," 4. Mushroom Soup   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2. Sweet corn Soup ","   5. Hot & Sour Veg Soup  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3. Vegetable Clear Soup ","   6. Dal Soup  ");
        }
        else{
            System.out.println("Invalid Value ");
        }
    }
   
 // vegetablessssss..........
         void getVegetable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress 1. for Selecting the Varities of Vegetable dishes");
         int v = sc.nextInt();
         if (v==1){

        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," `````````Varities of Vegetable dishes````````");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Mix veg ","  6 Nav Ratan Korma   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2 Lohri Aloo with Mutter ","  7 Bhindi Masala   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3 Aloo mutter ","  8 Aloo Do Pyaza   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 4 Kadi Punjabi ","  9 Aloo Palak   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 5 Green Chana (Seasonal) ","  10 Dum Aloo   ");
         } 
        else{
            System.out.println("Invalid press ...Try Again");
        }
      }

//Paneer Statrers..
void getPaneer(){
     Scanner sc = new Scanner(System.in);
    System.out.println("\nPress 1. for Selecting the Varities of PANEER DISHES");
     int p = sc.nextInt();
      if (p==1){

        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," Select One Varity As per You Like..");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1. Paneer Butter Masala ","  6. Paneer Tikka Masala   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2. Paneer Punjabi ","  7. Paneer Kadai   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3. Paneer Palak ","  8. Methi Paneer    ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 4. Paneer Mutter ","  9. Paneer Kholapuri   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 5. Paneer Do Pyaza  ","  10. Paneer Chatpata   ");
            // System.out.println("\n Press 1 to 10 Any no. ");
         } 
        else{
            System.out.println("Invalid press ...Try Again");
        }
}
  // Curd Dishes........
  void getCurd(){
     Scanner sc = new Scanner(System.in);
    System.out.println("\nPress 1. for Selecting the Varities of CURD DISHES");
     int cr = sc.nextInt();
      if (cr==1){

        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," Select One Varity As per You Like..");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1. Veg Raita ","  6. Fruit Raita   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2. Loki Raita ","  7. Dahi Raita   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3. Aloo Raita ","     ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 4. Dahi Papdi ","     ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 5. Boondi Raita  ","  ");
            // System.out.println("\n Press 1 to 7 Any no. ");
         } 
        else{
            System.out.println("Invalid press ...Try Again");
        }
  }

  //STARTER PANEER................
  void getStarter(){
     Scanner sc = new Scanner(System.in);
    System.out.println("\nPress 1. for Selecting the Varities of PANEER STARTER");
     int sr = sc.nextInt();
      if (sr==1){

        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET," Select One Varity As per You Like..");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1. Paneer Chilli ","  5. Paneer Pudina Tikka   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 2. Paneer Tikka ","  6. Paneer Achari Tikka   ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 3. Dragon Paneer ","     ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 4. Paneer 65 ","     ");
            // System.out.println("\n Press 1 to 6 Any no. ");
         } 
        else{
            System.out.println("Invalid press ...Try Again");
        }

  }  

       
 //Dal....................
       void getDal(){
        Scanner sc = new Scanner(System.in);
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n\n" + RESET," Select Dal  Items");
        System.out.println("Press 1. For  DAL MENU  ");
        int dl = sc.nextInt();
        if(dl==1){
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n\n" + RESET," Select 1  DAL DISHES as per Your Choice ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 1. Dal Fry    ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 2. Dal Tadka  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 3. Dal Makhani  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 4. Dal Panchrangi ");

        }
        else {
          System.out.println("Invalid press ...plzz Select correctly");
         System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n\n" + RESET," Select 1  DAL DISHES as per Your Choice ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 1. Dal Fry    ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 2. Dal Tadka  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 3. Dal Makhani  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 4. Dal Panchrangi ");
        }
       }
    

        // RICE.............
        void getRice(){
        Scanner sc = new Scanner(System.in);
         System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n\n" + RESET," Select RICE  Items");
        System.out.println("Press 1. For  RICE MENU  ");
        int r = sc.nextInt();
        if(r==1){
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n\n" + RESET," Select 1  RICE DISHES as per Your Choice ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 1. RICE    ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 2. Jeera Rice  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 3. Green Peas Pulao  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 4. Veg Pulao ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 5. Veg Fried RIce ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 6. Veg Biryani ");

        }
        else{
      System.out.println("Invalid press ...plzz Select correctly");
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n\n" + RESET," Select 1  RICE DISHES as per Your Choice ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 1. RICE    ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 2. Jeera Rice  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 3. Green Peas Pulao  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 4. Veg Pulao ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 5. Veg Fried RIce ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 6. Veg Biryani ");

        }   
}
    

 //Sweet dishess and ice creams......
        void getSweetDish(){
        Scanner sc = new Scanner(System.in);

        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n\n" + RESET," Select SWEET DISHES or ICE CREAM");
        System.out.println("Press 1. For  SWEET DISHES  ");
        System.out.println("Press 2. For  ICE CREAM  ");
        int s = sc.nextInt();
        if (s==1){
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n\n" + RESET," Select 1  SWEET DISHE as per Your Choice ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 1. Rasgulla    ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 2. Gulab Jamun  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 3. Gajar Ka Halwa  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 4. Moong Ka Halwa ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 5. Shree Khand ");
        }
        else if (s==2){
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n\n" + RESET," Select 1  ICE CREAM as per Your Choice ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 1. Aam Khand    ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 2. Vanila  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 3. Butter Scotch  ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 4. Sitaphal Basaundi ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s \n"+RESET," 5. Chocolate ");
        }
        else{
             System.out.println("Invalid press ...plzz Select correctly");
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
        getVegetable();
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
class Jmb{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        JmbRestruraunt jb = new JmbRestruraunt();

  String RESET = "\u001B[0m";

// String BLACK_BACKGROUND = "\u001B[40m";
 String CREAM_BACKGROUND = "\u001B[48;2;255;253;208m";
 String PEACH_BACKGROUND = "\u001B[48;2;255;218;185m";

//  final String WHITE_BACKGROUND = "\u001B[47m";

//TEXT 
    String BLACK_TEXT = "\u001B[30m";
//  String RED_TEXT = "\u001B[31m";

// WHITE_TEXT = "\u001B[37m";


        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s \n" + RESET, "``````````````Welcome to JMB`````````````");

        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+ RESET ,"1. VEGETARIAN MENU ");
        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-60s\n"+ RESET, "2. BREAKFAST MENU ");
         System.out.println( RESET);
          System.out.println("\nHello sir/Ma'am  Choose Menu !");

        int choice = sc.nextInt();

        if(choice==1 || choice==2){
            switch(choice){

                case 1 :
                        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"``````Varities of JMB Thali`````` ");
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
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Poha , Jalebi, 1 Coffee","  1 Bread item, 1 Tea ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Coffee / Tea","  ");
                                   
                                    break;
                            case 2 :
                                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected  Special Breakfast ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Poha , Jalebi, 1 Coffee","  1 Bread item, 1 Tea ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Coffee / Tea","1 Heavy Snaks ");
                                   
                                    break;
                             case 3 :
                                   System.out.printf(PEACH_BACKGROUND + BLACK_TEXT +"%-60s\n"+RESET,"Great choice ! you Selected  Special Breakfast ");
                                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT +"%-30s %30s\n"+RESET," 1 Poha , Jalebi, 1 Coffee","  1 Bread item, 1 Tea ");
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