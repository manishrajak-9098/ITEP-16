import java.util.Scanner;

class Q26{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    int remainder = num % 2;

    switch (remainder) {
      case 0:
        System.out.println(num + " is Even");
        break;
      case 1:
        System.out.println(num + " is Odd");
        break;
      default:
        System.out.println("Invalid input");
}
}
}
