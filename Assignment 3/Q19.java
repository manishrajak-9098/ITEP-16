import java.util.Scanner;
class Q19{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st value..");
        int a = sc.nextInt();

        System.out.println("enter 2nd value.");
        int b = sc.nextInt();

         System.out.println("value before swap..");
         System.out.println("value of  a.."+a);
         System.out.println("value of b.."+b);
        
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("value aftere swap..");
        System.out.println("value of a..."+a);
        System.out.println("value of b..."+b);
    
    }
}