// 16) Program to check whether entered character is in lowercase or not using conditional operator 


import java.util.Scanner;

class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase letter");
        } else {
            System.out.println("Not an lowercase letter");
        }

    
    }
}