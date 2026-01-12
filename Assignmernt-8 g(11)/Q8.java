// 8.Write a program to calculate the area of a rectangle, which accepts value from the user and displays it.
//  Use Constructor to initialize members.

import java.util.Scanner;
class Area{
    double length;
    double breath;
    double height;
    double  area;

    Area(double length, double breath, double height){
        this.length = length;
        this.breath = breath;
        this.height = height;

    }
     void calculate(){
        area = length* breath *height;
     }
     void display(){
        System.out.println("Area of Rectangle :"+area);

     }
}
class Q8{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter length, Breath and Height for Area of rectangle");
        double length = sc.nextDouble();
        double breath = sc.nextDouble();
        double height = sc.nextDouble();

        Area obj = new Area(length, breath, height);
        obj.calculate();
        obj.display();
    }
}