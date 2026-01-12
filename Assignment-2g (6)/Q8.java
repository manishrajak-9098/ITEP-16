// 8) WAP to find out compound interest

import java.util.Scanner;

class Q8{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter rate of Interest . :");
        int  rate  =sc.nextInt();
        System.out.println("Enter time . :");
        int  time  =sc.nextInt();
        System.out.println("Enter principle . :");
        int  principle  =sc.nextInt();

        double A_totalamount = principle * Math.pow((1 + rate/100), time );

        double CI= A_totalamount-principle;

         

        System.out.println(" Amount (total amount): "+A_totalamount);
        System.out.println(" compound interest : "+CI);
    
    }
}

