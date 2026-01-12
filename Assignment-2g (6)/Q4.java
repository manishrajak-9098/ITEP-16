// 4) WAP to convert temp from c to f

import java.util.Scanner;

class Q4{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter celcius :");
        double C =sc.nextInt();

        double F = (C*9/5)+32;

        System.out.println(" Result : "+F +" F");
    }
}