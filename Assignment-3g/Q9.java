// 9) Program to check whether entered character is a digit or not and if yes, then replace it by *


import java.util.Scanner;

class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z')|| (ch>='A' && ch<='Z')) {
            System.out.println("Not digit");
        } else {
            System.out.println("entered charecter is digit so, convert into : *  ");
        }
        
    }
    }