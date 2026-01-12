// 18.Create a class Max with one data member(v) and functions
// a)getV(): which is use to read variable value
// b)display() : to display value
// c)check() : which return an object of Max class and find maximum value using one objects as argument.
// (use this keyword to return an object).


import java.util.Scanner;
class Max{
    int v ;

   void  getV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value  ");
        v = sc.nextInt();
    }
    void display(){
        System.out.println("Value : "+v);
    }

    Max check(Max obj2){
        if(this.v > obj2.v){
        return this;

        }
        else{
        return obj2;

        } 
    }

}

class Q18{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);

        Max  obj1 = new Max();
        Max obj2 = new Max();

        obj1.getV();
        obj2.getV();

        Max m = obj1.check(obj2);

        System.out.println("Maximum value is : "+m.v);
    
    } 
}