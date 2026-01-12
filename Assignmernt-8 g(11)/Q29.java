// 29. Create a Abstract class Volume with two data members(radius and height).
// Declare two member function
// a)getValue() :- which accepts value from user.
// b)showValue() :- which displays valus.
// c)calVol() :- which calculates volumes.
// Create a class Cone which uses the above mentioned three methods to calculate the volume of Cone.
//  Create a class Cylinder which uses the above mentioned three methods to calculate the volume of Cylinder.

import java.util.Scanner;
abstract class Volume {
    double radius;
    double height;

    void getValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius ");
        radius = sc.nextDouble();
        System.out.println("Enter Height ");
        height = sc.nextDouble();
    }

        void showValue(){
            System.out.println("Radius : "+radius);
            System.out.println("Height : "+height);
        }
     abstract double calVol();

    }

class Cone extends Volume{
    @Override
    double calVol(){
        return (Math.PI*radius*radius*height)/3.0;

    }
    @Override
    void showValue(){
       super.showValue();
       System.out.println("volume of cone  : "+calVol());
    }
}
class Cylinder extends Volume{
    @Override
    double calVol(){
        return Math.PI*radius*radius*height;

 }
    @Override
    void showValue(){
    super.showValue();
    System.out.println("Volume of Cylinder : "+calVol());
}
}

class Q29{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);

        System.out.println("````````cone```````");
        Volume obj = new Cone();
        obj.getValue();
        obj.showValue();

        System.out.println("````````cylinder```````");
          Volume obj2 = new Cylinder();
        obj2.getValue();
        obj2.showValue();



    }
}
