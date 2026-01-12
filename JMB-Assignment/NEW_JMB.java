
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
    String starter2;
    String dal;
    String rice;
    String sweetdish;
    String drinkName;
    String paneerStarter;

    String RESET = "\u001B[0m";
    String CREAM_BACKGROUND = "\u001B[48;2;255;253;208m";
    String PEACH_BACKGROUND = "\u001B[48;2;255;218;185m";
    String BLACK_TEXT = "\u001B[30m";
    String WHITE_BACKGROUND = "\u001B[47m";
    String RED_TEXT = "\u001B[31m";


    //================ Drink / Soup ==================
    void drinkSoup() {

        while (true) {
            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "Offering you a Welcome Drink or Soup ");
            System.out.println("Press 1. For  Welcome Drink  ");
            System.out.println("Press 2. For  Soup  ");
            int d;
            while (true) { // Input validation for d
                if (sc.hasNextInt()) {
                    d = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                    } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter a number (1 or 2)." + RESET);
                    sc.next(); // Consume invalid input
 }
 }
            if (d == 1) {
                drinkName = "Welcome Drink";
                } else if (d == 2) {
                drinkName = "Soup";
}


            if (d == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "`````` Welcome Drink`` ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1. Mineral Water ", "   4. Blue Lagoon    ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2. Butter Milk ", "   5. Rasna Water  ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 3. Fresh Lime Water ", "   6. Strawberry Delight  ");
                System.out.println("Press No. for Drink..");
                int dk;
                while (true) { // Input validation for dk
                    if (sc.hasNextInt()) {
                        dk = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (dk >= 1 && dk <= 6) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 6." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


                if (dk == 1) {
                    drink = " Mineral Water";
                    break;
                } else if (dk == 2) {
                    drink = "Butter Milk";
                    break;
                } else if (dk == 3) {
                    drink = "Fresh Lime Water";
                    break;
                } else if (dk == 4) {
                    drink = " Blue Lagoon";
                    break;
                } else if (dk == 5) {
                    drink = "Rasna Water";
                    break;
                } else if (dk == 6) {
                    drink = "Strawberry Delight";
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid Input, please try again." + RESET);
                }


            } else if (d == 2) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "``````Soup`````` ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1. Tomato Soup ", "   4. Mushroom Soup   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2. Sweet corn Soup ", "   5. Hot & Sour Veg Soup  ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 3. Vegetable Clear Soup ", "   6. Dal Soup  ");
                System.out.println("Press No. for Soup..");
                int sp;
                while (true) { // Input validation for sp
                    if (sc.hasNextInt()) {
                        sp = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (sp >= 1 && sp <= 6) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 6." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


                if (sp == 1) {
                    soup = " Tomato Soup ";
                    break;
                } else if (sp == 2) {
                    soup = "Sweet corn Soup";
                    break;
                } else if (sp == 3) {
                    soup = "Vegetable Clear Soup";
                    break;
                } else if (sp == 4) {
                    soup = " Mushroom Soup ";
                    break;
                } else if (sp == 5) {
                    soup = "Hot & Sour Veg Soup";
                    break;
                } else if (sp == 6) {
                    soup = "Dal Soup";
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input, please try again." + RESET);
                }
            } else {
                System.out.println(RED_TEXT + "Invalid Value, please try again..." + RESET);
            }
        }
    }

    //================ Vegetable ==================
    void getVegetable() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Varities of Vegetable dishes");
            int v;
            while (true) { // Input validation for v
                if (sc.hasNextInt()) {
                    v = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter 1." + RESET);
                    sc.next(); // Consume invalid input
                }
            }


            if (v == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " `````Varities of Vegetable dishes```````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %30s" + RESET + "\n", " 1 Mix veg ", "  6 Nav Ratan Korma   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %30s" + RESET + "\n", " 2 Lohri Aloo with Mutter ", "  7 Bhindi Masala   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %30s" + RESET + "\n", " 3 Aloo Mutter ", "  8 Aloo Do Pyaza   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %30s" + RESET + "\n", " 4 Kadi Punjabi ", "  9 Aloo Palak   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %30s" + RESET + "\n", " 5 Green Chana (Seasonal) ", "  10 Dum Aloo   ");
                System.out.printf(RESET);

                System.out.println("Press No. for Selecting Vegetable..");
                int vg;
                while (true) { // Input validation for vg
                    if (sc.hasNextInt()) {
                        vg = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (vg >= 1 && vg <= 10) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 10." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


                switch (vg) {
                    case 1:
                        vegetable = "Mix veg";
                        break;
                    case 2:
                        vegetable = "Lohri Aloo with Mutter";
                        break;
                    case 3:
                        vegetable = "Aloo Mutter";
                        break;
                    case 4:
                        vegetable = "Kadi Punjabi";
                        break;
                    case 5:
                        vegetable = "Green Chana";
                        break;
                    case 6:
                        vegetable = "Nav Ratan Korma";
                        break;
                    case 7:
                        vegetable = "Bhindi Masala";
                        break;
                    case 8:
                        vegetable = "Aloo Do Pyaza";
                        break;
                    case 9:
                        vegetable = "Aloo Palak";
                        break;
                    case 10:
                        vegetable = "Dum Aloo";
                        break;
                    default: {
                        System.out.println(RED_TEXT + " Invalid Input, Try Again..." + RESET);
                        continue;
                    }
                }
                break;
            } else {
                System.out.println(RED_TEXT + "Invalid press ...Try Again" + RESET);
            }
        }
    }

    //================ Vegetable2 ==================
    void getVegetable2() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Varities of Vegetable dishes");
            int v;
            while (true) { // Input validation for v
                if (sc.hasNextInt()) {
                    v = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter 1." + RESET);
                    sc.next(); // Consume invalid input
                }
            }

            if (v == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " ``````Varities of Vegetable dishes```````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %30s" + RESET + "\n", " 1 Mix veg ", "  6 Nav Ratan Korma   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %30s" + RESET + "\n", " 2 Lohri Aloo with Mutter ", "  7 Bhindi Masala   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %30s" + RESET + "\n", " 3 Aloo Mutter ", "  8 Aloo Do Pyaza   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %30s" + RESET + "\n", " 4 Kadi Punjabi ", "  9 Aloo Palak   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %30s" + RESET + "\n", " 5 Green Chana (Seasonal) ", "  10 Dum Aloo   ");
                System.out.printf(RESET);

                System.out.println("Press No. for Selecting Vegetable..");
                int vg;
                while (true) { // Input validation for vg
                    if (sc.hasNextInt()) {
                        vg = sc.nextInt();
                        sc.nextLine(); // Consume newline
                          if (vg >= 1 && vg <= 10) {
                            break;
                          } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 10." + RESET);
                          }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                    }

                String tempVeg2 = null;
                switch (vg) {
                    case 1:
                        tempVeg2 = "Mix veg";
                        break;
                    case 2:
                        tempVeg2 = "Lohri Aloo with Mutter";
                        break;
                    case 3:
                        tempVeg2 = "Aloo Mutter";
                        break;
                    case 4:
                        tempVeg2 = "Kadi Punjabi";
                        break;
                    case 5:
                        tempVeg2 = "Green Chana";
                        break;
                    case 6:
                        tempVeg2 = "Nav Ratan Korma";
                        break;
                    case 7:
                        tempVeg2 = "Bhindi Masala";
                        break;
                    case 8:
                        tempVeg2 = "Aloo Do Pyaza";
                        break;
                    case 9:
                        tempVeg2 = "Aloo Palak";
                        break;
                    case 10:
                        tempVeg2 = "Dum Aloo";
                        break;
                    default: {
                        System.out.println(RED_TEXT + " Invalid Input, Try Again..." + RESET);
                        continue;
                    }
                }

                // Duplicate check
                if (tempVeg2.equals(vegetable)) {
                    System.out.println(RED_TEXT + " You Already Selected this Vegetable, choose another one..." + RESET);
                    continue; //
                } else {
                    vegetable2 = tempVeg2;
                    break; // valid selection -> loop exit
                }
            } else {
                System.out.println(RED_TEXT + "Invalid press ...Try Again" + RESET);
            }
        }
    }


    //================ Paneer ==================
    void getPaneer() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Paneer dishes");
            int p;
            while (true) { // Input validation for p
                if (sc.hasNextInt()) {
                    p = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter 1." + RESET);
                    sc.next(); // Consume invalid input
                }
            }


            if (p == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " `````Paneer Dishes```````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Paneer Butter Masala ", "  6 Kadhai Paneer   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2 Shahi Paneer ", "  7 Paneer Tikka Masala   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 3 Matar Paneer ", "  8 Palak Paneer   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 4 Paneer Bhurji ", "  9 Paneer Pasanda   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 5 Paneer Do Pyaza ", "  10 Chilli Paneer   ");
                System.out.println("Press No. for Selecting Paneer Dishes..");
                int pn;
                while (true) { // Input validation for pn
                    if (sc.hasNextInt()) {
                        pn = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (pn >= 1 && pn <= 10) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 10." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


                if (pn == 1) {
                    paneer = " Paneer Butter Masala";
                } else if (pn == 2) {
                    paneer = "Sahi Paneer ";
                } else if (pn == 3) {
                    paneer = " Muttar Paneer";
                } else if (pn == 4) {
                    paneer = " Paneer Bhurji ";
                } else if (pn == 5) {
                    paneer = " Paneer Do Pyaza";
                } else if (pn == 6) {
                    paneer = "Kadhai Paneer";
                } else if (pn == 7) {
                    paneer = "Paneer Tikka Masala";
                } else if (pn == 8) {
                    paneer = "Palak Paneer ";
                } else if (pn == 9) {
                    paneer = " Paneer Pasanda";
                } else if (pn == 10) { // Added for Chilli Paneer
                    paneer = " Chilli Paneer";
                } else {
                    System.out.println(RED_TEXT + "Invalid Input, Try Again..." + RESET);
                    continue;
                }
                break;
            } else {
                System.out.println(RED_TEXT + " Invalid press ...Try Again" + RESET);
            }
        }
    }

    //================ Curd ==================
    void getCurd() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Curd dishes");
            int c;
            while (true) { // Input validation for c
                if (sc.hasNextInt()) {
                    c = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter 1." + RESET);
                    sc.next(); // Consume invalid input
                }
            }


            if (c == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " ``````Curd Dishes``");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Plain Curd ", "  4 Boondi Raita   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2 Fruit Raita ", "  5 Onion Raita   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 3 Mix Veg Raita ", "  6 Cucumber Raita   ");
                System.out.println("Press No. for Selecting Curd Dishes..");
                int cd;
                while (true) { // Input validation for cd
                    if (sc.hasNextInt()) {
                        cd = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (cd >= 1 && cd <= 6) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 6." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


                if (cd == 1) {
                    curd = " Plain curd";
                } else if (cd == 2) {
                    curd = " Fruit Raita ";
                } else if (cd == 3) {
                    curd = " Mix Veg Raita";
                } else if (cd == 4) {
                    curd = " Boondi Raita ";
                } else if (cd == 5) {
                    curd = " Onion Raita ";
                } else if (cd == 6) { // Added for Cucumber Raita
                    curd = "Cucumber Raita";
                } else {
                    System.out.println(RED_TEXT + "Invalid Input, Try Again..." + RESET);
                    continue;
                }
                break;
            } else {
                System.out.println(RED_TEXT + " Invalid press ...Try Again" + RESET);
            }
        }
    }

    //================= Starter 1 ==================
    void getStarter() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Starters");
            int s;
            while (true) { // Input validation for s
                if (sc.hasNextInt()) {
                    s = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter 1." + RESET);
                    sc.next(); // Consume invalid input
                }
            }


            if (s == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " `````Starters```````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Veg Manchurian ", "  4 Spring Roll   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2 Chilli Mushroom ", "  5 Veg Crispy   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 3 Paneer Chilli ", "  6 Baby Corn Chilli   ");

                System.out.println("Press No. for Selecting Starter..");
                int srt;
                while (true) { // Input validation for srt
                    if (sc.hasNextInt()) {
                        srt = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (srt >= 1 && srt <= 6) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 6." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


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
                    System.out.println(RED_TEXT + "Invalid Input, Try Again..." + RESET);
                    continue;  // ye tabhi chalega jab aap ye code loop ke andar use kar rahe ho
                }

                break; // valid input milne  per exit
            } else {
                System.out.println(RED_TEXT + "Invalid press ...Try Again" + RESET);
            }
        }
    }

    //================= Starter 2 ==================
    void getStarter2() {
        while (true) {
               System.out.println("\nPress 1. for Selecting the Starters");
               int s;
               while (true) { // Input validation for s
                if (sc.hasNextInt()) {
                    s = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter 1." + RESET);
                    sc.next(); // Consume invalid input
                }
            }


            if (s == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " ``````Starters``");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Veg Manchurian ", "  4 Spring Roll   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2 Chilli Mushroom ", "  5 Veg Crispy   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 3 Paneer Chilli ", "  6 Baby Corn Chilli   ");

                System.out.println("Press No. for Selecting Starter..");
                int srt;
                while (true) { // Input validation for srt
                    if (sc.hasNextInt()) {
                        srt = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (srt >= 1 && srt <= 6) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 6." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


                String tempStarter2 = null;
                switch (srt) {
                    case 1:
                        tempStarter2 = "Veg Manchurian";
                        break;
                    case 2:
                        tempStarter2 = "Chilli Mushroom";
                        break;
                    case 3:
                        tempStarter2 = "Paneer Chilli";
                        break;
                    case 4:
                        tempStarter2 = "Spring Roll";
                        break;
                    case 5:
                        tempStarter2 = "Veg Crispy";
                        break;
                    case 6:
                        tempStarter2 = "Baby Corn Chilli";
                        break;
                    default: {
                        System.out.println(RED_TEXT + "Invalid Input, Try Again..." + RESET);
                        continue;
                    }
                }

                // Duplicate check
                if (tempStarter2.equals(starter)) {
                    System.out.println(RED_TEXT + "You Already Selected this Starter, choose another one..." + RESET);
                    continue;
                } else {
                    starter2 = tempStarter2;
                    break; // valid selection → exit
                }
            } else {
                System.out.println(RED_TEXT + "Invalid press ...Try Again" + RESET);
            }
        }
    }

    //================ Dal ==================
    void getDal() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Dal dishes");
            int d;
            while (true) { // Input validation for d
                if (sc.hasNextInt()) {
                    d = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter 1." + RESET);
                    sc.next(); // Consume invalid input
                }
            }


            if (d == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " `````Dal Dishes```````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Dal Tadka ", "  4 Dal Panchmel   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2 Dal Fry ", "  5 Rajma Masala   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 3 Dal Makhani ", "  6 Chole Masala   ");
                System.out.println("Press No. for Selecting Dal Dishes..");
                int da;
                while (true) { // Input validation for da
                    if (sc.hasNextInt()) {
                        da = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (da >= 1 && da <= 6) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 6." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


                if (da == 1) {
                    dal = " Dal Tadka";
                } else if (da == 2) {
                    dal = " Dal Fry ";
                } else if (da == 3) {
                    dal = "Dal Makhani ";
                } else if (da == 4) {
                    dal = " Dal Panchmel ";
                } else if (da == 5) {
                    dal = "  Rajma Masala  ";
                } else if (da == 6) { // Added for Chole Masala
                    dal = "Chole Masala";
                } else {
                    System.out.println(RED_TEXT + "Invalid Input, Try Again..." + RESET);
                    continue;
                }
                break;
            } else {
                System.out.println(RED_TEXT + " Invalid press ...Try Again" + RESET);
            }
        }
    }

    //================ Rice ==================
    void getRice() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Rice dishes");
            int r;
            while (true) { // Input validation for r
                if (sc.hasNextInt()) {
                    r = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter 1." + RESET);
                    sc.next(); // Consume invalid input
                }
            }


            if (r == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " ``````Rice Dishes``");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Plain Rice ", "  4 Jeera Rice   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2 Veg Pulao ", "  5 Veg Biryani   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 3 Peas Pulao ", "  6 Paneer Pulao   ");
                System.out.println("Press No. for Selecting Rice..");
                int rc;
                while (true) { // Input validation for rc
                    if (sc.hasNextInt()) {
                        rc = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (rc >= 1 && rc <= 6) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 6." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


                if (rc == 1) {
                    rice = " Plain Rice";
                } else if (rc == 2) {
                    rice = " Veg Pulao ";
                } else if (rc == 3) {
                    rice = "Peas Pulao ";
                } else if (rc == 4) {
                    rice = " Jeera Rice ";
                } else if (rc == 5) {
                    rice = " Veg Biryani ";
                } else if (rc == 6) { // Added for Paneer Pulao
                    rice = " Paneer Pulao ";
                } else {
                    System.out.println(RED_TEXT + "Invalid Input, Try Again..." + RESET);
                    continue;
                }
                break;
            } else {
                System.out.println(RED_TEXT + " Invalid press ...Try Again" + RESET);
            }
        }
    }

    //================ Sweet Dish ==================
    void getSweetDish() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Sweet Dishes");
            int sd;
            while (true) { // Input validation for sd
                if (sc.hasNextInt()) {
                    sd = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter 1." + RESET);
                    sc.next(); // Consume invalid input
                }
            }


            if (sd == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " `````Sweet Dishes```````");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Gulab Jamun ", "  4 Ice Cream   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2 Rasgulla ", "  5 Jalebi   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 3 Kheer ", "  6 Halwa   ");
                System.out.println("Press No. for Selecting Sweet Dishes..");
                int srd;
                while (true) { // Input validation for srd
                    if (sc.hasNextInt()) {
                        srd = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (srd >= 1 && srd <= 6) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 6." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


                if (srd == 1) {
                    sweetdish = " Gulab Jamun";
                } else if (srd == 2) {
                    sweetdish = " Rasgulla  "; // Corrected "2 Rasgulla" to just "Rasgulla"
                } else if (srd == 3) {
                    sweetdish = " Kheer";
                } else if (srd == 4) {
                    sweetdish = " Ice Cream  "; // Corrected "4 Ice Cream" to just "Ice Cream"
                } else if (srd == 5) {
                    sweetdish = "Jalebi  ";
                } else if (srd == 6) { // Added for Halwa
                    sweetdish = "Halwa";
                } else {
                    System.out.println(RED_TEXT + "Invalid Input, Try Again..." + RESET);
                    continue;
                }
                break;
            } else {
                System.out.println(RED_TEXT + " Invalid press ...Try Again" + RESET);
            }
        }
    }


    //paneer Starter
    void getPaneerStarter() {
        while (true) {
            System.out.println("\nPress 1. for Selecting the Paneer Starter");
            int ps_menu_choice;
            while (true) { 
                if (sc.hasNextInt()) {
                    ps_menu_choice = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid input! Please enter 1." + RESET);
                    sc.next(); // Consume invalid input
                }
            }


            if (ps_menu_choice == 1) {
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " ``````Paneer Starter``");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Paneer Chilli ", "  4 Paneer 65   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2 Paneer Tikka ", "  5 Paneer Pudina Tikka   ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 3 Dragon Paneer ", "  6 Paneer Achari Tikka   ");
                System.out.println("Press No. for Selecting Paneer Starter..");
                int ps_dish_choice; 
                while (true) { // Input validation for ps_dish_choice
                    if (sc.hasNextInt()) {
                        ps_dish_choice = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (ps_dish_choice >= 1 && ps_dish_choice <= 6) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid input! Please enter a number from 1 to 6." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Consume invalid input
                    }
                }


                if (ps_dish_choice == 1) {
                    paneerStarter = "Paneer Chilli";
                } else if (ps_dish_choice == 2) {
                    paneerStarter = " Paneer Tikka ";
                } else if (ps_dish_choice == 3) {
                    paneerStarter = "Dragon Paneer";
                } else if (ps_dish_choice == 4) {
                    paneerStarter = " Paneer 65  ";
                } else if (ps_dish_choice == 5) {
                    paneerStarter = "Paneer Pudina Tikka ";
                } else if (ps_dish_choice == 6) {
                    paneerStarter = " Paneer Achari Tikka ";
                } else {
                    System.out.println(RED_TEXT + "Invalid Value, Try Again..." + RESET);
                    continue;
                }
                break;
            } else {
                System.out.println(RED_TEXT + " Invalid press ...Try Again" + RESET);
            }
        }
    }


    //THALI A
    void getThaliA() {
        drinkSoup();
        getVegetable();
        getDal();
        getRice();
        getSweetDish();

    }

    //THALI B
    void getThaliB() {
    
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
    void getThaliC() {
        
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
    void getThaliD() {
    
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
    void getThaliE() {

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

    // LADIES MENU 1
    void getLadiesA() {
        drinkSoup();
        getStarter();
        getSweetDish();
    }

    // LADIES MENU 2
    void getLadiesB() {
        drinkSoup();
        getStarter();
        getSweetDish();
    }

    // LADIES MENU 3
    void getLadiesC() {
        drinkSoup();
        getStarter();
        getSweetDish();
        getPaneerStarter();
    }
}

//================ Main Class (unchanged) ==================

class NEW_JMB {
      static int n;
      static int n3;
      static int n2;
     public static void main(String... args) {
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
        int breakfastPrice = 0;
        String ladiesdish = "";
        int ladiesdishprice = 0;
        int thaliPrice = 0;
        int Quantity1 = 0;
        String cosName = "";
        String cosNo = "";
        String cosAddress = "";
        String breakfast = "";
        String ladiesMenu = "";

        int choice;

        while (true) {
            System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "````````Welcome to JMB```````");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "1. VEGETARIAN MENU ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "2. BREAKFAST MENU ");
            System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "3. Only For Ladies MENU ");
            System.out.println(RESET);
            System.out.printf(RED_TEXT + "%-60s" + RESET + "\n","Hello sir/Ma'am  Choose Menu !");
            // Input validation for 'choice'
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println(RED_TEXT + "Invalid choice! Please enter 1, 2, or 3." + RESET);
                }
            } else {
                System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                sc.next(); // Consume the invalid input
            }
        }

        switch (choice) {
            case 1:
                vegName = "Vegetable"; // Set vegName here
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "Varities of JMB Thali ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "1.  Thali 'A' --------------------->(rs 310)");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "2.  Thali 'B' --------------------->(rs 360)");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "3.  Thali 'C' --------------------->(rs 410)");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "4.  Thali 'D' --------------------->(rs 470)");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "5.  Thali 'E' --------------------->(rs 600)");
                System.out.println(RESET);

                System.out.println("Select Thali as per your Mood ........");


                while (true) { // Input validation for n
                    if (sc.hasNextInt()) {
                        n = sc.nextInt();
                        sc.nextLine(); // Consume leftover newline
                        if (n >= 1 && n <= 5) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid Thali number. Please choose between 1 and 5." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Discard wrong input
                    }
                }

                if (n == 1) {
                    thaliPrice = 310;
                } else if (n == 2) {
                    thaliPrice = 360;
                } else if (n == 3) {
                    thaliPrice = 410;
                } else if (n == 4) {
                    thaliPrice = 470;
                } else if (n == 5) {
                    thaliPrice = 600;
                } else {
                    System.out.println(RED_TEXT + "No Thali Choose" + RESET);
                }


                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "``````Enter Custumer Name```````");
                    cosName = sc.nextLine();
                    if (cosName.matches("[a-zA-Z ]+")) {
                        break;
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Name should contain only alphabets. Try again." + RESET);
                    }
                }

                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "```````````Enter Custumer No.``````");
                    cosNo = sc.nextLine().trim();

                    if (cosNo.matches("[6-9]\\d{9}")) { // Regex for 10-digit number starting with 6-9
                        break;
                    } else {
                        System.out.println(RED_TEXT + "Invalid mobile number! Please enter a 10-digit number starting with 6 to 9." + RESET);
                    }
                }

                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "``````Enter Custumer Address```````");
                    cosAddress = sc.nextLine();
                    // Allowing numbers and spaces for address
                    if (cosAddress.matches("[a-zA-Z0-9., ]+")) { // Added numbers, commas, and dots
                        break;
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Address can contain alphabets, numbers, spaces, commas and dots. Try again." + RESET);
                    }
                }
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "Show Your Valid Id For More Verification");
                System.out.println();
                System.out.println();
                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "```````````Enter Quantity For Booking``````");
                    if (sc.hasNextInt()) {
                        Quantity1 = sc.nextInt();
                        sc.nextLine(); // consume leftover newline
                        if (Quantity1 > 0) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + " Quantity must be greater than 0." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + " Invalid input! Please enter a number." + RESET);
                        sc.next(); // discard wrong input
                    }
                }
                System.out.println("Booking Successfully Completed .....");


                if (n == 1) {
                    thaliname = "Thali 'A' ->(rs 310)";
                } else if (n == 2) {
                    thaliname = "Thali 'B' ->(rs 360)";
                } else if (n == 3) {
                    thaliname = "Thali 'C' ->(rs 410)";
                } else if (n == 4) {
                    thaliname = "Thali 'D' ->(rs 470)";
                } else if (n == 5) {
                    thaliname = "Thali 'E' ->(rs 600)";
                } else {
                    System.out.println(RED_TEXT + "Invalid Choice !" + RESET);
                }
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " " + thaliname + " Selected Succesfully ");
                System.out.println("\n");

                switch (n) {
                    case 1:
                        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "Great choice ! you Selected Thali 'A' ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Soup or Welcome Drink", "   Roti, Naan   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Vegitable Dish", "  Butter Paratha ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1  Dal  ", "  Pickle, Salad, Papad   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1  Rice ", " 1 Sweet Dish or Ice cream   ");
                        System.out.println();
                        jb.getThaliA();


                        break;
                    case 2:
                        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "Great choice ! you Selected Thali 'B' ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Soup or Welcome Drink", "   Roti, Naan   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2 Vegitable Dish", "  Butter Paratha ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Dal fry  ", "  Pickle, Salad, Papad   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Rice ", " 1 Sweet Dish or Ice cream   ");
                        jb.getThaliB();

                        break;
                    case 3:
                        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "Great choice ! you Selected Thali 'C' ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Soup or Welcome Drink", "   Roti, Naan   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s " + RESET + "\n", " 2  Vegitable Dish", "  Butter Paratha ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Paneer Dish", "  1 Starter ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s " + RESET + "\n", " 1  Dal  ", "  Pickle, Salad, Papad   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s " + RESET + "\n", " 1  Rice ", " 1 Sweet Dish or Ice cream   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s " + RESET + "\n", " 1  Curd Dish ", "   ");
                        jb.getThaliC();

                        break;
                    case 4:
                        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s\n" + RESET, "Great choice ! you Selected Thali 'D ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Soup or Welcome Drink", "   Roti, Naan   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s " + RESET + "\n", " 2  Vegitable Dish", "  Butter Paratha ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s " + RESET + "\n", " 1 Paneer Dish", "  2 Starter ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1  Dal  ", "  Pickle, Salad, Papad   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1  Rice ", " 1 Sweet Dish or Ice cream   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1  Curd Dish ", " Coffee  ");

                        jb.getThaliD();
                        break;

                    case 5:
                        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "Great choice ! you Selected Thali 'E' ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Soup or Welcome Drink", "   Roti, Naan   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 2  Vegitable Dish", "  Butter Paratha ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1 Paneer Dish", "  2 Starter ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1  Dal  ", "  Pickle, Salad, Papad   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1  Rice ", " 1 Sweet Dish or Ice cream   ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1  Curd Dish ", " 1 Paneer Starter  ");
                        System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-30s %-30s" + RESET + "\n", " 1  Pasta ", "  ");
                        jb.getThaliE();
                        break;

                    default:
                        System.out.println(RED_TEXT + "Invalid Data Input" + RESET);
                        break;
                }
                break;

            case 2:
                vegName = "Breakfast"; // Set vegName here
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "`Varities of JMB Breakfast ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "1.  BreakFast 'A'------------->   (rs 200)");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "2.  BreakFast 'B'------------->   (rs 230)");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "3.  BreakFast 'C'------------->   (rs 250)");
                System.out.println(RESET);

                System.out.println("Select BreakFast as per your Mood ........");
            
                while (true) { // Input validation for n2
                    if (sc.hasNextInt()) {
                        n2 = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (n2 >= 1 && n2 <= 3) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid Breakfast number. Please choose between 1 and 3." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Discard wrong input
                    }
                }


                if (n2 == 1) {
                    breakfastname = " BreakFast 'A'->(rs 200) ";
                } else if (n2 == 2) {
                    breakfastname = " BreakFast 'B'->(rs 230) ";
                } else if (n2 == 3) {
                    breakfastname = " BreakFast 'C'->(rs 250) ";
                } else {
                    System.out.println(RED_TEXT + "Invalid Choice !" + RESET);
                }

                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "```````````Enter Custumer Name``````");
                    cosName = sc.nextLine();
                    if (cosName.matches("[a-zA-Z ]+")) {
                        break;
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Name should contain only alphabets. Try again." + RESET);
                    }
                }

                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "``````Enter Custumer No.```````");
                    cosNo = sc.nextLine().trim();

                    if (cosNo.matches("[6-9]\\d{9}")) {
                        break;
                    } else {
                        System.out.println(RED_TEXT + "Invalid mobile number! Please enter a 10-digit number starting with 6 to 9." + RESET);
                    }
                }

                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "```````````Enter Custumer Address``````");
                    cosAddress = sc.nextLine();
                    if (cosAddress.matches("[a-zA-Z0-9., ]+")) { // Allowing numbers and spaces for address
                        break;
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Address can contain alphabets, numbers, spaces, commas and dots. Try again." + RESET);
                    }
                }
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "Show Your Valid Id For More Verification");
                System.out.println();

                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "``````Enter Quantity For Booking```````");
                    if (sc.hasNextInt()) {
                        Quantity1 = sc.nextInt();
                        sc.nextLine(); // consume leftover newline
                        if (Quantity1 > 0) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + " Quantity must be greater than 0." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + " Invalid input! Please enter a number." + RESET);
                        sc.next(); // discard wrong input
                    }
                }
                System.out.println("Booking Successfully Completed .....");

                if (n2 == 1) {
                    breakfastPrice = 200;
                } else if (n2 == 2) {
                    breakfastPrice = 230;
                } else if (n2 == 3) {
                    breakfastPrice = 250;
                } else {
                    System.out.println(RED_TEXT + "No BreakFast Choose" + RESET);
                }
                

                switch (n2) {

                    case 1:
                             System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "  Break fast 'A'  ");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "1.  1 Poha , Jalebi, 1 Coffee");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "2.  1 Coffee / Tea");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "3.   1 Bread item");
                        break;

                    case 2:
                             System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "  Break fast 'B'  ");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "1.  1 Poha , Jalebi, 1 Coffee");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "2.  1 Coffee / Tea");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "3.  2 Bread item");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "4.  1 Heavy Snacks");
                        break;

                    case 3:
                             System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "  Break fast 'A'  ");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "1.  1 Poha , Jalebi, 1 Coffee");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "2.  1 Coffee / Tea");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "3.  2 Bread item");
                             System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "4.  2 Heavy Snacks");
                        break;

                    default:                     
                        break;
                }
                break;

