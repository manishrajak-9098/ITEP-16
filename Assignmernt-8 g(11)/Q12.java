// 12.Create a Class Calculate with two data members(num,num1)Declare two member function.
// a) create parameterized constructor which takes two integer value and	initialize members with this pointer.
// b)sum() :- which displays the number using this

import java .util.Scanner;
class Calculate {
    int num1, num2;
    int sum;

    Calculate(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }
    void sum() {
        // sum = num1+num2;
        System.out.println("Sum of two Number = " + (this.num1+this.num2));
    }

   
}

 class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter two  Number ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Calculate obj = new Calculate(n1, n2);

        obj.sum();
    }
}
