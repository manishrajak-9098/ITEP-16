// 32.Create a class MathOperation with two data member X and Y to store the operand 
// and third data member R to store result of operation.Create method members
//  init - to input X and Y from user
//  add - to add X and Y and store in R
//  multiply - to multiply X and Y and store in R
//  power - to calculate X Y and store in R
//  display- to display Result R

import java.util.Scanner;

class MathOperation {
    int x;
    int y;
    double R;

    MathOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of X: ");
        x = sc.nextInt();
        System.out.print("Enter value of Y: ");
        y = sc.nextInt();
    }
    void add() {
        R = x + y;
    }
    void multiply() {
        R = x * y;
    }
    void power() {
        R = Math.pow(x, y);
    }
    void display() {
        System.out.println("Result: " + R);
    }
}
class Q32 {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();

        obj.add();
        System.out.print("Addition => ");
        obj.display();

        obj.multiply();
        System.out.print("Multiplication => ");
        obj.display();

        obj.power();
        System.out.print("Power (X^Y) => ");
        obj.display();
    }
}
