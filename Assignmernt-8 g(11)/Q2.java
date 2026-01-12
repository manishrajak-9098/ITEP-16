// 2.Create a class to calculate addition of two numbers (data member) using following member functions.
//  Create members function
// 1.init - to input numbers from user
// 2.add - to calculate and display result

import java .util.Scanner;

class Add {
    int a;
    int b;
    int sum;

    Add(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        sum = a+b;
        System.out.println("Result := "+sum);
    }

}

class Q2{
    public static void main (String argd[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter two number ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Add obj = new Add(a, b);
    
        obj.display();

    }
}