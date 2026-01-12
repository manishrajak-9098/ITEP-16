import java.util.Scanner;

class Q32 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int maximum = Math.max(a, b);
        int minimum = Math.min(a, b);

        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);
   }
}