// 41) WAP to find out LCM of a number
import java.util.Scanner;
class Q41{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number : ");
        int n = sc.nextInt();

        int i=2;

         int count = 1;
        while(n!=1){
            while(n%i == 0){
                count = count * i;
                System.out.print(i + "* ");
                n = n/i;

            }
            i++;
        }
            System.out.print(" = "+ count);
}
   }