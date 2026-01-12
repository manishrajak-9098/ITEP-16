// 32. WAP to round off 2 digit number
import java.util.Scanner;

class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two digit number: ");
        int num = sc.nextInt();

        int remainder = num % 10;
        int roundoff;

        if (remainder >= 5) {
            roundoff = num + (10 - remainder); // next multiple of 10
        } else {
            roundoff = num - remainder; // previous multiple of 10
        }

        System.out.println("Roundoff number: " + roundoff);
    }
}