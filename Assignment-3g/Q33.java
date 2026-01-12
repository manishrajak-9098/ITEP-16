// 33. WAP to round off 3 digit number

import java.util.Scanner;

class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number: ");
        int num = sc.nextInt();

        // int remainder = num % 10;
        int remainder = num % 100;
        int roundoff;

        // if (remainder >= 5) {
        if (remainder >= 50) {
            // roundoff = num + (10 - remainder); // next multiple of 10
            roundoff = num + (100 - remainder); // next multiple of 100
        } else {
            // roundoff = num - remainder; // previous multiple of 10
            roundoff = num - remainder; // previous multiple of 100
        }

        // System.out.println("Roundoff number: " + roundoff);
        System.out.println("Roundoff number(nearest 100 multiple): " + roundoff);
    }
}