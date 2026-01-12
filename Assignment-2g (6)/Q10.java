// 10) Perform all arithmetic operations
import java.util.Scanner;
class Q10{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter value 1 . :");
        int  a  =sc.nextInt();
        System.out.println("Enter value 2 . :");
        int  b  =sc.nextInt();
    
        System.out.println("for + operater  :");
        int plus = a+b;
        System.out.println("plus  :"+plus);

        System.out.println("for - operater  :");
        int minus = a-b;
        System.out.println("minus  :"+minus);

        System.out.println("for * operater  :");
        int multi = a*b;
        System.out.println(" multiply  :"+multi);


        System.out.println("for / operater  :");
        int div = a/b;
        System.out.println(" divide  :"+div);


        System.out.println("for % operater  :");
        int mod = a%b;
        System.out.println(" modulus  :"+mod);
        
    
        
    
    }
}
