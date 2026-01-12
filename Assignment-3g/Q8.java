// 8) Program to check whether entered character is in lowercase or not 
//  and if yes, then convert it into uppercase


import java.util.Scanner;

class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase letter");
        } else {
            System.out.println("Not an loweercase letter");
        }
          if(ch==ch){
            char c = (char)(ch-32);
            System.out.println("convert into uppercase letter : "+c);
          }
          else{
            System.out.println("can't convert into upperercase letter : ");

          }
    
    }
}