// 3.Create a class to calculate factorial with one data member to store the number and another to store factorial value.
//  Create members function
// 1.init - to input number from user
// 2.fact - to calculate factorial
// 3.display- to display answer


import java . util.Scanner;
class Fact{
   int n;
   int  fact = 1;

    Fact(int n){
        this.n = n;

    
        for(int i = 1; i <= n; i++){
            fact = fact*i;
     } 
 }

    void display(){
        System.out.println("Factorial : "+fact);
    }
}

class Q3{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n..");
        int n = sc.nextInt();
        Fact obj = new Fact(n);
        obj.display();

    }
}