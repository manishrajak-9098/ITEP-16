// 31. WAP to interchange second and last second digit of a 5 digit number
// Ex: 23123 O/p: 22133

import java.util.Scanner;
class Q31{
    public static void main(String[] kk){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter a five digit number : ");
     int n = sc.nextInt();
     int   d1 = n/10000;
     int d2 = (n/1000)%10;
     int  d3 = (n/100)%10;
     int  d4 = (n/10)%10;
     int  d5 = (n%10);
        int temp = d2;
        d2 = d4;
        d4 = temp;
        int res = d1*10000 + d2*1000 + d3*100+ d4*10 +d5;
        System.out.print(res);   
    }
}