//5) WAP to find out the factorial of a number

 import java.util.Scanner;

class Q5{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter n..");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;
        
        for(i=1;i<=n;i++){

            fact = fact*i;

            System.out.println(fact);
           } 
         }
        }