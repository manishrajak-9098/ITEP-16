import java.util.Scanner;

 class EvenOdd {
    
     void check(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }
}
class Q13A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOdd obj = new EvenOdd();
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        obj.check(n);
    }
}


