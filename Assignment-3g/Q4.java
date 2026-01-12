// 4) Program to check whether entered character is an alphabet or not  

import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z')|| (ch>='A' && ch<='Z')) {
            System.out.println("Alphabets");
        } else {
            System.out.println("Not Alphabets");
        }
    
    }
    }