//for Ladies...............
            case 3:
                vegName = "Ladies Menu"; // Set vegName here
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "`Varities of JMB Ladies Menu ");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "1.   'A'------------->   (rs 250)");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "2.   'B'------------->   (rs 300)");
                System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "3.   'C'------------->   (rs 350)");
                System.out.println(RESET);

                System.out.println("Select Ladies Dish as per your Mood ........");
               
                while (true) { // Input validation for n3
                    if (sc.hasNextInt()) {
                        n3 = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        if (n3 >= 1 && n3 <= 3) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + "Invalid Ladies Menu number. Please choose between 1 and 3." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                        sc.next(); // Discard wrong input
                    }
                }


                if (n3 == 1) {
                    ladiesdish = " LadiesMenu 'A'->(rs 250) ";
                } else if (n3 == 2) {
                    ladiesdish = " LadiesMenu 'B'->(rs 300) ";
                } else if (n3 == 3) {
                    ladiesdish = " LadiesMenu 'C'->(rs 350) ";
                } else {
                    System.out.println(RED_TEXT + "Invalid Choice !" + RESET);
                }

                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "``````Enter Custumer Name```````");
                    cosName = sc.nextLine();
                    if (cosName.matches("[a-zA-Z ]+")) {
                        break;
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Name should contain only alphabets. Try again." + RESET);
                    }
                }

                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "```````````Enter Custumer No.``````");
                    cosNo = sc.nextLine().trim();

                    if (cosNo.matches("[6-9]\\d{9}")) {
                        break;
                    } else {
                        System.out.println(RED_TEXT + "Invalid mobile number! Please enter a 10-digit number starting with 6 to 9." + RESET);
                    }
                }

                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "``````Enter Custumer Address```````");
                    cosAddress = sc.nextLine();
                    if (cosAddress.matches("[a-zA-Z0-9., ]+")) { // Allowing numbers and spaces for address
                        break;
                    } else {
                        System.out.println(RED_TEXT + "Invalid input! Address can contain alphabets, numbers, spaces, commas and dots. Try again." + RESET);
                    }
                }
                System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "Show Your Valid Id For More Verification");
                System.out.println();

                while (true) {
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", "```````````Enter Quantity For Booking`````````");
                    if (sc.hasNextInt()) {
                        Quantity1 = sc.nextInt();
                        sc.nextLine(); // consume leftover newline
                        if (Quantity1 > 0) {
                            break;
                        } else {
                            System.out.println(RED_TEXT + " Quantity must be greater than 0." + RESET);
                        }
                    } else {
                        System.out.println(RED_TEXT + " Invalid input! Please enter a number." + RESET);
                        sc.next(); // discard wrong input
                    }
                }
                System.out.println("Booking Successfully Completed .....");

                if (n3 == 1) {
                    ladiesdishprice = 250;
                } else if (n3 == 2) {
                    ladiesdishprice = 300;
                } else if (n3 == 3) {
                    ladiesdishprice = 350;
                } else {
                    System.out.println(RED_TEXT + "No  Choose" + RESET);
                }

                switch (n3) {

                    case 1:
                         System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " Ladies Breakfast Details ");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "1. Soup / Welcome Drink");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "2. 1 Sweet Dish ");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "3.  1 Snacks ");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "4.  1 Starter");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "5.  1 Tea / Coffee ");
                        jb.getLadiesA();
                        break;

                    case 2:
                         System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " Ladies Breakfast Details ");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "1. Soup / Welcome Drink");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "2. 1 Sweet Dish ");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "3.  2 Snacks ");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "4.  1 Starter");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "5.  1 Tea / Coffee ");
                        jb.getLadiesB();
                        break;

                    case 3:
                         System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " Ladies Breakfast Details ");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "1. Soup / Welcome Drink");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "2. 1 Sweet Dish ");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "3.  2 Snacks ");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "4.  1 Starter");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "5.  1  Coffee ");
                         System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "6.  1 Paneer Starter ");
                        jb.getLadiesC();
                        break;

                    default:
                        break;
                }
                break;


            default:
                System.out.println(RED_TEXT + "Invalid Value !" + RESET);
                break;
        }

        System.out.println();
        System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "Nice To Greeting You Sir/Ma,am ");
        System.out.println();
        System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s " + RESET + "\n", " How Many Members Are Come  Plzz Comform Again");
        int Quantity2;
        while (true) { // Input validation for Quantity2
            if (sc.hasNextInt()) {
                Quantity2 = sc.nextInt();
                sc.nextLine(); // Consume leftover newline
                if (Quantity2 > 0) {
                    break;
                } else {
                    System.out.println(RED_TEXT + "Quantity must be greater than 0. Please re-enter." + RESET);
                }
            } else {
                System.out.println(RED_TEXT + "Invalid input! Please enter a number." + RESET);
                sc.next(); // Discard wrong input
            }
        }


