import java.util.Scanner;

class Q27{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a alphabet: ");
    char alpha = sc.next().charAt(0);

    switch (alpha){
        case 'a': 
        case 'e':
        case 'i':
        case 'o':
        case 'u': System.out.println(" It is a vowel");break;
        default:System.out.println("consonant");break;
       }
     }
  }