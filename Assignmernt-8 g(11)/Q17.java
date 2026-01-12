// 17.Create a class Box with data members (boxlabel, length , width, height) and function that calculate 
// and return volume of that box. Now create a function comapre that take an object of Box class as parameters and 
// show boxlabel of object who’s volume is greater?. you need to create two object of Box
// class to compare.

import java.util.Scanner;
class Box{
 String boxLabel;
 double length;
 double width;
 double height;

 Box(String boxLabel, double length, double width, double height){
    this.boxLabel = boxLabel;
    this.length = length;
    this.width = width;
    this.height = height;
 } 
double cal_Volume(){
    return length*width*height;
}

void compare( Box b2){
    double vol1 = this.cal_Volume();//current obj
    double vol2 = b2.cal_Volume();//argument me diya h vo

        System.out.println("\nVolume of " + this.boxLabel + " : " + vol1);
        System.out.println("Volume of " + b2.boxLabel + " : " + vol2);

        if (vol1 > vol2) {
            System.out.println("Box with greater volume: " + this.boxLabel);
        } else if (vol2 > vol1) {
            System.out.println("Box with greater volume: " + b2.boxLabel);
        } else {
            System.out.println("Both boxes have equal volume.");
        }
}
} 
class Q17{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter box label");
        String boxLabel1= sc.nextLine();
        System.out.println("Enter length, Width and Height ");
        double length1 = sc.nextDouble();
        double width1 = sc.nextDouble();
        double height1 = sc.nextDouble();
        sc.nextLine();

        Box b1 = new Box(boxLabel1, length1, width1, height1);

        System.out.println("\nEnter box label ");
        String boxLabel2= sc.nextLine();
        System.out.println("Enter length, Width and Height ");
        double length2 = sc.nextDouble();
        double width2 = sc.nextDouble();
        double height2 = sc.nextDouble();

        Box b2 = new Box(boxLabel2, length2, width2, height2);

         b1.compare(b2);
     }

    }
