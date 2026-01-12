// 34. WAP to count number of even and odd digits in a 5 digit number

 import java.util.Scanner;

class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5 digit number: ");
        int num = sc.nextInt();

        int evenCount = 0, oddCount = 0;

        for(int i = 1; i <= 5; i++) {
            int digit = num % 10;   // last digit nikalti hai
            if(digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;  // remove last digit 
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}
