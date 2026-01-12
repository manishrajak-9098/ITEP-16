// 9) WAP to print N even numbers.

 import java.util .Scanner;

 class Q9{
    public static void main(String[]ar){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a no.");
        int n = sc.nextInt();
        int i;
        for(i=0;n!=0;n--){
          System.out.print(i + " ");
          i=i+2;
        }
    }
    }