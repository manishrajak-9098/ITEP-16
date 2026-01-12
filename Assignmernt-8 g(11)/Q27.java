// 27. Create a class Shape with one member function
// a) double calcArea()
// Create a class Rectangle with two data members (length and breadth) and inherits Shape and calculate the area
// Create a class Circle with one data members (radius) and inherits Shape and calculate the area

import java.util.Scanner;
class Shape{
     double calcArea(){
     return 0;
    }
}
class Rectangle extends Shape{
    double length;
   double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double calcArea(){
        return length*breadth;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double calcArea(){
        return Math.PI * radius*radius;
    }
}

class Q27{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length for rectangle ");
        double length = sc.nextInt();

        System.out.println("Enter breadth rectangle ");
        double breadth = sc.nextInt();

        Rectangle re = new Rectangle(length,breadth);
        System.out.println("Area of rectangle : "+re.calcArea());

        System.out.println("Enter Radius for circle ");
        double radius = sc.nextInt();

        Circle cr = new Circle(radius);
        System.out.println("Area of circle : "+cr.calcArea());
        

    }
}