//====================================================Formula od Bill Condition============================================

        int extraChargePerHead = 0; // agar 10% se jyada aaye to per head extra charge
        int total = 0;
        double gst = 0;
        double totalBill = 0;

        if (choice == 1) { // Vegetarian Menu (Thali)

            int minAllowed = Quantity1;
            int maxAllowed = (int) (Quantity1 * 1.10); // 110% of booked

            if (Quantity2 >= minAllowed && Quantity2 <= maxAllowed) {
                //  Within 100% to 110% of booked, only booked thali price
                total = Quantity1 * thaliPrice;
            } else if (Quantity2 > maxAllowed) {
                //  Above 110% → booked + (present - 110%) thali
                int extra = Quantity2 - maxAllowed;
                total = (Quantity1 + extra) * thaliPrice;
            } else {
                // Less than 100% (or even less than 1%), still pay for booked quantity.
                total = Quantity1 * thaliPrice;
            }
            gst = total * 0.18;
            totalBill = total + gst;
        }
//=====================================================================================
        else if (choice == 2) { // Breakfast Menu
            int minAllowed = Quantity1;
            int maxAllowed = (int) (Quantity1 * 1.10);

            if (Quantity2 >= minAllowed && Quantity2 <= maxAllowed) {
                total = Quantity1 * breakfastPrice;
            } else if (Quantity2 > maxAllowed) {
                int extra = Quantity2 - maxAllowed;
                total = (Quantity1 + extra) * breakfastPrice;
            } else {
                total = Quantity1 * breakfastPrice;
            }
            gst = total * 0.18;
            totalBill = total + gst;
        }
