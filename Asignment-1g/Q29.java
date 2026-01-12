//28) WAP to check whether entered number is prime or not.

 import java.util.Scanner;

class Q29{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter n..");
        int n = sc.nextInt();
        int i = 1;
        int count = 0;
        for (i=1;i<=n;i++){
           if (n%i==0)
            count++;
           
        }
         if (count==2)
         System.out.println("its a prime no..");
         else
         System.out.println("its not a prime no..");
    }
}
