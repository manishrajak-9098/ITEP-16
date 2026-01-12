// 17) Program to check whether entered character falls in the category of special symbol or not


import java.util.Scanner;

class Q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z')|| (ch>='A' && ch<='Z')|| (ch>='0' && ch<='9')) {
            System.out.println("entered character in not special Symbols");
        } else {
            System.out.println("entered character in special Symbols  ");
        }
        
    }
    }