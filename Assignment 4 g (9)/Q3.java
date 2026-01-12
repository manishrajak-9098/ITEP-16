// 3) WAP to check whether entered character is vowel or not

import java.util.Scanner;
class Q3{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character");
    char ch = sc.next().toLowerCase().charAt(0);
    switch(ch){
        
        case 'a' :
            System.out.println("Vowel");
             break;
        case 'e' :
            System.out.println("vowel");
            break;
        case 'i' :
            System.out.println("Vowel");
             break;
        case 'o' :
            System.out.println("Vowel");
             break;
        case 'u' :
            System.out.println("Vowel");
             break;
        default :
            System.out.println("Not a Vowel");
             break;
    }
    }
    }

    
