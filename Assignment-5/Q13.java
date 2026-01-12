// 13) WAP to print N natural numbers in reverse order

 import java.util .Scanner;

 class Q13{
    public static void main(String[]ar){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a no.");
        int n = sc.nextInt();
        int i;
         for ( ;n!=0; n--){
            System.out.print(n + " ");
         }
    }
 }