import java.util.Scanner;
 class Q13  {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
     int no = sc.nextInt();

     String week = sc.nextLine();
     if (no==1)
     System.out.println("monday");
     else if (no==2)
     System.out.println("Tuesday");
     else if (no==3)
     System.out.println("Wednesday");
      else if (no==4)
     System.out.println("Thrusday");
      else if (no==1)
     System.out.println("Friday");
      else if (no==1)
     System.out.println("saturday");
      else if (no==1)
     System.out.println("sunday");
     else
     System.out.println("Out of calender");
  }
 }