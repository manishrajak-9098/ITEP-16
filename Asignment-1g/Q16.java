// 15) WAP to convert temp from f to c

import java.util.Scanner;

class Q16{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter farenhit :");
        double F =sc.nextInt();

        double C = (F-32)*5/9;

        System.out.println(" Result : "+C +" C");
    }
}