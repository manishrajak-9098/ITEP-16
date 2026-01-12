// 11.Create a Class Number with two member function.
// a)showNum() :- which displays the first number using this
// b)dispNum() :- which displays the second number using this

import java .util.Scanner;
class Number {
    int num1, num2;

    Number(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }
    void showNum() {
        System.out.println("First Number = " + this.num1);
    }

    void dispNum() {
        System.out.println("Second Number = " + this.num2);
    }
}

 class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter two  Number ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Number obj = new Number(n1, n2);

        obj.showNum();
        obj.dispNum();
    }
}
