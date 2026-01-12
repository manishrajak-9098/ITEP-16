// 4) WAP to create a menu and perform all arithmetic operations with integer case and with special symbols
import java.util.Scanner;
class Q4{
    public static void main (String...args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter two no.....");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("\n``````````Airthemetic operation menu`````````");
    System.out.println("Addition (+)");
    System.out.println("Subtraction (-)");
    System.out.println("Multiplication (*)");
    System.out.println("Division (/)");
    System.out.println("Modulus  (%)");
    System.out.println("\n press Special keyword for operation");
    char ch =sc. next().charAt(0);

    int result = 0;

    switch (ch){

      case '+' : result = a+b; break;
      case '_' : result = a-b; break;
      case '*' : result = a*b; break;
      case '/' : result = a/b; break;
      case '%' : result = a%b; break;
      default : System.out.println("invalid value !!!!");
    }
    System.out.println("Result  : "+result);


    }
}