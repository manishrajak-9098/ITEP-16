import java.util.Scanner;
class Q31{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter days: ");
        int totalDays = sc.nextInt();

        int year = totalDays / 365;
        totalDays = totalDays % 365;
        int week = totalDays / 7;
        totalDays = totalDays % 7;

        System.out.println(year+" years "+week+" weeks "+totalDays+" days ");
   }
}