//==================================================================================
        else if (choice == 3) { // Ladies Menu
            int minAllowed = Quantity1;
            int maxAllowed = (int) (Quantity1 * 1.10);

            if (Quantity2 >= minAllowed && Quantity2 <= maxAllowed) {
                total = Quantity1 * ladiesdishprice;
            } else if (Quantity2 > maxAllowed) {
                int extra = Quantity2 - maxAllowed;
                total = (Quantity1 + extra) * ladiesdishprice;
            } else {
                total = Quantity1 * ladiesdishprice;
            }
            gst = total * 0.18;
            totalBill = total + gst;
        }

        //breakfast wala bill print
        //======================================Bill Print===============================================


            switch (n2) {
                case 1:
                    System.out.println("\n");
                    System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", "====================== JMB BILL =====================");
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", " Customer Name                   : " + cosName);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", " Customer No                     : " + cosNo);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", " Customer Address                : " + cosAddress);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", " Menu Selected                   : " + vegName); // Changed Thali Selected to Menu Selected
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", " Breakfast Type                  : " + breakfastname);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", " Quantity booked                 : " + Quantity1);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", " Real Quantity                   : " + Quantity2);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", "----------------------------------------------------");
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "  Break fast 'A' Details ");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 1.  1 Poha , Jalebi, 1 Coffee");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 2.  1 Coffee / Tea");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 3.   1 Bread item");// Displaying full breakfast string
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", "----------------------------------------------------");
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", " Total Amount                         : Rs " + total);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", " Total Bill Amount (Gst 18%)          : Rs " + String.format("%.2f", totalBill));
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s"   + RESET + "\n", "====================================================");

                    break; // breakfast ka bill print hone ke baad loop se bahar nikalna hoga

                case 2:
                    System.out.println("\n");
                    System.out.printf(PEACH_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", "====================== JMB BILL =====================");
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Customer Name                   : " + cosName);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Customer No                     : " + cosNo);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Customer Address                : " + cosAddress);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Menu Selected                   : " + vegName); // Changed Thali Selected to Menu Selected
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Breakfast Type                  : " + breakfastname);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Quantity  booked                : " + Quantity1);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Real Quantity                   : " + Quantity2);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", "----------------------------------------------------");
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "  Break fast 'B' Details  ");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 1.  1 Poha , Jalebi, 1 Coffee");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 2.  1 Coffee / Tea");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 3.  2 Bread item");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 4.  1 Heavy Snacks");
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", "----------------------------------------------------");
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", "Total Amount                         : Rs " + total);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", "Total Bill Amount (Gst 18%)          : Rs " + String.format("%.2f", totalBill));
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", "====================================================");

                    break;
              case 3 :
                    System.out.println("\n");
                    System.out.printf(PEACH_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", "====================== JMB BILL =====================");
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Customer Name                   : " + cosName);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Customer No                     : " + cosNo);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Customer Address                : " + cosAddress);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Menu Selected                   : " + vegName); // Changed Thali Selected to Menu Selected
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Breakfast Type                  : " + breakfastname);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Quantity booked                 : " + Quantity1);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Real Quantity                   : " + Quantity2);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", "----------------------------------------------------");
                    System.out.printf(PEACH_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", "  Break fast 'A' Details  ");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 1.  1 Poha , Jalebi, 1 Coffee");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 2.  1 Coffee / Tea");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 3.  2 Bread item");
                    System.out.printf(CREAM_BACKGROUND + BLACK_TEXT + "%-60s" + RESET + "\n", " 4.  2 Heavy Snacks"); // Displaying full breakfast string
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", "----------------------------------------------------");
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Total Amount                         : Rs " + total);
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", " Total Bill Amount (Gst 18%)          : Rs " + String.format("%.2f", totalBill));
                    System.out.printf(WHITE_BACKGROUND + RED_TEXT   + "%-60s" + RESET + "\n", "====================================================");

                    break;
                    default : 
                    // System.out.println("Invalid input");
                    break;
            }



