
import java.util.Scanner;
class Q30{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

    System.out.println("enter The year " );
    int Year = sc.nextInt();
    int Centuary_year = (Year/100);
 

    if(Year%4==0 && Centuary_year%400==0 )
    System.out.println("the year is leap year");

   
    else
    System.out.println("the year is not leap year");
    }
}