import java.util.Scanner;

class Q1{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter any integer no.");
        int num = sc.nextInt();

        int lastDigit = 0;
        lastDigit=num%10;
        System.out.println("4 th digit position 4 :"+  lastDigit);


        int thirdDigit = 0;
        thirdDigit = num%100;
        int tdigit = thirdDigit/10;
        System.out.println("3 rd digit position 3 :"+  tdigit);


        int secondDigit = 0;
        secondDigit = num%1000;
        int sdigit = secondDigit/100;
        System.out.println("2 nd digit position 2 :"+  sdigit);

        int firstDigit = 0;
        firstDigit = num/1000;
        System.out.println("1 st digit position  1 :"+  firstDigit);

    

    }

}