//thali wala bill print
//===================================================================================================================================================================


                    switch (n) {
                        case 1:
                            // === Thali A ka bill ===
                              System.out.println("\n");
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================== JMB BILL ====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Name            : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer No              : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Address         : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Thali Selected           : " + thaliname);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Quantity booked          : " + Quantity1);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Real Quantity            : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Vegetable Dish 1         : " + jb.vegetable);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Dal                      : " + jb.dal);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Rice                     : " + jb.rice);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Roti , Nan, Butter Paratha,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Pickle, Salad, Papad,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Amount    : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Bill Amount (Gst 18%)   : Rs " + String.format("%.2f", totalBill));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================================================");
                            break;

                        case 2:
                            // === Thali B ka bill ===
                            System.out.println("\n");
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================== JMB BILL ====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Name            : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer No              : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Address         : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Thali Selected           : " + thaliname);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Quantity  booked         : " + Quantity1);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Real Quantity            : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Vegetable Dish 1         : " + jb.vegetable);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Vegetable Dish 2         : " + jb.vegetable2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Dal                      : " + jb.dal);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Rice                     : " + jb.rice);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Roti , Nan, Butter Paratha,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Pickle, Salad, Papad,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Amount                  : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Bill Amount (Gst 18%)   : Rs " + String.format("%.2f", totalBill));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================================================");
                            break;


                        case 3:
                            // === Thali C ka bill ===
                          System.out.println("\n");
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================== JMB BILL ====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Name            : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer No              : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Address         : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Thali Selected           : " + thaliname);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Quantity booked          : " + Quantity1);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Real Quantity            : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Vegetable Dish 1         : " + jb.vegetable);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Vegetable Dish 2         : " + jb.vegetable2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Paneer Dish              : " + jb.paneer);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Curd Dish                : " + jb.curd);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Dal                      : " + jb.dal);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Rice                     : " + jb.rice);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Starter 1                : " + jb.starter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Roti , Nan, Butter Paratha,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Pickle, Salad, Papad,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Amount                  : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Bill Amount (Gst 18%)   : Rs " + String.format("%.2f", totalBill));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================================================");

                            break;

                        case 4:
                            // === Thali D ka bill ===
                              System.out.println("\n");
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================== JMB BILL ====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Name            : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer No              : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Address         : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Thali Selected           : " + thaliname);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Quantity booked          : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Real Quantity            : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " ----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Vegetable Dish 1         : " + jb.vegetable);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Vegetable Dish 2         : " + jb.vegetable2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Paneer Dish              : " + jb.paneer);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Curd Dish                : " + jb.curd);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Dal                      : " + jb.dal);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Rice                     : " + jb.rice);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Starter 1                : " + jb.starter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Starter 2                : " + jb.starter2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Roti , Nan, Butter Paratha,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Pickle, Salad, Papad,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Amount                  : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Bill Amount (Gst 18%)   : Rs " + String.format("%.2f", totalBill));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================================================");

                            break;

                        case 5:
                            // === Thali E ka bill ===
                              System.out.println("\n");
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================== JMB BILL ====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Name            : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer No              : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Address         : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Thali Selected           : " + thaliname);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Quantity booked          : " + Quantity1);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Real Quantity                 : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Vegetable Dish 1         : " + jb.vegetable);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Vegetable Dish 2         : " + jb.vegetable2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Paneer Dish              : " + jb.paneer);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Curd Dish                : " + jb.curd);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Dal                      : " + jb.dal);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Rice                     : " + jb.rice);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Starter 1                : " + jb.starter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Starter 2                : " + jb.starter2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Paneer Starter           : " + jb.paneerStarter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "  Roti , Nan, Butter Paratha,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Pickle, Salad, Papad,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Amount                  : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Bill Amount (Gst 18%)   : Rs " + String.format("%.2f", totalBill));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================================================");
                            break;

                        default:
                            // System.out.println(RED_TEXT + "Invalid input ! Plzz Re-Enter Sir/Ma'am " + RESET);
                    // galat input par thali loop dobara chalega
                    }
               
               
               //ladies wala bill
