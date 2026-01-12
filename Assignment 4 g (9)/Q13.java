// 13) WAP to create JMB MENU CARD 

// ===== JMB MENU CARD =====
// 1. Burger - Rs. 80
// 2. Pizza - Rs. 150
// 3. Sandwich - Rs. 60
// 4. Coffee - Rs. 50
// 5. Cold Drink - Rs. 40


// User se order choice lena (wo kya khana/peena chahta hai).

// Quantity poochna (kitne pieces/cups).

// Total bill calculate karna = price × quantity.

// Final Bill print karna (item name, quantity, total amount).
import java.util.Scanner;
class Q13{
    public static void main(String[] arfgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====JMB MENU CARD=========");
        System.out.println("1.  BURGER -    Rs.  80");
        System.out.println("2.  PIZZA  -    Rs.  150");
        System.out.println("3.  SANDWICH -  Rs.   60");
        System.out.println("4.  COFFE  -    Rs.   50 ");
        System.out.println("5. COLD-DRINK - Rs.   40");
        System.out.println("ENTER YOUR CHOICE WITH THIS NUMBER : ");
        int choice = sc.nextInt();
        System.out.println("ALSO ENTER THE QUANTITY : ");
        int q = sc.nextInt();
        String item = "";
        double bill = 0;
        switch(choice){
            case 1 :bill =  q * 80; item = "BURGER";break;
            case 2 :bill =  q * 150; item = "PIZZA";break;
            case 3 :bill =  q * 60; item = "SANDWICH";break;
            case 4 :bill =  q * 50; item = "COFEE";break;
            case 5 :bill =  q * 40; item = "COLDDRINK";break;
            default : System.out.println("INVALID CHOICE");
        }
        System.out.println("=====FINAL BILL IS=======");
        System.out.println("1. ITEM NAME = "+ item );
        System.out.println("2. QUANTITY = "+ q );
        System.out.println("3.  TOTAL AMOUNT IS = "+ bill);
        System.out.println(" THANKYOU FOR COIMING ! ");
    }
}
