// 31) 1+11+111+1111+11111+…. 


//  1+11+111+1111+11111+…. 
import java.util.Scanner;
class Q32{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int i = 1;
    int term = 1;
    int multiply = 1;
    int sum = 0;

      for(i=1; i<=num; i++){
        System.out.print(term+ " ");
         multiply = multiply *10;
        term = term + multiply;
        sum = sum + term;
    
    }
    System.out.println(sum);
   }
}