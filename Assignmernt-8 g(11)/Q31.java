// 31.Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
// 1. init - to input radius from user
// 2. calc - to calculate area
// 3. display- to display area
import java.util.Scanner;
class Circle{
    double radius;
    double area;
    Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter A Radius ");
        radius = sc.nextDouble();
    }
    void calArea(){
        area = Math.PI*radius*radius;
    }
    void display(){
        System.out.println("Area of circle : "+area);
    }
}
class Q31{
    public static void main(String...args){
        Circle obj = new Circle();
        obj.calArea();
        obj.display();
    }
}