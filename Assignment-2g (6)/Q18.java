// 18) Program to check whether entered character is in uppercase or not using conditional operator 
// and if yes, then convert it into lowercase


import java.util.Scanner;

class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase letter");
        } else {
            System.out.println("Not an Uppercase letter");
        }
          if(ch==ch){
            char c = (char)(ch+32);
            System.out.println("convert into lowercase letter : "+c);
          }
          else{
            System.out.println("can't convert into lowercase letter : ");

          }
    
    }
}