//=============================================================================================================================================================================
                    switch (n3) {
                        case 1:
                              System.out.println("\n");
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================== JMB BILL =====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Name                 : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer No                   : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Address              : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Menu Selected                 : " + vegName); // Changed Thali Selected to Menu Selected
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Dish Selected                 : " + ladiesdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Quantity booked               : " + Quantity1);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Real Quantity                 : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "Starter 1                : " + jb.starter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " 1 Tea ,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " 1 Snacks");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "Total Amount                       : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "Total Bill Amount (Gst 18%)        : Rs " + String.format("%.2f", totalBill));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================================================");
                            break;

                        case 2:
                              System.out.println("\n");
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================== JMB BILL =====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Name                 : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer No                   : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Address              : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Menu Selected                 : " + vegName); // Changed Thali Selected to Menu Selected
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Dish Selected                 : " + ladiesdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Quantity  booked              : " + Quantity1);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Real Quantity                 : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Starter 1                : " + jb.starter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " 1 Coffee ,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " 2 Snacks");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Amount                       : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Bill Amount (Gst 18%)        : Rs " + String.format("%.2f", totalBill));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " ====================================================");
                            break;

                        case 3:
                              System.out.println("\n");
                            System.out.printf(PEACH_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "====================== JMB BILL =====================");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Name                 : " + cosName);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer No                   : " + cosNo);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Customer Address              : " + cosAddress);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Menu Selected                 : " + vegName); // Changed Thali Selected to Menu Selected
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Dish Selected                 : " + ladiesdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Quantity Booked               : " + Quantity1);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Real Quantity                 : " + Quantity2);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Drink/Soup               : " + (jb.drink != null ? jb.drink : jb.soup));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Starter 1                : " + jb.starter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Sweet Dish               : " + jb.sweetdish);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Paneer Starter           : " + jb.paneerStarter);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " 1 Coffee ,");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " 2 Snacks");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", "----------------------------------------------------");
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Amount                       : Rs " + total);
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " Total Bill Amount (Gst 18%)        : Rs " + String.format("%.2f", totalBill));
                            System.out.printf(WHITE_BACKGROUND + RED_TEXT + "%-60s" + RESET + "\n", " ====================================================");
                            break;

                        default:
                            // System.out.println(RED_TEXT + "Invalid input ! Plzz Re-Enter Sir/Ma'am " + RESET);
                         // galat input par Ladiesmenu loop dobara chalega
                    }
            
               
            }
           
}
    

