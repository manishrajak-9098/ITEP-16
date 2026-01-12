

import java.util.Scanner;
class Q11{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

    System.out.println("enter The age " );
    int age = sc.nextInt();

    System.out.println("enter The gender M or F" );
    char Gender = sc.next().charAt(0);

    System.out.println("enter The Matrial status y or n " );
    char maritialstatus = sc.next().charAt(0);

if(Gender=='f' || Gender == 'F')
System.out.println("she work on urban areas");

else if(Gender=='m' || Gender == 'M' && age>19 && age<41)
System.out.println("work anywhere");

else if(Gender=='m' && age>40 && age<61)
System.out.println("they work only on urban areas");

else
System.out.println("ERROR");
    }
}