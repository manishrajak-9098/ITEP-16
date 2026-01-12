

import java.util.Scanner;
 class Q12  {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a four digit number");
    int num = sc.nextInt();

    System.out.println("Number = "+num);
    int ones = num%10;
    num = num/10;
    int tens = num%10;
    num = num/10;
    int hundred = num%10;
    num = num/10;
    int thousand = num%10;

    int reverse = ones*1000 + tens*100 + hundred*10 + thousand;
    System.out.println("Reverse number =" +reverse);
  }
}