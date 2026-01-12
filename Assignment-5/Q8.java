//8) WAP to print Fibonacci series.

 import java.util .Scanner;

 class Q8{
    public static void main(String[]ar){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a no.");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int i =1;

        for(i=1;i<=n;i++){  

            System.out.print(n1 + " ");
            int n3 = n2 +n1 ;
            n1=n2;
            n2 = n3;

        }

    }
 }  
