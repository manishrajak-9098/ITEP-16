// 19.Create a class Distance with data members (feet and inch).
// Write a program showing the concept of passing object in a function and 
// add the data members of both the objects and find out the total feet and inches.
import.java.util.Scanner;
class Distance{
    float feet;
    float inches;

    void setData(){
        Scanner sc = new Scaner(System.in);
        System.out.println("Enter feet :");
        feet = sc.nextFloat();
        System.out.println("Enter inches :");
        inches = sc.nextFloat();
    
    }
    
}